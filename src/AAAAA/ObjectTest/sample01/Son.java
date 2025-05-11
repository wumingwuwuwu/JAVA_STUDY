package AAAAA.ObjectTest.sample01;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/2 - 19:31
 * @Description:
 */
public class Son extends father{
    private static String a = "子类静态变量";
    private String b = "子类非静态变量";
    static {
        System.out.println("子类静态代码块！");
    }

    {
        System.out.println("子类非静态代码块！");
    }

    public Son(){
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        Son s = new Son();
    }
}
class father{
    private static String a = "父类静态变量";
    private String b = "父类非静态变量";
    static {
        System.out.println("父类静态代码块！");
    }

    {
        System.out.println("父类非静态代码块！");
    }

    public father(){
        System.out.println("父类构造方法");
    }
}
