package AAAAA.Test.TestThread.Test1;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 14:27
 * @Description:
 * @version: 1.0
 */
public class TestThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"  ");
        }
    }
}
class TestThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 11; i <=20 ; i++) {
            System.out.print(i+"  ");
        }
    }
}
class test{
    public static void main(String[] args) {
        TestThread1 tt1 = new TestThread1();
        tt1.setPriority(1);//优先级低
        tt1.start();

        TestThread2 tt2 = new TestThread2();
        tt2.setPriority(10);//优先级高
        tt2.start();
    }
}