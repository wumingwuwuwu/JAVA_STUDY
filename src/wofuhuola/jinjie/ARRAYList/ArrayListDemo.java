package wofuhuola.jinjie.ARRAYList;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 数据结构
 * 数据结构常用结构：栈、队列、数组、链表、二叉树、二叉查找树、平衡二叉树、红黑树
 * 数据结构的核心：数据结构的形态、查找元素的方式、增删元素的方式
 */
/**
 * List:
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 *
 * 面试题：ArrayList，Vector和LinkedList的各自特点?
 *
 * 思考题：ArrayList，Vector和LinkedList我们到底使用谁呢?
 * 			看情况
 *
 * 			要安全吗?
 * 				要：Vector(这个现在也不常用，在Collections里面有新的方式)
 * 				不要：ArrayList和LinkedList
 * 					查询多：ArrayList
 * 					增删多：LinkedList
 *
 * 		不知道用哪个，就用ArrayList。
 *
 * 需求：用ArrayList存储字符串并遍历
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1) ;
        // 创建集合对象
        ArrayList array = new ArrayList();

        // 创建元素对象
        Student s1 = new Student("朱元璋", 50);

        Student s2 = new Student();
        s2.setName("李世民");
        s2.setAge(60);

        Student s3 = new Student("秦始皇", 40);

        // 把元素添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);

        // 遍历集合
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("-----------------");

        for (int x = 0; x < array.size(); x++) {
            Student s = (Student) array.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
        // 三国演义小集合
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("吕布");
        sgyy.add("典韦");
        sgyy.add("赵云");

        // 红楼梦小集合
        ArrayList<String> hlm = new ArrayList<String>();
        hlm.add("贾宝玉");
        hlm.add("林黛玉");
        hlm.add("王熙凤");
        hlm.add("秦可卿");

        // 水浒传小集合
        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        shz.add("李逵");
        shz.add("卢俊义");
        shz.add("索超");
        shz.add("吴用");

        // 西游记小集合
        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("白骨精");
        xyj.add("观音姐姐");
        xyj.add("孙悟空");
        xyj.add("牛魔王");
        xyj.add("红孩儿");

        // 代表名著的大集合
        ArrayList<ArrayList<String>> sdmz = new ArrayList<ArrayList<String>>();
        sdmz.add(sgyy);
        sdmz.add(hlm);
        sdmz.add(shz);
        sdmz.add(xyj);

        // 遍历集合
        for (ArrayList<String> array1 : sdmz) {
            for (String s : array1) {
                System.out.print(s + " ");
            }
            System.out.println(array1);
            System.out.println();
        }

    }
}
