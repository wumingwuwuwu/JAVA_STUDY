package wofuhuola.jinjie.fangfayinyong.Breach01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 方法引用的分类
 */
public class FangFaYinYongDemo {
    public static void main(String[] args) {
        /**
         * 方法引用分类
         * 1.引用静态方法
         * 2.引用成员方法
         *      引用其他类的成员方法
         *      引用本类的成员方法
         *      引用父类的成员方法
         * 3.引用构造方法
         */
        /**
         * 引用静态方法
         * 格式：类名::静态方法
         * e.g.Integer::paresInt
         */
        {
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, "1", "2", "3", "4", "5");

            list.stream()
                    .map(Integer::parseInt)
                    .forEach(System.out::println);
        }
        /**
         * 引用成员方法
         * 格式：对象::成员方法
         *      其他类：其他类对象::成员方法
         *      本类：  this::成员方法
         *      父类：  super::成员方法
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "赵敏", "周芷若", "张强", "张三丰");
        //静态方法中不能有this
        // list.stream().filter(this::SJ).forEach(System.out::println);
        //创建本类的对象后再引用，方法要是静态的类方法用类名来引用
        list.stream().filter(new FangFaYinYongDemo()::SJ).forEach(System.out::println);
        FangFaYinYongDemo demo = new FangFaYinYongDemo();
        demo.sortDemo();
        System.out.println();
        /**
         * 引用构造方法
         * 格式：类名::new
         *      Student::new
         */
        list.clear();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        //封装成Student对象并收集到List集合中
        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        newList2.stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++");
        newList2.stream()
                .map(Student::toString)
                .forEach(System.out::println);

        /**
         * 引用数组的构造方法
         *         格式
         *                 数据类型[]::new
         *         目的：
         *                 创建一个指定类型的数组
         *         需求：
         *              集合中存储一些整数，收集到数组当中
         *
         *         细节：
         *             数组的类型，需要跟流中数据的类型保持一致。
         */

        //1.创建集合并添加元素
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5);
        //2.收集到数组当中

        Integer[] arr2 = list2.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));

    }

    public boolean SJ(String s){
        return s.startsWith("张")&&s.length()==3;
    }
    public void sortDemo() {
        Integer[] nums = {12,12,3,23,123,21,3,43,36,1,4,52,3,52,5,76,5,43,52};

        // 使用 this::instanceDES 引用当前对象的实例方法
        Arrays.sort(nums, this::instanceDES);

        for (int num : nums) {
            System.out.print(num+"-");
        }
    }
    public int instanceDES(int a, int b) {
        return b - a;
    }
}




