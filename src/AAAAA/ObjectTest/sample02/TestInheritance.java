package AAAAA.ObjectTest.sample02;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/29 - 19:35
 * @Description:
 */
class Person{
    protected String name;
    protected int age ;

    //定义person类的无参构造方法
    public Person(){
        System.out.println("调用person类的无参构造方法");
    }

    //定义person类的有参构造方法
    public Person(String name,int age){
        System.out.println("调用person类的有参构造方法");
        this.name = name;
        this.age = age;
    }

    protected void show(){
        System.out.println("姓名：" + name +"  年龄："+age);
    }

    protected void function(){
        System.out.println("访问person类的的方法");
    }
}
class Student extends Person{
    private String department;

    //定义Student类的无参构造方法
    public Student(){
        System.out.println("调用学生类的无参构造方法Student()");
    }

    //定义Student类的有参构造方法
    public Student(String name , int age , String department){

        //调用父类的构造方法
        super(name,age);

        this.department = department;

        //访问父类的变量
        System.out.println("我是"+this.department+"的学生" + "   姓名：" + super.name + "   年龄 ：" + super.age );

        //访问父类的方法
        super.function();

        System.out.println("调用学生类的有参构造方法Student(String name , int age , String department)");
    }

    //覆盖（重写）父类的方法
    protected void show(){
        System.out.println("重写父类的show()方法   "+"姓名：" + name +"  年龄："+age);
    }

}

public class TestInheritance {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("吴铭",20,"数据科学与大数据技术");
        stu1.show();
        stu2.show();
        //声明父类变量person指向子类变量
        Person person = new Student("吴泽羽",19,"计算机");
        //利用父类变量person调用子类的show()方法
        person.show();
    }
}
