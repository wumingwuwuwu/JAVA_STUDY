package wofuhuola.jichu;

import java.util.Scanner;

/**
 * if分支、switch、for循环
 */
public class text009 {
    public static void main(String[] args){
        int a = 12;
        int b = 13;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "  " + b);
        //输出10-1
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }
        //求100内奇数和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
        //1000内的水仙花数
        for (int i = 10; i < 1000; i++) {
            int ge;
            int shi;
            int bai;
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100 % 10;
            int sumnum = (int) (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
            if(sumnum == i){
                System.out.println(sumnum+"是水仙花数");
            }
        }
        System.out.println("输入月份返回季节");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("错误月份");
                break;
        }
        /**
         * 每天攒2.5块，5的倍数天花6块，要几天攒到100块
         */
        double money = 0;
        int day = 1;
        for (;; day++) {
            money += 2.5;
            if(day % 5 == 0){
                money -= 6;
            }
            if(money>=100){
                break;
            }
        }
        System.out.println("经过"+day+"天能存到100块"+"，具体是"+money+"元");

    }
}
