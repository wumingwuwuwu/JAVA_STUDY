package wofuhuola.jichu;

import java.util.Scanner;

/**
 * @author wuzeyu
 * @date 2025/3/3 15:48
 */
public class text006 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        //在同一个类的实例方法中：可以直接调用其他实例方法（隐式使用 this）。
        int sum = sum(num1, num2);
        System.out.println(sum);
        Person person = new Person();
        person.eat();

        //循环录入数组
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.println(num[i]);
        }

        int numi = 0;
        for (int num3:num){
            numi++;
            System.out.println(num3);
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }
    /*
    静态方法（类方法）
    可通过类名直接调用：使用 类名.方法名(参数)。
    在同一个类中：可直接用 方法名(参数) 调用。
    原因：静态方法不依赖对象状态，属于类本身。
    */

}
