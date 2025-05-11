package AAAAA.ObjectTest.sample03;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/2 - 11:42
 * @Description:
 */
/*
* extends关键字用于类的继承
* extends关键字 后面的是父类 前面的是子类
* 子类会继承 (default)/protected/public修饰的成员变量与方法
*   */
public class UnHulk extends Mark1{

    //当子类有同类型同名的方法时，不继承父类的方法而是将父类的方法给覆盖了
    //子类在覆盖父类方法时，可以扩大父类中方法地权限，但不可以缩小父类的方法权限
    //public -> protected -> private
    protected void character(){
        System.out.println("可以弹射装甲替换战损部件");
    }
    //这里如果想再用被子类方法覆盖了的父类的方法只能在新建一个方法
    //因为this，super都是对象的引用，不能用在static中
    /*
    protected void Character(){
        super.character();
    }
    */

    public static void main(String[] args) {
        UnHulk unHulk = new UnHulk();
        unHulk.color = "金红色";
        unHulk.title = "反浩克装甲";
        unHulk.movie = "复联2";
        unHulk.description();
        unHulk.character();
        //unHulk.Character();
    }

}
