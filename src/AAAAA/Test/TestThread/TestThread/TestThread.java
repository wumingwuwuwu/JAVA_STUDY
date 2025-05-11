package AAAAA.Test.TestThread.TestThread;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/24 - 22:31
 * @Description:
 * @version: 1.0
 */
public class TestThread extends Thread{
    public TestThread(String name){
        super(name);
    }
    /*
    * 一会儿线程对象就要开始争抢资源了，在个线程要执行的任务到底什么。
    * 这个任务你要放在方法中但是这个方法不能是随便写的一个方法，必须是重写Thread类中的run方法。
    * 然后线程的任务、逻辑写在run方法中
    * */
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
