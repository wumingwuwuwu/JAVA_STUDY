package wofuhuola.jichu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  Collection集合(掌握)
 * 	(1)集合的由来
 * 		我们学习的是面向对象的语言，而面向对象的语言常见的操作就是操作对象。
 * 		为了方便我们对多个对象进行操作，我们可以使用对象数组来进行。
 * 		但是对象数组的长度是固定的，不适应变化的需求，所以，java就提供了集合
 * 		供我们来使用。
 * 	(2)集合的特点
 * 		A:长度可变
 * 		B:只能存储引用类型
 * 		C:可以存储多种引用类型
 * 	(3)数组和集合的区别
 * 		A:数组的长度固定;数组可以存储基本类型，也可以存储引用类型;数组存储的是同一种数据类型的元素
 * 		B:集合的长度可变;集合只能存储引用类型;集合可以存储多种引用类型。
 * 	(4)集合的继承体系结构
 * 		多种集合类的数据结构不同，但是功能相似，所以，我们不断的向上抽取，就形成了集合的继承体系结构
 * 			Collection
 * 				|--List
 * 					|--ArrayList
 * 					|--Vector
 * 					|--LinkedList
 * 				|--Set
 * 					|--HashSet
 * 					|--TreeSet
 *
 * 		面对这样的继承体系结构,我们该学习谁,使用谁呢?
 * 			学习：顶层，因为顶层定义的是共性功能。
 * 			使用：底层，因为底层才是具体的实现类，并且具有最多的功能。
 * 	(5)Collection的功能概述：(自己补齐中文意思)
 * 		A:添加功能
 * 			add(Object obj)
 * 			addAll(Collection c)
 * 		B:移除功能
 * 			remove(Object obj)
 * 			removeAll(Collection c)
 * 			clear()
 * 		C:判断功能
 * 			contains(Object obj)
 * 			containsAll(Collection c)
 * 			isEmpty()
 * 		D:获取功能
 * 			iterator()
 * 			size()
 * 		E:交集功能
 * 			retainAll(Collection c)
 * 		F:转数组功能
 * 			toArray()
 *
 * 		注意：
 * 			所有带all的不用掌握
 * 			交集和转数组不用掌握
 * 	(6)迭代器的使用
 * 		A:迭代器的使用
 * 			依赖于集合存在,本身有两个方法
 * 			a:hasNext()
 * 			b:next()
 * 		B:集合的使用步骤
 * 			a:创建集合对象
 * 			b:创建元素对象
 * 			c:把元素添加到集合中
 * 			d:遍历集合
 * 				通过集合对象获取迭代器对象
 * 				通过迭代器对象的hasNext()方法判断是否有元素
 * 				通过迭代器对象的next()方法获取元素，并移动到下一个位置
 * 		C:迭代器的原理
 * 			定义为了接口，由具体的集合类通过内部类的方式提供实现。
 * 	(7)案例：
 * 		A:Collection存储字符串并遍历
 * 			Collection c = new ArrayList();
 *
 * 			c.add("hello");
 * 			c.add("world");
 * 			c.add("java");
 *
 * 			Iterator it = c.iterator();
 * 			while(it.hasNext()) {
 * 				String s = (String) it.next();
 * 				System.out.println(s);
 * 			            }
 * 		B:Collection存储自定义对象并遍历
 * 			Collection c = new ArrayList();
 *
 * 			Student s1 = new Student("林青霞",18);
 * 			Student s2 = new Student("风清扬",21);
 * 			Student s3 = new Student("赵雅芝",60);
 *
 * 			c.add(s1);
 * 			c.add(s2);
 * 			c.add(s3);
 *
 * 			Iterator it = c.iterator();
 * 			while(it.hasNext()) {
 * 				Student s = (Student) it.next();
 * 				System.out.println(s.getName()+"---"+s.getAge());
 *            }
 */
public class text015 {

    public static void main(String[] args) {
        /**
         * A:添加功能
         * 		boolean add(Object obj):往集合中添加一个元素
         * 		boolean addAll(Collection c):往集合中添加多个元素。
         * B:获取功能
         * 		Iterator iterator():迭代器
         * 		int size():集合的元素个数，长度
         * C:删除功能
         * 		void clear():清空集合的所有元素
         * 		boolean remove(Object obj):从集合中移除一个元素
         * 		boolean removeAll(Collection c):从集合中移除多个元素
         * D:判断功能
         * 		boolean contains(Object obj):判断集合中是否包含指定的元素
         * 		boolean containsAll(Collection c):判断集合中是否包含指定的多个元素
         * 		boolean isEmpty():判断集合是否为空
         * E:交集元素
         * 		boolean retainAll(Collection c)
         * F:转数组
         * 		Object[] toArray():把集合转成对象数组
         */
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("wuzeyu");

        // int size():集合的元素个数，长度
        System.out.println("size:" + c.size());

        System.out.println("c:" + c);

        // boolean isEmpty():判断集合是否为空
        System.out.println("isEmpty:" + c.isEmpty());

        // void clear():清空集合的所有元素
        c.clear();

        // boolean add(Object obj):往集合中添加一个元素
        System.out.println("add:" + c.add("hello"));
        System.out.println("add:" + c.add("world"));

        // boolean remove(Object obj):从集合中移除一个元素
        System.out.println("remove:" + c.remove("world"));
        System.out.println("remove:" + c.remove("javaee"));

        // boolean contains(Object obj):判断集合中是否包含指定的元素
        System.out.println("contains:" + c.contains("hello"));

        System.out.println("c:" + c);
        System.out.println("add:" + c.add("world"));
        System.out.println("add:" + c.add("JAVA"));

        // Object[] toArray():把集合转成对象数组
        Object[] objs = c.toArray();
        // 遍历数组
        for (Object obj : objs) {
            // System.out.println(objs[x]);
            String s = (String) obj;
            System.out.println(s);
        }
        c.clear();
        // 创建元素对象
        Student222 s1 = new Student222("林黛玉", 18);
        Student222 s2 = new Student222("秦可卿", 20);
        Student222 s3 = new Student222("王熙凤", 22);

        // 把学生对象添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        // c.add(new Student("贾宝玉", 20));

        // 遍历集合
        objs = c.toArray();
        for (Object obj : objs) {
            Student222 s = (Student222) obj;
            System.out.println(s.getName() + "---" + s.getAge());
        }

        /**
         * Iterator iterator()
         * 		boolean hasNext():是否有下一个元素
         * 		Object next():获取当前元素,并自动移动到下一个位置等待
         *
         * 		NoSuchElementException:没有这样的元素异常。
         * 		原因是：你已经获取到元素的末尾了，你还要获取元素，已经没有元素了，所以报错。
         */
        c.clear();
        c.add("hello");
        c.add("world");
        c.add("JAVA");
        // 集合中的方法：Iterator iterator()
        Iterator it = c.iterator();// 右边其实是接口的实现类对象，这是多态的应用
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        while (it.hasNext()) {
            // System.out.println(it.next());
            String s = (String) it.next();
            System.out.println(s);
        }


        Collection<Student222> c2 = new ArrayList();
        Student222 s11 = new Student222("qwe",12);
        Student222 s12 = new Student222("asd",13);
        Student222 s13 = new Student222("zxc",14);
        c2.add(s11);
        c2.add(s12);
        c2.add(s13);
        Iterator iterator = c2.iterator();
        while (iterator.hasNext()) {
            // 通过迭代器对象的next()方法获取元素,并转换为你存储的元素类型
            Student222 ssss = (Student222) iterator.next();
            // 直接输出对象的名称，输出的是地址值，没有什么意义。
            // 如何解决呢?A:重写对象所属类的toString()方法。B:通过对象调用getXxx()方法
            System.out.println(ssss.getName() + "---" + ssss.getAge());
        }



    }
}
class Student222 {
    private String name;
    private int age;

    public Student222() {
        super();
    }

    public Student222(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
