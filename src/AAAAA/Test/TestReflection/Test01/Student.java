package AAAAA.Test.TestReflection.Test01;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 9:20
 * @Description:
 * @version: 1.0
 */
//Student为Person的子类
@MyAnnotation(value = "class")
public class Student extends Person implements MyInterface{
    //属性
    private int sno;//学号
    double height;//身高
    protected double weight;//体重
    public double score;//成绩

    //方法
    @MyAnnotation(value = "Method")
    String showInfo(){

        return "我是一名学生";
    }
    private void work(int age){
        System.out.println("我要每月15k");
    }
    public void happy(String qingk){
        System.out.println("重载方法----》我值得每月15k");
    }
    public void happy(){
        System.out.println("获得快乐");
    }
    protected int getSno(){
        return this.sno;
    }
    @Override
    @MyAnnotation("OverMethod")
    public void mapa() throws RuntimeException{
        System.out.println("实现接口");

    }

    //构造器
    @MyAnnotation(value = "构造器")
    public Student(){
        System.out.println("空参构造器");
    }

    public Student(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    private Student(int sno){
        this.sno = sno;
    }
    Student (int sno,double weight){
        this.sno = sno;
    }

    protected Student(int sno, double height, double weight) {
        this.sno = sno;
        this.height = height;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }

}
