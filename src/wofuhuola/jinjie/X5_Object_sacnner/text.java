package wofuhuola.jinjie.X5_Object_sacnner;

class   Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name,int age) {
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
//老师类
class Teacher {
    private String name;
    private int age;

    public Teacher() {}

    public Teacher(String name,int age) {
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
        System.out.println("备课");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
//测试类
class Test {
    public static void main(String[] args) {
        //测试学生
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(28);
        System.out.println(s.getName()+"---"+s.getAge());
        s.eat();
        s.sleep();
        System.out.println("-------------------------");

        Student s2 = new Student("张曼玉",18);
        System.out.println(s2.getName()+"---"+s2.getAge());
        s2.eat();
        s2.sleep();
        System.out.println("-------------------------");

        //测试老师
        Teacher t = new Teacher();
        t.setName("风清扬");
        t.setAge(31);
        System.out.println(t.getName()+"---"+t.getAge());
        t.eat();
        t.sleep();
        System.out.println("-------------------------");

        Teacher t2 = new Teacher("令狐冲",21);
        System.out.println(t2.getName()+"---"+t2.getAge());
        t2.eat();
        t2.sleep();

        //对象数组
        Student[] students = new Student[3];
        Student s11 = new Student("小吴",23);
        Student s22 = new Student("小王",23);
        Student s33 = new Student("小赵",24);

        students[0] = s11;
        students[1] = s22;
        students[2] = s33;
        for (Student e : students) {
            // System.out.println(students[x]);
            System.out.println(e.getName() + "---" + e.getAge());
        }


    }
}