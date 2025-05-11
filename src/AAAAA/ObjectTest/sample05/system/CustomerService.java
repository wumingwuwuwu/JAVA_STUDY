package AAAAA.ObjectTest.sample05.system;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/5 - 21:07
 * @Description:
 */
public class CustomerService {
    public Language contact(int areaCode){
        if(areaCode == 86){
            return new Chinese();
        }else if(areaCode == 33){
            return new French();
        }else{
            return new English();
        }
    }
}
