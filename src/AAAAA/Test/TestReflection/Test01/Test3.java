package AAAAA.Test.TestReflection.Test01;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/31 - 0:35
 * @Description:
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码信息
        Class cls = Student.class;

        //获取方法
        //getMethods:返回Class对象所对应类的所有public方法还有所有父类(容易被忽略的Object类)中的方法（被public修饰）
        Method[] methods = cls.getMethods();
        for (Method m :methods) {
            System.out.println(m);
        }

        System.out.println("------------------------------------");

        //getDeclaredMethods：返回Class对象所对应类的所有成员方法，与访问权限无关（这次这里面就没有Object的方法了）
        Method[] methods1 = cls.getDeclaredMethods();
        for (Method m :methods1) {
            System.out.println(m);
        }

        System.out.println("------------------------------------");

        //获取指定的public方法
        Method happy1 = cls.getMethod("happy");
        System.out.println(happy1);
        Method happy2 = cls.getMethod("happy", String.class);
        System.out.println(happy2);
        //获取指定的非public方法
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);

        System.out.println("------------------------------------");

        //获取方法的具体结构
        //名字
        System.out.println(work.getName());
        //修饰符
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //返回值
        System.out.println(work.getReturnType());
        //参数列表
        Class[] parameterTypes = work.getParameterTypes();
        for (Class c:parameterTypes) {
            System.out.println(c);
        }
        //注解
        Method mapa = cls.getMethod("mapa");
        Annotation[] annotations = mapa.getAnnotations();
        //因为@Override的元注释中标的是RetentionPolicy.SOURCE，而@MyAnnotation的是RetentionPolicy.RUNTIME
        //只有标有RUNTIME的注释才能在运行时被检测到
        for (Annotation a:annotations) {
            System.out.println(a);
        }
        //异常
        Class[] exceptionTypes = mapa.getExceptionTypes();
        for (Class c:exceptionTypes) {
            System.out.println(c);
        }

        System.out.println("------------------------------------");

        //调用方法
        Object obj = cls.getDeclaredConstructor().newInstance();
        mapa.invoke(obj);

        System.out.println("------------------------------------");

    }
}
