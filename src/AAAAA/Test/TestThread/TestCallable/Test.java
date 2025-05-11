package AAAAA.Test.TestThread.TestCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 11:30
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //定义一个线程对象
        TestC tc = new TestC();
        FutureTask ft = new FutureTask(tc);
        Thread t = new Thread(ft);
        t.start();
        //获取线程得到的返回值
        Object in = ft.get();
        System.out.println(in);



    }
}
