package wofuhuola.jichu;

/*
* 整数数据类型、进制、函数调用重载、创建类及其对象
* */

public class text002 {
    static int suu = 20;
    public static void main(String[] args) {
        int age;
        age = 23;
        System.out.println("age = " + age);
        int a = 2;
        int b = 2;
        System.out.println(a + b);
        //默认什么都不加就是十进制
        int num1 = 12;
        System.out.println(num1);
        //前面加0就是八进制
        int num2 = 012;
        System.out.println(num2);
        //前面加0x或者是0X就是十六进制
        int num3 = 0x12;
        System.out.println(num3);
        //前面加0b或者是0B就是二进制
        int num4 = 0b100101010;
        System.out.println(num4);

        //定义byte类型变量，范围-128~127
        byte c = -128;
        System.out.println(c);
        //定义short类型变量，范围-32768-32767
        short s = 30000;
        System.out.println(s);
        //定义ing类型变量，范围-21亿到21亿
        //定义long类型变量，范围负的2的63次方到2的63次方
        //当long变量超过了int的范围需要在变量的结尾加L
        long l = 1000000000000000000L;
        System.out.println(l);

        //函数调用
        some();
        text002 t = new text002();
        t.some();


        //函数重载
        System.out.println("函数重载\n第一个SUM函数\n" + t.SUM(a,b));
        System.out.println("\n第二个SUM函数\n" + t.SUM(num1,num2,num3));



        //创建Person类的对象
        Person zy  = new Person();
        zy.age = 23;
        zy.name = zy.toString();
        zy.height = 174.2;
        zy.weight = 89.5;
        System.out.println("Person类的泽羽对象创建成功");
        zy.eat();
    }
    public static void some(){
        System.out.println("函数调用start");
        System.out.println(suu);
        //报错
        // System.out.println(a);
        int a = 3;
        System.out.println(a);
        System.out.println("函数调用end");
    }
    //函数的重载，重载是指一个类中可以定义多个方法名相同，但参数不同的方法。 调用时，会根据不同的参数自动匹配对应的方法。
    public int SUM(int a,int b){
        return a+b;
    }
    public int SUM(int a,int b,int c){
        return a+b+c;
    }


}
