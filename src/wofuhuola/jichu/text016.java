package wofuhuola.jichu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * Collection
 *	 	List:元素有序(存储顺序和取出顺序一致),元素可重复。
 *		Set:元素无序,元素唯一
 * 需求：用List集合存储字符串并遍历。
 */

/**
 * 1：Collection集合体系结构
 * 	Collection
 * 		|--List(元素有序，可重复)
 * 			|--ArrayList
 * 				底层数据结构是数组，查询快,增删慢
 * 				线程不安全,效率高
 * 			|--Vector
 * 				底层数据结构是数组，查询快,增删慢
 * 				线程安全,效率低
 * 			|--LinkedList
 * 				底层数据结构是链表，查询慢,增删快
 * 				线程不安全,效率高
 * 		|--Set(元素无序，唯一)
 * 			|--HashSet
 * 				底层数据结构是哈希表。
 * 				保证元素的唯一性?
 * 					依赖两个方法hashCode()和equals()。
 * 				|--LinkedHashSet
 * 					底层数据结构是哈希表和链表
 * 						由哈希表保证元素唯一
 * 						由链表保证元素有序
 * 			|--TreeSet
 * 				底层数据结构是二叉树(红黑树)
 * 				保证元素的唯一性?
 * 					根据比较的返回值是否是0
 * 				保证元素的排序?
 * 					自然排序
 * 					比较器排序
 *
 * 2：针对Collection，你准备使用谁?
 * 	元素唯一吗?
 * 		是：Set
 * 			要排序吗?
 * 				是：TreeSet
 * 				否：HashSet
 *
 * 			不知道，就用HashSet
 * 		否：List
 * 			要安全吗?
 * 				要：Vector(其实也不用，有更好的方式，后面讲)
 * 				不要：ArrayList或者LinkedList
 * 					查询多：ArrayList
 * 					增删多：LinkedList
 *
 * 			不知道，就用ArrayList
 *
 * 	不知道，就用ArrayList
 *
 * 3：集合中的数据结构问题
 * 	ArrayXxx:底层数据结构是数组，查询快，增删慢
 * 	LinkedXxx:底层数据结构是链表，查询慢，增删快
 * 	HashXxx:底层数据结构是哈希表。依赖两个方法hashCode()和equals()，根据情况选择是否自动重写
 * 	TreeXxx:底层数据结构是二叉树。有两种方案：自然排序，比较器排序。
 */
public class text016 {
    public static void main(String[] args) {
        // 创建集合对象
        List list = new ArrayList();

        // 创建并添加元素
        list.add("诸葛亮");
        list.add("司马懿");
        list.add("曹操");

        // 遍历集合
        //创建一个指向集合首的“指针”（结合c语言中数组名指向数组地址具体指向数组地址的首元素）
        //这里it创立的时候指向list集合的首地址
        Iterator it = list.iterator();
        //.hasNext(),表明指向当前“指针”指向元素是否为空
        while (it.hasNext()) {
            //.next()返回“指针”当前元素并将指针后移一位
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println(list);

        //增强for循环遍历
        //修改for循环中的变量，不会影响集合原本数据
        for(Object c : list){
            c = c + "1";
            System.out.println(c);
        }

        //lambda遍历集合 default void foreach(Consumer<? super T>action):
        //o依次表示集合中的每一个数据
        //.forEach内部同样是for循环，o同样是只是第三方变量
        list.forEach(o -> o = o +"2" );
        list.forEach(o -> {
                System.out.println(o);
            }
        );
        list.forEach(o -> System.out.println(o));
        /*匿名内部类的方式
        list.forEach(new Consumer() {
            @Override
            //o依次表示集合中的每一个数据
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        * */
        /**
         * List集合的特有功能：
         * 		void add(int index,Object obj):在指定索引位置添加元素
         *		Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
         *		Object get(int index):根据给定索引，返回元素
         *		Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
         */
        //void add(int index,Object obj):在指定索引位置添加元素
        list.add(1,"关羽");
        System.out.println(list);

        //Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
        System.out.println("remove:"+list.remove(2));

        //Object get(int index):根据给定索引，返回元素
        System.out.println("get:"+list.get(2));

        //Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
        System.out.println("set:"+list.set(1,"刘备"));

        System.out.println(list);

        for (Object o : list) {
            // System.out.println(list.get(x));
            String s = (String) o;
            System.out.println(s);
        }

        /**
         * 1. 核心区别
         * | 特性 | ListIterator | Iterator |
         * |--------|----------------------------------------|--------------------------------|
         * | 所属接口 | List 特有 | 所有 Collection 通用 |
         * | 遍历方向 | 双向（支持向前/向后遍历） | 单向（仅向后遍历） |
         * | 修改操作 | 支持 add()、set()、remove() | 仅支持 remove() |
         * | 获取索引 | 有 nextIndex() 和 previousIndex() | 无索引相关方法 |
         * | 并发安全 | 允许在遍历时修改集合 | 修改集合会抛 ConcurrentModificationException |
         */
        list.add(0,"world");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("world".equals(s)) {
                lit.add("android");
            }
        }
        System.out.println(list);

    }
}
