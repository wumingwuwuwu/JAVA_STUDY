package wofuhuola.jinjie.X2_Super_this;

/*
	学生类和老师。定义两个功能(吃饭，睡觉)

	学生类：
		成员变量：姓名，年龄
		成员方法：getXxx()/setXxx(),eat(),sleep()
	老师类：
		成员变量：姓名，年龄
		成员方法：getXxx()/setXxx(),eat(),sleep()

	提取出共性的东西定义到一个类中：
	人类：
		成员变量：姓名，年龄
		成员方法：getXxx()/setXxx(),eat(),sleep()

	学生类 继承 人类
	老师类 继承 人类

	继承的好处：
		A:提高了代码的复用性
		B:提高了代码的维护性
		C:让类与类之间产生了关系，是多态的前提

	继承的弊端：类的耦合性很强
		设计原则：低耦合，高内聚。
		耦合：类与类的关系。
		内聚：自己完成事情的能力。
*/
//人类
class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

//学生类
class Student extends Person  {
    public Student() {}

	/*
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	*/
}

//老师类
class Teacher extends Person {
}

/**
 * super的用法和this很像
 * this代表本类对应的引用。
 *
 * super代表父类存储空间的标识(可以理解为父类引用)
 *
 * 用法(this和super均可如下使用)
 * 访问成员变量
 * this.成员变量		super.成员变量
 * 访问构造方法(子父类的构造方法问题讲)
 * this(…)		super(…)
 * 访问成员方法(子父类的成员方法问题讲)
 * this.成员方法()	super.成员方法()
 */
class Father {
    public int age = 45;

    public Father() {}

    public Father(int age) {
        this.age = age;
        System.out.println("父亲的年龄是"+age);
    }

}

class Son extends Father {
    public int num = 100;
    public int age = 20;

    public Son() {}

    public Son(int age) {
        this.age = age;
        System.out.println("儿子的年龄是"+age+"他父亲的年龄是"+super.age);
    }

    public void show() {
        int age = 60;
        System.out.println(age); //局部范围
        System.out.println(this.age); //本类成员范围
        System.out.println(super.age); //父类成员范围
        System.out.println(num);
    }
}


class PersonDemo {
    public static void main(String[] args) {
        //继承
        /**
         * 一个子类初始化是分层初始化先初始化父类再初始化子类
         * 创建子类对象的时候会先去放访问父类的构造方法，对父类数据进行初始化
         * 子类只能继承父类所有非私有的成员（成员方法和成员变量）
         * 子类不能继承父类的构造方法，但是可以通过super访问
         */
        Father father = new Father(40);
        Son son = new Son(20);
        son.show();

        //学生类
        Student s = new Student();
        s.setName("王祖贤");
        s.setAge(27);
        System.out.println(s.getName()+"---"+s.getAge());
        s.eat();
        s.sleep();
        System.out.println("--------------------------");

        //老师类
        Teacher t = new Teacher();
        t.setName("王祖蓝");
        t.setAge(25);
        System.out.println(t.getName()+"---"+t.getAge());
        t.eat();
        t.sleep();
        System.out.println("--------------------------");

    }
}