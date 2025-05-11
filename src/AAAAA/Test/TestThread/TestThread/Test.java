package AAAAA.Test.TestThread.TestThread;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/24 - 22:51
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //给主线程main设置名称
        //Thread.currentThread()作用为获取当前数组
        Thread.currentThread().setName("主线程");

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
        //制造其他线程，要跟主线程争抢资源：
        //具体的线程对象：子线程
        TestThread tt = new TestThread("子线程");
        //tt.setName("第一次设置");
        //tt.run();//调用run方法，想要执行线程中的任务--》这个run方法不能直接调用，直接调用就会被当做一个普通方法
        //想要tt子线真正起作用比如要启动线程：
        tt.start();//start()方法是Thread类中的方法
        for (int i = 1; i <= 10; i++) {
            System.out.println("mian---"+i);
        }

    }
}
