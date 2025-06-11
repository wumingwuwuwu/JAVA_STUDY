package wofuhuola.jinjie.StreamText.Breach02;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream的终结方法 流中的最后一个方法
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /**
         * 名称                          说明
         * void forEach(Consumer action)    遍历
         * long count()                    统计
         * toArray()                       收集流中的数据，放到数组中
         * collect(Collector collector)    收集流中的数据，放到集合中
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //count() 统计
        int num = (int) list.stream().count();
        System.out.println(num);

        //toArray() 收集流中的数据，放到数组中
        //！重要！toArray()的作用是创建一个指定类型指定长度的数组
        //toArray()的返回值是一个装着流元素的数组
        /**
        在 Stream.toArray(IntFunction<A[]> generator) 方法中，value 参数的值是由 流框架内部自动计算并传递
        的，它表示当前流框架计算后传入的最终元素数量。以下是具体说明：
        value 的来源
        产生时机：当流执行终止操作 toArray() 时，框架会先遍历流中的所有元素，统计出总数量 size。
        传递过程：框架将这个 size 作为参数 value 传递给 IntFunction.apply(int value) 方法。
        */
        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
                    @Override
                    public String[] apply(int value) {
                        return new String[value];
                    }
                }
        );
        System.out.println(Arrays.toString(arr1));

        String[] arr = list.stream().toArray(String[]::new);
        System.out.println(arr);

        //collect(Collector collector)   收集流中的数据，放到集合中
        list.clear();
        Collections.addAll(list,"张无忌-15","周芷若-14","赵敏-13","张强-20","张三丰-100","张翠山-40","张良-35","王二麻子-37","谢广坤-45");
        /**
         * toMap:参数一键的生成规则
         *       参数二值的生成规则
         *       参数一·：泛型一：表示流里每个元素的数据类型
         *              泛型二：表示Map中键的数据类型
         *              方法apply形参:依次表示流里的每一个数据
         *                      方法体：生成键的代码
         *                      返回值：生成出的键
         *       参数二：泛型一：表示流里每个元素的数据类型
         *             泛型二：表示Map中值的数据类型
         *             方法apply形参:依次表示流里的每一个数据
         *                      方法体：生成值的代码
         *                      返回值：生成出的值
         */
        Map<String, Integer> map = list.stream()
            .map(s -> s.split("-"))
            .filter(arrr -> arrr.length == 2)
            .collect(Collectors.toMap(
                /*new Function<String[], String>() {
                    @Override
                    public String apply(String[] arr) {
                        return arr[0]; // 姓名作为Key
                    }
                },
                new Function<String[], Integer>() {
                    @Override
                    public Integer apply(String[] arr) {
                        try {
                            return Integer.parseInt(arr[1]); // 年龄作为Value
                        } catch (NumberFormatException e) {
                            return 0; // 异常处理
                        }
                    }
                }*/
                    arrr -> arrr[0],
                    arrr ->Integer.parseInt(arrr[1])
            ));
        System.out.println(map);
        System.out.println("=====");

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


    }
}
