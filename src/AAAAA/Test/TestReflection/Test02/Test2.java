package AAAAA.Test.TestReflection.Test02;


import java.lang.reflect.Method;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/28 - 15:47
 * @Description:
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //str 模拟前台收到的信号，用于先择用那个进行支付
        String str = "Test.TestReflection.Test02.AliPay";

        //下面的代码就是利用反射
        Class cls = Class.forName(str);
        Object o = cls.getConstructor().newInstance() ;
        Method method =cls.getMethod("payOnline");
        method.invoke(o);





    }
}
