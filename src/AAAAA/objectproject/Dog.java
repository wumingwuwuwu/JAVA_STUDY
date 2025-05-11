package AAAAA.objectproject;

/*
 * @Authnr:wumingwuwuwu
 * @Date: 2021/1/28 - 20:19
 * @Description:
 */
public class Dog {
    String name;
    int age ;
    double weight;

    public static void main(String[] args){
        Dog duoDuo = new Dog();
        duoDuo.name = "多多";
        duoDuo.age = 3;
        duoDuo.weight = 12.3f;
        Dog daBao = new Dog();
        daBao.name  = "大宝";
        daBao.age = 2;
        daBao.weight = 9.3f ;
        System.out.println(duoDuo.name + " " + duoDuo.weight);
    }

}
