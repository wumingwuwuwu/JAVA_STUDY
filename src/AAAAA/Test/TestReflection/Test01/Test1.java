package AAAAA.Test.TestReflection.Test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 15:12
 * @Description:
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码信息
        Class cls = Student.class;

        //通过字节码信息可以获得构造器
        //getConstructors:返回Class对象所对应类的所有public构造方法
        Constructor[] c1 = cls.getConstructors();
        for (Constructor c:c1) {
            System.out.println(c);
        }

        System.out.println("------------------------------------");

        //getDeclaredConstructors:返回Class对象所对应类的指定参数列表的构造方法，与访问权限无关
        Constructor[] c2 = cls.getDeclaredConstructors();
        for (Constructor c : c2) {
            System.out.println(c);
        }

        System.out.println("------------------------------------");

        //getConstructor:获取指定参数列表的public构造器
        //如果什么都不加，就默认获取空构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);
        //获取参数为“double、double”的有参构造器
        Constructor con2 = cls.getConstructor(double.class, double.class);
        System.out.println(con2);

        //getDeclaredConstructor获取指定参数列表的非public构造器
        //获取参数为“int、double、double”的有参构造器
        Constructor con3 = cls.getDeclaredConstructor(int.class, double.class, double.class);
        System.out.println(con3);

        System.out.println("------------------------------------");

        //有了构造器以后就可以创建对象
        Object o1 = con1.newInstance();
        System.out.println(o1);
        Object o2 = con3.newInstance(12,12.5,125.3);
        System.out.println(o2);


    }
}
