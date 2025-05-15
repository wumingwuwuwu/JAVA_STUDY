package wofuhuola.jichu;

import org.w3c.dom.ls.LSOutput;

/**
 * 面向对象
 * 面向对象思想
 * 类与对象
 * 匿名对象
 * 封装（private）
 * this
 * 构造方法
 * static
 */
public class text012 {
/**
 * 面向对象
 * 创建对象，使用对象
 * 特征：封装、继承、多态
 * 类：属性、行为
  */

    /**
     * 大象内部类
      */
    static class Elephant{
        public void enter(){
            System.out.println("大象进入冰箱");
        }
    }

    /**
     * 冰箱内部类
     */
    static class Refrigerator{
        private String name;
        private String factory;

        public void open(){
            System.out.println("打开冰箱门");
        }

        public void close(){
            System.out.println("关闭冰箱门");
        }

        /**
         * 构造方法
         * 作用：对对象的数据进行初始化。
         *      初始化给对象在内存开辟空间
         * 特点：
         * 		A:方法名和类名相同
         * 		B:没有返回值类型
         * 		C:没有返回值
         * 注意事项
         * 		A:如果我们没写构造方法，系统将默认给出无参构造方法
         * 		B:如果我们写了构造方法，系统将不再给出默认无参构造方法
         * 		  建议：我们自己手动给出无参构造方法
         * 给对象的成员变量进行赋值
         * 		A:无参+setXxx()
         *          Refrigerator bingxiang = new Refrigerator();
         *             bingxiang.setName("sg_30201");
         *             bingxiang.setFactory("海尔");
         * 		B:带参
         *     		Refrigerator bingxiang2 = new Refrigerator("md-2313","美的");
         */
        //无参构造器
        public Refrigerator(){}

        //带参构造器
        public Refrigerator(String name, String factory){
            this.name = name;
            this.factory = factory;
        }
        //this指代的是当前对象
        //这段的意思是对当前的对象的name进行赋值，赋值为这形参里的name
        //this还可以在构造器里调用别的构造器
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setFactory(String factory){
            this.factory = factory;
        }
        public String getFactory(){
            return factory;
        }
        public void print(){
            System.out.println("冰箱的厂家是："+factory+"  冰箱的型号是："+name);
        }
    }

    /**
     * static关键字
     */

    /**
     * 	public:访问权限修饰符，表示最大的访问权限，被jvm调用，所有权限要够大。
     * 	static:被jvm调用，不用创建对象，直接类名访问
     * 	void:被jvm调用，不需要给jvm返回值
     * 	main:一个通用的名称，虽然不是关键字，但是被jvm识别
     */
    public static void main(String[] args) {
        Elephant daxiang = new Elephant();
        Refrigerator bingxiang = new Refrigerator();
        bingxiang.setName("sg_30201");
        bingxiang.setFactory("海尔");
        bingxiang.open();
        daxiang.enter();
        bingxiang.close();
        bingxiang.print();
        Refrigerator bingxiang2 = new Refrigerator("md-2313","美的");
        bingxiang2.print();
        System.out.println(bingxiang2.getFactory()+"  "+bingxiang2.getName());
    }
}