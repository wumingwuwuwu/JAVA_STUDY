package AAAAA.ObjectTest.sample01;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/30 - 9:54
 * @Description:
 */
public class Student { //定义一个类，类的名字为student。
    public Student() { //定义一个方法，名字与类相同故为构造方法
        this("Hello");
    }
    public Student(String name) { //定义一个带形式参数的构造方法
        System.out.println(name + "小明");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}