package AAAAA.ObjectTest.abc;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/2 - 15:02
 * @Description:
 */
public class c extends b
{

    void show() {
        System.out.println("c");

    }
    void showc() {
        super.show();
        show();
    }

}