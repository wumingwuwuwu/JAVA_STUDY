package wofuhuola.jinjie.X13_Exception.Breach01;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s1 = new Student();
        //年龄：（同学） 18~40岁
        s1.setAge(50);//就知道了50赋值失败
        //选择1：自己悄悄处理
        //选择2：打印在控制台上
    }
}
