package AAAAA.Test.TestThread.ChepiaoThread;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 8:50
 * @Description:
 * @version: 1.0
 */
public class BuyTickerThread extends Thread {
    public BuyTickerThread(String name){
        super(name);
    }
    //每个窗口一共10张票
    static int TickerNum = 10;

    //每个窗口都是一个线程对象，每个对象要执行的代码放入run方法中
    @Override
    public void run() {
        //假设每个窗口都有100人在排队抢票
        for (int i = 1; i <= 100 ; i++) {
            buyTick();
        }
    }
    public static synchronized void buyTick(){
        if(TickerNum > 0){
            System.out.println("我在"+Thread.currentThread().getName()+"买到第"+ TickerNum-- +"车票");
        }
    }
}
