package wofuhuola.jichu;

import java.util.Scanner;

/**
 * API概述
 * 常用类
 *  Object类和Scanner类
 *  String类/StringBuffer类/stringBuilder类
 *  数组高级和Arrays类
 *  基本类型包装类（Integer,Character）
 *  正则表达式
 *  Math/Random/System
 *  其他类
 */
public class text014 {
    /**
     * 1.Object类
     * 	(1)是类层次结构的根类，所有类都直接或者间接的继承自该类
     * 	(2)构造方法：
     * 		只有一个无参构造方法。
     * 		这就可以帮助我们理解前面说过的：子类构造方法默认访问父类的无参构造方法
     * 	(3)成员方法：
     * 		public int hashCode():-------------------返回该对象的哈希码值。
     * 			哈希值不是地址值，可以理解为地址值。
     * 		public final Class<?> getClass():--------返回此 Object 的运行时类。
     * 		public String toString():----------------返回该对象的字符串表示。
     * 			这个方法没有意义，建议重写。重写怎么写呢?自动生成。
     * 		public boolean equals(Object obj):-------比较对象是否相同。
     * 			这个方法默认比较没有意义，建议重写。重写怎么写呢?自动生成。
     * 		protected void finalize():---------------被垃圾回收器对象调用，用于处理垃圾
     * 		protected Object clone():----------------克隆对象
     * 			对象要想能够使用克隆方法，对象所属的类必须实现克隆接口。
     * 	(4)面试题：(掌握)
     * 		==和equals()的区别?
     * 		A:==
     * 			基本类型：比较的是基本类型的值是否相同
     * 			引用类型：比较的是引用类型的地址值是否相同
     * 		B:equals()
     * 			只能比较引用类型，默认比较的是对象的地址值是否相同。
     * 			但是，可能被重写，一定要根据实际的情况来看。
     */
    /**
     * 2.Scanner(理解)
     * 	(1)JDK5以后，帮助我们实现键盘录入数据的。
     * 	(2)构造方法：
     * 		public Scanner(InputStream is)
     *
     * 		Scanner sc = new Scanner(System.in);
     * 	(3)成员方法：
     * 		A:hasNextXxx() 判断是否是xxx类型的元素
     * 		B:nextXxx() 获取xxx类型的元素
     * 	(4)常用的两个方法
     * 		nextInt():获取一个int类型的数据
     * 		nextLine():获取一个String类型的数据
     * 	(5)注意的小问题：
     * 		int--int
     * 		String--String
     * 		String--int
     *
     * 		int--String 有问题
     *
     * 		如何解决呢?
     * 			A:所有数据都作为String,将来要什么，就转换为什么。
     * 			B:重新创建一个新的Scanner对象
     */
    /**
     * 3.String(掌握)
     * 	(1)字符串：由多个字符组成的一串数据
     * 	(2)构造方法：
     * 		public String():创建String对象
     * 		public String(byte[] bytes):把字节数组转成字符串。
     * 		public String(byte[] bytes,int index,int length):把字节数组中的一部分转成字符串
     * 		public String(char[] value):把字符数组转成字符串
     * 		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
     * 		public String(String original):把字符串转成字符串
     *
     * 		String s = "hello";
     * 	(3)字符串的特点和面试题
     * 		A:一旦被创建，值就不能发生改变
     * 		B:String s = new String("hello")和String s = "hello"的区别
     * 		C:看程序写结果 ==和equals()的区别
     * 		D:看程序写结果 字符串变量相加和常量相加的区别
     * 	(4)常见功能
     * 		A:判断功能
     * 			boolean equals(Object obj):比较字符串的内容是否相同，严格区分大小写
     * 			boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不考虑大小写
     * 			boolean contains(String str):判断是否包含指定的小串
     * 			boolean startsWith(String str):判断是否以指定的字符串开头
     * 			boolean endsWith(String str):判断是否以指定的字符串结尾
     * 			boolean isEmpty():判断字符串的内容是否为空
     * 		B:获取功能
     * 			int length():返回字符串的长度。字符的个数。
     * 			char charAt(int index):返回字符串中指定位置的字符。
     * 			int indexOf(int ch):返回指定字符在字符串中第一次出现的位置
     * 					97,'a'
     * 			int indexOf(String str):返回指定字符串在字符串中第一次出现的位置
     * 			int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
     * 			int indexOf(String str,int fromIndex):返回指定字符串从指定位置开始在字符串中第一次出现的位置
     * 			String substring(int start):返回从指定位置开始到末尾的子串
     * 			String substring(int start,int end):返回从指定位置开始到指定位置结束的子串
     * 		C:转换功能
     * 			byte[] getBytes():把字符串转换为字节数组
     * 			char[] toCharArray():把字符串转换为字符数组
     * 			static String valueOf(char[] chs):把字符数组转成字符串
     * 			static String valueOf(int i):把int类型的数据转成字符串
     * 					把任意类型转换为字符串的方法。
     * 			String toLowerCase():把字符串转小写
     * 			String toUpperCase():把字符串转大写
     * 			String concat(String str):字符串的连接
     * 		D:其他功能
     * 			a:替换功能
     * 				String replace(char old,char new)
     * 				String replace(String old,String new)
     * 			b:去除字符串两空格
     * 				String trim()
     * 			c:按字典顺序比较两个字符串
     * 				int compareTo(String str)
     * 				int compareToIgnoreCase(String str)
     * 	(5)案例：
     * 		A:模拟用户登录
     * 		B:遍历字符串
     * 			a:charAt()和length()结合
     * 			b:转数组
     * 		C:统计每种类型的字符个数
     * 		D:把字符串首字母转大写，其他小写
     * 		E:把数组转成指定格式的字符串
     * 		F:字符串反转
     * 		G:统计大串中小串出现的次数
     * 			a:从指定位置开始查
     * 			b:把查过的截取掉
     * 		H:自己实现两个字符串的比较以及String类的equals()方法源码
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 测试 hasNextInt()
        System.out.print("请输入一个整数（输入非整数结束）: ");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("您输入的整数是: " + num);
            System.out.print("请继续输入整数（输入非整数结束）: ");
        }
        System.out.println("检测到非整数输入，循环结束。");
        // 清空缓冲区（重要！）
        sc.nextLine();
        // 2. 测试 hasNextLine()
        System.out.print("\n请输入一行文本（输入空行结束）: ");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            System.out.println("您输入的文本是: " + line);
            System.out.print("请继续输入文本（输入空行结束）: ");
        }
        System.out.println("程序结束");
        sc.close();

        //string的不同创建方式
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);  // true（常量池同一引用）
        System.out.println(s1 == s3);  // false（堆 vs 常量池）
        System.out.println(s3 == s4);  // false（堆中不同对象）
        System.out.println(s1.equals(s3)); // true（内容相同）

        //Object类的clone使用
        Student111 ss = new Student111("wuzeyu",12);
        Student111 css =null;
        try {
             css = (Student111) ss.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(css.getName());

    }
}

class Student111 implements Cloneable{
    public String name;
    public int age;

    public Student111(){}
    public Student111(String name, int age) {
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

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}


