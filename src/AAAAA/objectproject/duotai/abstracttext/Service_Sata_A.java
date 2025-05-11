package AAAAA.objectproject.duotai.abstracttext;

import AAAAA.objectproject.duotai.interfacetext.Sata;
import AAAAA.objectproject.duotai.interfacetext.Sata_HDD;
import AAAAA.objectproject.duotai.interfacetext.Sata_SSD;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/7 - 0:10
 * @Description:
 */
public class Service_Sata_A {
    public Sata contact(Boolean i){
        if(i == true){
            return new Sata_SSD();
        }else {
            return new Sata_HDD();
        }
    }
}
