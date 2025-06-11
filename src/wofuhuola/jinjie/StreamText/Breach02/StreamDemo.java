package wofuhuola.jinjie.StreamText.Breach02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream的中间方法
 */
public class StreamDemo {
    public static void main(String[] args) {
        /**Stream的中间方法
         * 名称                                                 说明
         * Stream<T> filter(Predicate<? super T> predicate)    过滤
         * Stream<T> limit(long maxSize)                       获取前几个元素
         * Stream<T> skip(long n)                              跳过前几个元素
         * Stream<T> distinct()                                元素去重，依赖(hashCode和equals方法)
         * static <T> Stream<T> concat(Stream a, Stream b)     合并a和b两个流为一个流
         * Stream<R> map(Function<T , R> mapper)               转换流中的数据类型
         * tips：
         *      1.中间方法返回新的Stream流，原来的stream只能使用一次，建议使用链式编程
         *      2.修改Stream流中的数据，不会影响原来集合或数组中的数据
         */
        //.filter过滤
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三一");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        list1.add("张七");

        //stream流里面要用lambda表达式 .filter过滤方法 .forEach遍历方法
        list1.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为ture，表示当前数据可以留下
                //如果返回值为法拉瑟，表示当前数据舍弃不要

                return s.startsWith("张");
            }
        });
        //limit(long maxSize) 获取前maxSize个元素
        //获取前三个
        list1.stream()
                .limit(3)
                .forEach(System.out::println);

        //skip(long n) 跳过前n个元素
        //跳过前1个
        list1.stream()
                .skip(1)
                .forEach(System.out::println);

        System.out.println("=================================");

        list1.clear();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");


        //输出"张强","张三丰","张翠山"
        list1.stream()
                .skip(3)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("======================================");

        Collections.addAll(list1,"张无忌","谢广坤");
        list1.stream().forEach(System.out::print);


        //distinct()  元素去重，依赖(hashCode和equals方法)
        list1.stream().distinct().forEach(System.out::println);
        System.out.println("======================================");

        //Stream<T> concat(Stream a, Stream b)    合并a和b两个流为一个流
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张三","王五");
        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
        System.out.println("======================================");

        //map(Function<T , R> mapper)   转换流中的数据类型
        list1.clear();
        Collections.addAll(list1,"张无忌-15","周芷若-14","赵敏-13","张强-20","张三丰-100","张翠山-40","张良-35","王二麻子-37","谢广坤-45");
        list1.stream()
                .map(
                        new Function<String, Map>() {
                            @Override
                            public Map<String,Integer> apply(String s) {
                                Map<String,Integer> map = new HashMap<String,Integer>();
                                String[] arr = s.split("-");
                                String ageString = arr[1];
                                int age = Integer.parseInt(ageString);
                                map.put(arr[0],age);
                                return map;
                            }
                        }
                ).forEach(System.out::println);
        list1.stream()
                .map(s -> Integer.parseInt(
                        s.split("-")[1]))
                .forEach(System.out::println);

        //超纲
        Map<String, Integer> resultMap = list1.stream()
                .map(s -> s.split("-"))
                .filter(arr -> arr.length == 2)  // 确保拆分后有两个部分
                .collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> {
                            try {
                                return Integer.parseInt(arr[1]);
                            } catch (NumberFormatException e) {
                                return 0; // 默认值处理
                            }
                        }
                ));

    }
}
