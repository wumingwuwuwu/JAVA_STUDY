package wofuhuola.jichu;

import java.util.Scanner;

//浮点类型变量、布尔类型变量、Scanner
public class text003 {
    public static void main(String[] args) {
        double f1 = 3.1415926;
        System.out.println(f1);
        //科学计数法定义浮点数,从后往前
        double f2 = 31415926E-7;//3.1415926
        System.out.println(f2);
        //boolean类型有两个常量值，true和false，在内存中占一位
        boolean b1 = true;
        System.out.println(b1);
        boolean b2 = f1!=f2;
        System.out.println(b2);
        //强制类型转化,从后往前需要强制转换byte,short,char-->int--->long--->float--->double
        int num1 = (int)f1;
        System.out.println(num1);
        //强制转换本质是只保留最后二进制的最后几位。
        byte num2 = (byte)270;
        System.out.println(num2);
        //键盘输入学生的信息
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = sc.nextLine();
        System.out.println("输入年龄");
        int age = sc.nextInt();
        System.out.println("输入身高");
        double height = sc.nextDouble();
        System.out.println("该生信息如下：\n姓名："+name+"\n年龄："+age+"\n身高："+height);
    }
}
