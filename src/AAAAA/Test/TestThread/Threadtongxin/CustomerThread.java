package AAAAA.Test.TestThread.Threadtongxin;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/27 - 11:09
 * @Description:
 * @version: 1.0
 */
public class CustomerThread extends Thread{//消费者线程
    //共享商品
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//i=消费次数

            p.getProduct();

        }
    }
}
