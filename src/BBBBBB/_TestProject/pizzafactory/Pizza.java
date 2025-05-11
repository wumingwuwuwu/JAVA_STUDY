package BBBBBB._TestProject.pizzafactory;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/8/10 - 23:55
 * @Description:
 * @version: 1.0
 */
public class Pizza {
    //披萨的名字
    String name;
    //披萨的大小
    String size;
    //披萨的价格
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //方法打印所有信息
    protected void printInformation(){
        System.out.println(getName()+getPrice());
    }

    public static void main(String[] args) {
        Pizza a = new Pizza();
        a.setName("普通披萨");
        a.setPrice(1);
        a.printInformation();
    }
}
