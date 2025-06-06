package wofuhuola.jichu;

/**
 * 面向对象【下】：继承（this和super）、多态、抽象类、接口、包、权限修饰符、内部类
 */
public class text013 {
    /**
     *1：形式参数和返回值问题(掌握)
     * 	(1)形式参数：
     * 		基本类型：需要的是对应的值
     * 		引用类型：
     * 			类：该类的对象
     * 			抽象类：该类的子类对象
     * 			接口：该接口的实现类对象
     * 	(2)返回值问题：
     * 		基本类型：返回的是对应的值
     * 		引用类型：
     * 			类：该类的对象
     * 			抽象类：该类的子类对象
     * 			接口：该接口的实现类对象
     * 	(3)链式编程
     * 		new A().b().c().d();
     *
     * 2：包(理解)
     * 	(1)其实就是文件夹
     * 	(2)对类进行分类管理
     * 	(3)格式：
     * 		package 包名;
     * 	(4)注意事项
     * 		A:package是程序中的第一条可执行语句
     * 		B:在类中package是唯一的
     * 		C:没有package，默认是无包名
     * 	(5)带包的类的编译和运行
     *
     * 3：导包(理解)
     * 	(1)为了方便使用不同包下的类，需要导包
     * 	(2)格式：
     * 		import 包名.报名...类名;
     *
     * 		注意：可以导入到*,但是不建议
     * 	(3)package，import，class在类中有没有顺序关系呢?
     * 		有。
     * 		package --> import --> class
     *
     * 4：修饰符(理解)
     * 	(1)4种权限修饰符
     * 				本类	同一个包下	不同包下的子类	不同包下的其他类
     * 		private		Y
     * 		默认		Y	Y
     * 		protected	Y	Y		Y
     * 		public		Y	Y		Y		Y
     * 	(2)常见的修饰
     * 		A:类	public
     * 		B:成员变量	private
     * 		C:构造方法	public
     * 		D:成员方法	public
     *
     * 5：内部类(理解)
     * 	(1)把类A定义在类B内部，类A就被称为内部类
     * 	(2)访问特点：
     * 		A:内部类可以直接访问外部类的成员，包括私有
     * 		B:外部类要想访问内部类的成员，必须创建对象
     * 	(3)内部类的分类：
     * 		A:成员内部类
     * 		B:局部内部类
     * 	(4)成员内部类
     * 		A:private
     * 		B:static
     *
     * 		面试题：
     * 			num
     * 			this.num
     * 			Outer.this.num
     * 	(5)局部内部类
     * 		A:面试题
     * 			局部内部类访问局部变量，必须加final修饰
     * 	(6)匿名内部类(掌握)
     * 		A:没有名字的内部类
     * 		B:前提
     * 			存在一个类或者接口
     * 		C:格式
     * 			new 类名或者接口名() {
     * 				重写方法();
     * 			            };
     *
     * 			本质：是一个匿名子类对象
     */

}
abstract class Person111 {
	public abstract void study();
}

class PersonDemo {
	public void method(Person111 p) {
		p.study();
	}
}

class Student extends Person111 {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

abstract class Animal{
	public abstract void eat();
}

class ArgsDemo2 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person111 p = new Student();
		pd.method(p);

		//匿名内部类
		Animal a = new Animal(){
			@Override
			public void eat() {
				System.out.println("吃饭");
			}
		};
		a.eat();
	}
}



