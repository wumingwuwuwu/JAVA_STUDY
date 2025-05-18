package wofuhuola.jinjie.chouxiang;

/**
 * 接口和抽象类的区别：
 * 1：成员区别
 * 	抽象类：
 * 		成员变量：可以是变量，也可以是常量
 * 		构造方法：有
 * 		成员方法：可以是抽象的，也可以是非抽象的
 * 	接口：
 * 		成员变量：只能是常量。
 * 			默认修饰符：public static final
 * 		成员方法：只能是抽象的
 * 			默认修饰符：public abstract
 *
 * 2：关系区别
 * 	类与类：
 * 		继承关系，只能单继承。可以多层继承。
 * 	类与接口：
 * 		实现关系，可以单实现，也可以多实现。
 * 		还可以在继承一个类的同时实现多个接口。
 * 	接口与接口：
 * 		继承关系，可以单继承，也可以多继承。
 *
 * 3：设计理念区别
 * 	抽象类：被继承体现的是：”is a”的关系。在抽象类中定义的一般是共性功能
 * 	接口：被实现体现的是：”like a”的关系。在接口中定义的一般是扩展功能
 */
//说英语的接口
interface SpeakEnglish{
	public abstract void speak();
}

//抽象人类
abstract class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
    	this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //每个人吃的饭是不同的
    public abstract void eat();

    public void sleep(){
        System.out.println("保持充足睡眠");
    }

}
//抽象教练类
abstract class Coach extends Person{
    public Coach(){}

    public Coach(String name, int age){
        //引用父类Person类的构造方法
        super(name, age);
    }
    //教练的特殊动作“教学”但是不同教练的教学内容是不同的
    public abstract void teach();
}

//抽象运动员类
abstract class Player extends Person{
    public Player(){}
    public Player(String name, int age){
        super(name, age);
    }
    public abstract void study();
}

//乒乓球教练类
class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach(){}
    public PingPangCoach(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"吃乒乓球场馆食堂");
    }

    @Override
    public void teach() {
        System.out.println(this.getName()+"进行乒乓球教学");
    }

    @Override
    public void speak() {
        System.out.println(this.getName()+"可以说英语");
    }

}

//篮球教练类
class LanQiuCoach extends Coach{
    public LanQiuCoach(){}
    public LanQiuCoach(String name, int age){
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getName()+"进行篮球教学");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"吃篮球场馆的盒饭");
    }
}

//乒乓球运动员类
class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer(){}
    public PingPangPlayer(String name, int age){
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println(this.getName()+"学习打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"吃乒乓球馆食堂");
    }

    @Override
    public void speak() {
        System.out.println(this.getName()+"说英语");
    }
}

//篮球运动员类
class LanQiuPlayer extends Player {
    public LanQiuPlayer(){}
    public LanQiuPlayer(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"吃篮球馆食堂");
    }

    @Override
    public void study() {
        System.out.println(this.getName()+"学习篮球技巧");
    }
}

class PeopleDemo{
    public static void main(String[] args) {
        PingPangCoach pingPangCoach = new PingPangCoach("刘国梁",56);
        pingPangCoach.eat();
        pingPangCoach.sleep();
        pingPangCoach.teach();
        pingPangCoach.speak();
        System.out.println("----------------------------------");

        PingPangPlayer pingPangPlayer = new PingPangPlayer("张继科",34);
        pingPangPlayer.eat();
        pingPangPlayer.sleep();
        pingPangPlayer.study();
        pingPangPlayer.speak();
        System.out.println("----------------------------------");

        LanQiuCoach lanQiuCoach = new LanQiuCoach("乔丹",65);
        lanQiuCoach.eat();
        lanQiuCoach.sleep();
        lanQiuCoach.teach();
        System.out.println("----------------------------------");

        LanQiuPlayer lanQiuPlayer = new LanQiuPlayer("詹姆斯",38);
        lanQiuPlayer.eat();
        lanQiuPlayer.sleep();
        lanQiuPlayer.study();
    }
}