package wofuhuola.jinjie.X7_Set.TREESet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet 不重复、无索引、可排序（默认从大到小排列）
 * 底层是红黑树
 *
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        // TreeSet<Person> ts = new TreeSet<Person>();
        // TreeSet(Comparator comparator)
        // 构造一个新的空 TreeSet，它根据指定比较器进行排序。
        TreeSet<Person> ts = new TreeSet<Person>();

        // 创建人对象
        Person p1 = new Person("tangseng", 30);
        Person p2 = new Person("jiapingwa", 25);
        Person p3 = new Person("zhangyimou", 25);
        Person p4 = new Person("xijinping", 26);
        Person p5 = new Person("yanni", 27);
        Person p6 = new Person("wenzhang", 30);
        Person p7 = new Person("tianliang", 28);
        Person p8 = new Person("xijinping", 26);

        // 添加元素
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);
        ts.add(p7);
        ts.add(p8);

        for (Person p : ts) {
            System.out.println(p.getName() + "---" + p.getAge());
        }

        TreeSet<String> ts1 = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //先按长度排序
                int i = o1.length() - o2.length();
                //如果一样长则按首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;

            }
        });

        ts1.add("ab");
        ts1.add("df");
        ts1.add("c");
        ts1.add("qwer");

        for (String s : ts1){
            System.out.println(s);
        }

    }

}
