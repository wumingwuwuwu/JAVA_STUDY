package AAAAA.Test.TestThread.ChepiaoRun;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 10:26
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //多个窗口检票：三个窗口三个线程对象
        BuyTickerRunable btr = new BuyTickerRunable();

        Thread t1 = new Thread(btr,"子线程1");
        t1.start();

        Thread t2 = new Thread(btr,"子线程2");
        t2.start();

        Thread t3 = new Thread(btr,"子线程3");
        t3.start();
    }
}
