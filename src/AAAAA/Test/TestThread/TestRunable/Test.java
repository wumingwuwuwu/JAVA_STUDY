package AAAAA.Test.TestThread.TestRunable;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 9:38
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TestRunable tr = new TestRunable();
        Thread t = new Thread(tr,"子线程");
        t.start();

        //主线程也输出1·10
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
