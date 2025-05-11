package AAAAA.Test.TestThread.Threadtongxin;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/27 - 11:54
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //共享的商品
        Product p = new Product();
        //创建消费者与生产者线程
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);

        pt.start();
        ct.start();

    }
}
