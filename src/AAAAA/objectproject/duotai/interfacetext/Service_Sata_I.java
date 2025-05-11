package AAAAA.objectproject.duotai.interfacetext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:15
 * @Description:
 */
public class Service_Sata_I {
    public Sata contact(Boolean i){
        if(i == true){
            return new Sata_SSD();
        }else {
            return new Sata_HDD();
        }
    }
}
