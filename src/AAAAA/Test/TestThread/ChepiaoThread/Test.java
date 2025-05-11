package AAAAA.Test.TestThread.ChepiaoThread;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 9:13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //多个窗口检票：三个窗口三个线程对象
        BuyTickerThread t1 = new BuyTickerThread("一号窗口");
        t1.start();
        BuyTickerThread t2 = new BuyTickerThread("二号窗口");
        t2.start();
        BuyTickerThread t3 = new BuyTickerThread("三号窗口");
        t3.start();

    }
}
