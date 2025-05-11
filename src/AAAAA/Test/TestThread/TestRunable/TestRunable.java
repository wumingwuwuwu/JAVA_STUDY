package AAAAA.Test.TestThread.TestRunable;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 9:38
 * @Description:
 * @version: 1.0
 */
//实现该接口，才会变成一个线程类
public class TestRunable implements Runnable{

    @Override
    public void run() {
        //输出1·10数字
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
