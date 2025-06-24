package wofuhuola.jinjie.X7_Set.HASHSet;

import java.util.HashSet;

/**
 * HashSet
 * 底层用哈希表存储数据。
 * 哈希表：数组、链表、红黑树
 * 哈希值：对象的整数表现形式。根据hashcode()方法计算的int整数，默认用对象地址值一般重写hashcode用对象内部属性值计算
 * 重写后对象的属性值相同哈希值就相同
 */
public class HashSetDemo {
    public static void main(String[] args) {
        /**
         * hashset怎么保证数据去重
         * 用hashcode方法和equals方法
         * if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
         * 因为一般hashcode需要重写，所以哈希值是和属性值挂钩的，如果属性值相同哈希值也相同，反过来通过哈希值是否相同就能筛选相同属性的对象了
         * 哈希值相同再根据equals判断内容是否相同，如果相同不存不同再存
         */

        // HashSet存储字符串元素
        HashSet<String> hs = new HashSet<String>();

        System.out.println(hs.add("hello"));
        System.out.println(hs.add("world"));
        System.out.println(hs.add("java"));
        System.out.println(hs.add("hello"));

        System.out.println("hs:" + hs);

        //哈希碰撞，对象的哈希值有可能相同
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

        // 创建集合对象
        HashSet<Person> hashSet = new HashSet<Person>();

        // 创建元素对象
        Person p1 = new Person("吕洞宾", 30);
        Person p2 = new Person("何仙姑", 22);
        Person p3 = new Person("曹国舅", 25);
        Person p4 = new Person("铁拐李", 35);
        Person p5 = new Person("张果老", 33);
        Person p6 = new Person("蓝采和", 22);
        Person p7 = new Person("何仙姑", 22);
        Person p8 = new Person("铁拐李", 18);
        Person p9 = new Person("张果老", 33);

        // 把元素添加到集合
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        hashSet.add(p5);
        hashSet.add(p6);
        hashSet.add(p7);
        hashSet.add(p8);
        //p9和p4相同所以不存
        hashSet.add(p9);
        //false
        System.out.println(hashSet.add(p9));

        // 遍历集合
        for (Person  p : hashSet) {
            System.out.println(p.getName() + "---" + p.getAge());
        }

    }
}
