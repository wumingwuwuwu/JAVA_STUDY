package wofuhuola.jichu;

import java.util.Scanner;

public class text004 {
    public static void main(String[] args) {

        System.out.println(12/3);
        //取余
        System.out.println(12%5);
        System.out.println(12/3.0);
        System.out.println(12%5.1);

        //取每一位的数字
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        splitAndPrintDigits(num);
        int a = 5;
        System.out.println(a++ + a++);//11
        System.out.println(a++ + ++a);//16
        System.out.println(++a + a++);//20
        System.out.println(++a + ++a);//25
        //>,<,>=,<=,==,!=，关系运算符
        //关系运算符得true或false
        System.out.println(4>9);
        System.out.println(4<9);
        System.out.println(4==9);
        System.out.println(4!=9);
        System.out.println((5<9)!=(8>9));
        /*&，|，&&，||，!，^逻辑运算符
        *逻辑运算符同样得true或者false
        * 逻辑运算符组左右连接的是boolean
        */
        //逻辑与&，有false就false
        System.out.println(true&&true&&true&&true&&false);
        //逻辑或|，有true就true
        System.out.println(false||false||false||true);
        //逻辑非!
        System.out.println(!true);
        System.out.println(!false);
        //逻辑异或^,相同false不同true
        System.out.println(false^true);
        System.out.println(false^false);
        //三目运算符a?b:c
        int fnum = (5>7)?1:2;
        System.out.println(fnum);
    }

    public static void splitAndPrintDigits(int number) {
        if (number < 10) {
            // 如果只剩一位，直接输出
            System.out.println("第1位: " + number);
        } else {
            // 递归调用，拆分更高位
            splitAndPrintDigits(number / 10);
            // 输出当前位
            int digit = number % 10;
            //计算当前第几位
            int position = (int) Math.log10(number) + 1;
            System.out.println("第" + position + "位: " + digit);
        }
    }

}
