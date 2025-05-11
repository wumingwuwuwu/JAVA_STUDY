package AAAAA.ObjectTest.sample01;


/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/29 - 19:35
 * @Description:
 */
public class Sample01 {

    //public代表是其他任何类都能访问的成员变量
    public String name ;
    //private代表只能在当前类中使用
    private void sayHello(){
        System.out.println("Hello world!");
    }
    //不写访问修饰符就是默认修饰符，只能被包中的其他类访问
    void sayGoodbye(){
        System.out.println("Good bye!");
    }

    Sample03 sam ;

    public static void main(String[] args) {
        Sample01 emm = new Sample01();
        emm.sayHello();
    }
}
