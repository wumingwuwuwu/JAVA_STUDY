package wofuhuola.jinjie.X7_Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set集合(理解)
 * 	(1)Set集合的特点
 * 		无序，唯一
 * 	(2)HashSet集合(掌握)
 * 		A:元素唯一
 * 		B:如何保证元素唯一呢?
 * 			HashSet集合的底层数据结构是哈希表。
 * 			哈希表保证元素唯一性依赖两个方法：hashCode()和equals()
 * 			步骤：
 * 				a:首先判断对象的哈希值是否相同
 * 				b:如果不同，就直接添加到集合
 * 				  如果相同，就继续执行equals()进行比较
 * 				c:如果返回false，就直接添加到集合
 * 				  如果返回true，说明元素重复，不添加。
 * 		C:不用担心
 * 			遇到HashXxx格式的集合，要记住重写两个方法即可。并且，这两个方法是可以自动生成的
 * 	(3)LinkedHashSet
 * 		底层数据结构是哈希表和链表。
 * 		由哈希表保证元素的唯一性。
 * 		由链表保证元素的有序。(存储顺序和取出顺序一致)
 * 	(4)TreeSet集合(理解)
 * 		底层数据结构是红黑树，平衡二叉树
 * 		A:元素唯一，并按照要求排序
 * 		B:如何保证元素唯一的呢?
 * 			根据比较的返回值是否是0来判断
 * 		C:如何保证元素排序的呢?
 * 			两种方式
 * 				a:自然排序(元素具备比较性)
 * 					让元素所属的类实现Comparable接口
 * 				b:比较器排序(集合具备比较性)
 * 					创建集合对象的时候，接受Comparator接口的实现类对象作为构造参数
 * 	(5)案例
 * 		A:HashSet案例
 * 			存储字符串并遍历
 * 			存储自定义对象并遍历(如果对象的成员变量值相同即为同一个值)
 * 		B:TreeSet案例
 * 			存储字符串并遍历
 * 			存储自定义对象并遍历(如果对象的成员变量值相同即为同一个值,按照年龄从小到大排序)
 * 		C:获取1-20之间的随机数10个，要求不能重复
 * 		D:键盘录入5个学生对象，并对总分进行排序
 */
public class SetDemo {
    public static void main(String[] args) {


        // 创建集合对象
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("aaaa");
        set.add("java");
        set.add("world");
        set.add("bbbb");
        set.add("aaaa");

//        //加强for循环
//        for (String s : set) {
//            System.out.println(s);
//        }

//        //迭代器
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }

//        //lambda表达式的匿名类底层
//        set.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //lambda表达式
        set.forEach(str -> System.out.println(str));
        set.forEach(System.out::println);

    }
}
