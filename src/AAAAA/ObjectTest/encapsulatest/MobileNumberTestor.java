package AAAAA.ObjectTest.encapsulatest;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/1 - 21:54
 * @Description:
 */
public class MobileNumberTestor {
    public static void main(String[] args) {
        MobileNumber mobileNumber = new MobileNumber();
        mobileNumber.setOwner("leo");
        mobileNumber.setNumber(123123123);
        String owner = mobileNumber.getOwner();
        String areaCode = mobileNumber.getAreaCode();
        long number = mobileNumber.getNumber();
        System.out.println(owner);
        System.out.println(areaCode);
        System.out.println(number);

    }
}
