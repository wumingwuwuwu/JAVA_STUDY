package AAAAA.Test.TestReflection.Test01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 21:37
 * @Description:
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        //获取运行时类的字节码信息
        Class cls = Class.forName("AAAAA.Test.TestReflection.Test01.Student");
        //获取属性
        //getFields:获取运行时类和父类中被public修饰的属性
        Field[] fields = cls.getFields();
        for (Field f: fields ) {
            System.out.println(f);
        }

        System.out.println("-----------------------------");

        //getDeclaredFields:返回Class对象所对应类的所有成员变量，与访问权限无关
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field f: declaredFields) {
            System.out.println(f);
        }

        System.out.println("-----------------------------");

        //getField:返回Class对象所对应类对应类的名为name的public成员变量
        Field score = cls.getField("score");
        System.out.println(score);
        //getDeclaredField:返回Class对象所对应类对应类的名为name的非public成员变量
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);

        System.out.println("-----------------------------");

        //属性的具体结构：
        //获取修饰符
        int modifiers = sno.getModifiers();
        //常用：public -- 1,private -- 2,protected -- 4,static -- 8,final -- 10
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));
        //获取属性的数据类型
        Class type = sno.getType();
        System.out.println(type);
        //获取属性名
        String name = sno.getName();
        System.out.println(name);

        System.out.println("-----------------------------");

        //给属性赋值：
        //给属性赋值必须要有对象，因为除了static属性其他的属性是依附于其类的一个对象
        //因此有必要说明给哪个对象的属性设值，static的直接写null就行
        Field sco = cls.getField("score");
        //下面中的cls.newInstance()在JDK9前还可以使，9之后就被标记为弃用需要加getDeclaredConstructor()
        Object obj = cls.getDeclaredConstructor().newInstance();
        sco.set(obj,150);
        System.out.println(obj);

        System.out.println("-----------------------------");



    }
}
