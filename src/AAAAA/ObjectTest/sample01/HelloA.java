package AAAAA.ObjectTest.sample01;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/29 - 23:36
 * @Description:
 */
class A {
    public A() {
        new B(this).print();// 调用B的方法
    }
    public void print() {
        System.out.println("HelloAA from A!");
    }
}
class B {
    A a;
    public B(A a) {
        this.a = a;
    }
    public void print() {
        a.print();//调用A的方法
        System.out.println("HelloAB from B!");
    }
}
public class HelloA {
    public static void main(String[] args) {
        A aaa = new A();
        aaa.print();
        B bbb = new B(aaa);
        bbb.print();
    }
}