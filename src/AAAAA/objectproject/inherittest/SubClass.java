package AAAAA.objectproject.inherittest;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/1 - 0:28
 * @Description:
 */
public class SubClass extends SuperClass {
    /**
     * 无参构造器
     */
    public SubClass(){
        //由于SuperClass没有无参构造器，所以必须在子类构造器中通过 super("字符串")来调用，否则编译器会报错。
        //如果没定义该句，则编译器会默认调用 super()
        super("");
    }
    /**
     * 带参构造器
     * @param subStr
     */
    public SubClass(String subStr){
        //由于SuperClass没有无参构造器，所以必须在子类构造器中通过 super("字符串")来调用，否则编译器会报错。
        //如果没定义该句，则编译器会默认调用 super()
        super(subStr);
    }


    public static void main(String[] args) {
        SubClass sub = new SubClass();

    }
}