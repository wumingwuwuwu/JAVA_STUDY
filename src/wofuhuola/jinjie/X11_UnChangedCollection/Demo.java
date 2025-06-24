package wofuhuola.jinjie.X11_UnChangedCollection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 不可变集合
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * 方法名称                                  说明
         * static <E> List<E> of(E...elements)    创建一个具有指定元素的List集合对象
         * static <E> Set<E> of(E...elements)     创建一个具有指定元素的Set集合对象
         * static <K, V> Map<K, V> of(E...elements) 创建一个具有指定元素的Map集合对象
         */

        List<String> list = List.of("张三","李四","王五","赵六");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================================");

        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        set.forEach(System.out::println);
        System.out.println("=====================================");

        //Map中参数有上限最多是10对键值对
        Map<String, Integer> map = Map.of("张三", 12, "李四", 15, "王五", 14, "赵六", 20);
        Set<Map.Entry<String,Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            System.out.println(entry.getKey() + "++" + entry.getValue());
        }

    }
}
