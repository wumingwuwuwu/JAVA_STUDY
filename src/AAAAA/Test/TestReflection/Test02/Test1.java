package AAAAA.Test.TestReflection.Test02;

import java.util.Scanner;
/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/28 - 11:09
 * @Description:
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //str 模拟前台收到的信号，用于先择用那个进行支付
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if("微信".equals(str)){
            pay(new WeChat());
        }
        if("支付宝".equals(str)){
            pay(new AliPay());
        }
    }

    //方法形参是接口，具体传入的是接口的实现类的对象---》多态的一种形式
    //不准确的比喻接口的实现类就像接口的子类一样，父类可以代表为所有它的子类
    public static void pay(Mtwm m){
        m.payOnline();
    }

}
