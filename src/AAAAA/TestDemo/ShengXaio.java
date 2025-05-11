package AAAAA.TestDemo;

import java.util.Scanner;
/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/13 - 18:10
 * @Description:输入年份返回生肖
 */
public class ShengXaio {
    static String[] shengX = {"猴年","鸡年","狗年","猪年","鼠年","牛年","虎年","兔年","龙年","蛇年","马年","羊年"} ;
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while(scanner.hasNext()){
            int year = scanner.nextInt();
            System.out.println(shengX[year%12]);
        }
    }
}
