package AAAAA.ObjectTest.sample03;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/2 - 10:18
 * @Description:
 */
public class Mark1 {
    protected String title;
    protected String color;
    protected String movie;

    //描述属性
    public void description(){
        System.out.println(this.title);
        System.out.println(this.color);
        System.out.println(this.movie);
    }
    //描述特点
    protected void character(){
        System.out.println("燃料泵喷射火焰");
    }

    public static void main(String[] args) {
        Mark1 mark1 = new Mark1();
        mark1.color = "银色";
        mark1.title = "马克一型";
        mark1.movie = "钢铁侠1";
        mark1.description();
        mark1.character();

    }

}
