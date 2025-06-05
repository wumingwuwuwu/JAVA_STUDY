package wofuhuola.jinjie.Set.TREESet;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
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

    @Override
    public int compareTo(Person p){
        //主要条件
        //姓名长度进行排序
        int num  = this.name.length() - p.name.length();
        //次要条件
        //长度相同内容不代表一样，所以还要继续比内容
        int num2 = num == 0 ? this.name.compareTo(p.name) : num;
        //长度内容都相同比较年龄
        int num3  = num2 ==0 ? this.age - p.age : num2;
        //num3就返回三种情况负数、零、正数，因为TreeSet底层是红黑树所以会根据比较出来返回的值来决定是否插入和插入的位置
        return num3;
    }
}