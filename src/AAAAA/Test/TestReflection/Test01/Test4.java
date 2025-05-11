package AAAAA.Test.TestReflection.Test01;

import java.lang.annotation.Annotation;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/31 - 10:00
 * @Description:
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        //获取字节码信息
        Class cls = Student.class;

        //getInterfaces获取运行时类的接口
        Class[] interfaces = cls.getInterfaces();
        for (Class c:interfaces) {
            System.out.println(c);
        }

        //得到父类的接口
        //先得到父类的字节码信息
        Class superclass = cls.getSuperclass();

        //得到接口
        Class[] interfaces1 = superclass.getInterfaces();
        for (Class c:interfaces1) {
            System.out.println(c);
        }

        System.out.println("--------------------------------------------------");

        //获取运行时类所在的包
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());

        System.out.println("--------------------------------------------------");

        //获取运行时类的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }

        System.out.println("--------------------------------------------------");

    }
}
