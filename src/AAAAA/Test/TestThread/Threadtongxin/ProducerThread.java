package AAAAA.Test.TestThread.Threadtongxin;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/27 - 10:21
 * @Description:
 * @version: 1.0
 */
public class ProducerThread extends Thread{//生产者线程
    //共享商品
    private Product p;

    public ProducerThread(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            if(i % 2 == 0){
                p.setProduct("费列罗","巧克力");
            }else{
                p.setProduct("哈尔滨","啤酒");
            }

        }
    }

}


