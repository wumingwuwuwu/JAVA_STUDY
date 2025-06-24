package wofuhuola.jinjie.X7_Set.LINKEDHashSet;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet 有序、不重复、无索引
 * 存取顺序一致 存储用哈希表，存储时会记录前后数据的地址值也就是双链表
 * 底层是哈希表加双链表
 * 遍历时用双链表
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> link = new LinkedHashSet<String>();

        link.add("ccc");
        link.add("hello");
        link.add("bbb");
        link.add("world");
        link.add("aaa");
        link.add("java");
        link.add("java");
        System.out.println(link.add("aaa"));
        System.out.println("link:" + link);
    }
}
