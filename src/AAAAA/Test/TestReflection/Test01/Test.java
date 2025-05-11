package AAAAA.Test.TestReflection.Test01;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 10:10
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 案例 ； 以Person的字节码信息为案例
        //方法一：通过getClass()方法获取
        Person  p = new Person();
        Class c1 = p.getClass();

        //方法二：通过内置class属性
        Class c2 = Person.class;
        System.out.println(c2);
        System.out.println(c1 == c2);

        //注意：方法一和方法二不常用

        //方法三；一般用这个，调用静态方法forName
        Class c3 = Class.forName("AAAAA.Test.TestReflection.Test01.Person");

        //方法四：利用类的加载器（扩展了解）
        //因为所有类都是用一个
        ClassLoader loader = Test.class.getClassLoader();//Test为当前类的类名
        Class c4 = loader.loadClass("AAAAA.Test.TestReflection.Test01.Person");

    }
}
