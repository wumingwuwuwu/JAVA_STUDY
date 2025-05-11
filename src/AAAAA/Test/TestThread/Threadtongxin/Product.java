package AAAAA.Test.TestThread.Threadtongxin;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/27 - 10:15
 * @Description:
 * @version: 1.0
 */
public class Product {
    //品牌
    private String brand;
    //名字
    private String name;
    //
    boolean flag = false;


    //setter,getter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //生产商品
    public synchronized void setProduct(String brand,String name){
        if(flag){//有商品，等消费完再生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        //将生产信息做一个打印：
        System.out.println("生产者生产了："+ this.getBrand() + "----" + this.getName());
        //生产完，状态改为true
        flag = true;
        //通知生产者生产
        notify();
    }
    //消费商品
    public synchronized void getProduct(){
        if(!flag){//没有商品，等待生产者生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了：" + this.getBrand() + "----" + this.getName());

        //消费完，状态改为false
        flag = false;
        //通知生产者生产
        notify();
    }
}



