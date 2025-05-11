package AAAAA.Test.TestThread.ChepiaoRun;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 8:50
 * @Description:
 * @version: 1.0
 */
public class BuyTickerRunable implements Runnable{
    //每个窗口一共10张票
    int TickerNum = 10;
    //创建一把锁
    Lock lock = new ReentrantLock();
    //每个窗口都是一个线程对象，每个对象要执行的代码放入run方法中
    @Override
    public void run() {
        //假设每个窗口都有100人在排队抢票
        for (int i = 1; i <= 100 ; i++) {
            //打开锁
            lock.lock();
            try {
                if(TickerNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买到第"+ TickerNum-- +"车票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                //关闭流：--》即使有异常这个锁也可以得到释放
                lock.unlock();
            }

        }
    }
}
