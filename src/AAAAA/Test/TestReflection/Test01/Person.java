package AAAAA.Test.TestReflection.Test01;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 9:14
 * @Description:
 * @version: 1.0
 */
public class Person implements MyInterface{
    //属性
    private int num;
    public int name;


    //方法
    private void eat(){
        System.out.println("eat food");
    }

    public void look(){
        System.out.println("I see something");
    }

    @Override
    public void mapa() {

    }
}
