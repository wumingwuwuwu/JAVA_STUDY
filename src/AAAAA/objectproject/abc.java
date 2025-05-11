package AAAAA.objectproject;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/30 - 16:54
 * @Description: 讲解static的用处
 */

class acs {
    public  static void main(){
        System.out.println("hello");
    }
}

public class abc {
    public static void main(String[] args) {
        acs min = new acs();
        new abc();
        min.main();
        HelloA();
        //HelloB();
    }
    {
        int i = 0;
    }

    //方法修饰符static用处是不用实例化就可以调用的方法
    public static void HelloA(){
        System.out.println("A");
    }


    void HelloB(){
        System.out.println("B");
    }

}
