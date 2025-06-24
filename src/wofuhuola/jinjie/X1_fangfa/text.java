package wofuhuola.jinjie.X1_fangfa;

/**
 * 方法重写方法重载
 */

class Father{
    int age;
    String name;

    public Father(){
        System.out.println("Father");
    }

    public Father(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Action(){
        System.out.println("我去工作了");
    }

}
class Son extends Father {

    public Son(){
        super();
    }

    public Son(int age,String name){
        super(age,name);
    }

    @Override
    public void Action() {
        System.out.println("我去上学了");
    }
}

public class text {
    /**
     * 	方法重写：子类中出现和父类中一模一样的方法声明的现象。
     * 	方法重载：同一个类中出现的方法名相同，参数列表不同的现象。
     */
    public static void main(String[] args) {
        Father f = new Father(53,"父亲");
        Son s = new Son(23,"儿子");
        f.Action();
        s.Action();
        Son s1 = new Son();
        int a = 1;
        int b = 2;
        int c = 3;
        //方法重载
        add(a,b);
        add(a,b,c);
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }


}
