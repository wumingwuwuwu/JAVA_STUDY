package wofuhuola.jinjie.fanxing;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型
 * 	(1)泛型：是一种把明确数据类型的工作推迟到创建对象或者调用方法的时候采取明确的特殊的数据类型。
 * 	(2)格式：
 * 		<数据类型>
 * 	(3)好处：
 * 		A:提高了程序的安全性
 * 		B:把运行时期异常提前到了编译期
 * 		C:避免了强制类型转换
 * 	(4)在哪些地方使用泛型?
 * 		看API即可，如果类，抽象类，接口后面跟有<...>说明这里需要使用
 * 	(5)泛型的由来(理解)
 * 		A:泛型的由来
 * 		B:泛型类
 * 		C:泛型方法
 * 		D:泛型接口
 * 		E:泛型高级
 * 	(6)案例：
 * 		把前面的集合案例用泛型改进。
 */
public class FanXingDemo {

    /**
     *泛型高级：
     *泛型通配符<?>
     *		任意类型，如果没有明确，那么就是Object以及任意的Java类了
     *? extends E
     *		向下限定，E及其子类
     *? super E
     *		向上限定，E及其父类
     *泛型的应用场景
     * 1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口
     * 2.如果类型不确定，但是能知道以后之恶能传递某个继承体系中的，就可以用泛型的通配符
     */
    public static void main(String[] args) {
        // 泛型通配符<?>
        Collection<?> c1 = new ArrayList<Animal>();
        Collection<?> c2 = new ArrayList<Dog>();
        Collection<?> c3 = new ArrayList<Cat>();
        Collection<?> c4 = new ArrayList<Object>();
        System.out.println("--------------------");

        // ? extends E：表示可以传递E或者E的所有子类
        Collection<? extends Animal> c5 = new ArrayList<Animal>();
        Collection<? extends Animal> c6 = new ArrayList<Dog>();
        Collection<? extends Animal> c7 = new ArrayList<Cat>();
        // Collection<? extends Animal> c8 = new ArrayList<Object>();
        System.out.println("--------------------");

        // ? super E：表示可以传递E或者E的所有父类
        Collection<? super Animal> c9 = new ArrayList<Animal>();
        // Collection<? super Animal> c10 = new ArrayList<Dog>();
        // Collection<? super Animal> c11 = new ArrayList<Cat>();
        Collection<? super Animal> c12 = new ArrayList<Object>();
    }
}
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
