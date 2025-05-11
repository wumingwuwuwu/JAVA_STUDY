package wofuhuola.jichu;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class text008 {
    public static void main(String[] args) {
        /**
         * 重新复活
         */
//        注释： ctrl+/
        /**
         * 文档注释  /** + 回车
         */

        System.out.println("github 测试");
        System.out.println("Hello Github");

        System.out.println('a');
        System.out.println('a'+1);
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串输出一个字符串");
        String str = scanner.nextLine();
        System.out.println(str);
        //键盘录入两个数然后求和输出
        System.out.println("键盘录入两个数然后求和输出");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
        //键盘录入两个数然后输出较大数
        System.out.println("键盘录入两个数然后输出较大数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
        //键盘录入三个数，获取三个数中最大的
        System.out.println("键盘录入三个数，获取三个数中最大的");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        System.out.println(num3 > num4 ? (num3 > num5 ? num3 : num5) :(num4 > num5 ? num4 : num5));
        //键盘录入两个数，查看两数是否相同
        System.out.println("键盘录入两个数，查看两数是否相同");
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        System.out.println(num6 == num7 ? "这两数相同" : "这两数不同");
        //增强for循环,for(元素类型 元素在for循环内用到的形参 : (集合or数组))
        int[] number = {1,2,3,4};
        for (int num :number){
            System.out.println(num);
        }

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
