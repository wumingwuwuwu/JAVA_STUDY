package AAAAA.Test.TestThread.Test1;

public class Test2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException {
        Test2 t2 = new Test2();
        t2.setDaemon(true);//设置伴随线程 注意：先设置，再启动
        t2.start();
        //主线程中再输出1·10的数字
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main:"+i);
        }

    }
}

