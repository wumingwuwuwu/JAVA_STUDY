package AAAAA.objectproject.duotai.overridetext;

import AAAAA.objectproject.duotai.interfacetext.Sata;
import AAAAA.objectproject.duotai.interfacetext.Sata_HDD;
import AAAAA.objectproject.duotai.interfacetext.Sata_SSD;

/*
 * @Authnr:wumingwuwuwu
 * @Date: 2021/2/7 - 0:08
 * @Description:
 */
public class Service_Sata_O {
    public Sata contact(Boolean i){
        if(i == true){
            return new Sata_SSD();
        }else {
            return new Sata_HDD();
        }
    }
}
