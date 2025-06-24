package wofuhuola.jinjie.X10_Stream.Breach01;

import wofuhuola.jinjie.X8_MAP.HASHMap.Student;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream的基本使用
 */
public class StreamDemo {
    public static void main(String[] args) {

        /**
         * 创建集合添加元素，完成以下需求；
         * 1.把张开头的的元素添加到新集合
         * 2.把张开头且长度为三的元素再添加到另一个新集合中
         * 3.遍历打印
         */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三一");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        list1.add("张七");

        //stream流里面要用lambda表达式 .filter过滤方法 .forEach遍历方法
        list1.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                //方法引用::
                .forEach(System.out::println);
        list1.stream().forEach(System.out::println);


        /**
         * 单列集合     default Stream<E> stream()                      Collection中的默认方法
         * 双列集合     无                                              无法直接使用
         * 数组        public static <T> Stream<T> stream(T[] array)   Arrays工具类中的静态方法
         * 零散数据     public static <T> Stream<T> of(T... values)     Stream接口中的静态方法
         */
        //双列集合需要先转换成单列
        HashMap<Student,String> StudentOrigin= new HashMap<Student,String>();

        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("风清扬", 31);
        Student s3 = new Student("王重阳", 200);
        Student s4 = new Student("林青霞", 28);
        Student s5 = new Student("风清扬", 20);
        Student s6 = new Student("王阳", 100);

        StudentOrigin.put(s1, "山东");
        StudentOrigin.put(s2, "河北");
        StudentOrigin.put(s3, "陕西");
        StudentOrigin.put(s4, "山西");
        StudentOrigin.put(s5, "河南");
        StudentOrigin.put(s6, "湖南");

//        StudentOrigin.keySet().stream()
//                .forEach(student -> System.out.println(
//                        "学生：" + student.getName() +
//                        "|年龄：" + student.getAge() +
//                        "|籍贯：" + StudentOrigin.get(student)
//                ));

        StudentOrigin.entrySet().stream()
                .forEach(studentStringEntry -> System.out.println(
                        "学生：" + studentStringEntry.getKey().getName() +
                        "|年龄：" + studentStringEntry.getKey().getAge() +
                        "|籍贯：" + studentStringEntry.getValue()
                ));
        //数组获取Stream流
        int[] arr = {1,2,23,32,3,1,2,3,2,324,123,4,1234,1,3,3412,34};
        String s = "";
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("=============================================");

        //现场组装Stream流
        Stream.of(31,23,12,31,3,213,4231,53,456,64567,32,2,345).forEach(System.out::print);



//        //1.把张开头的的元素添加到新集合
//        ArrayList<String> list2 = new ArrayList<>();
//        for (String name : list1) {
//            if(name.startsWith("张")){
//                list2.add(name);
//            }
//        }
//        System.out.println(list2);
//
//        //2.把张开头且长度为三的元素再添加到另一个新集合中
//        ArrayList<String> list3 = new ArrayList<>();
//        for (String name : list2) {
//            if(name.length() == 3){
//                list3.add(name);
//            }
//        }
//        System.out.println(list3);
    }
}
