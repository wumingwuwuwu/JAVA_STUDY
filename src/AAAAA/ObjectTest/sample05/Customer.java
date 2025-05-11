package AAAAA.ObjectTest.sample05;

import AAAAA.ObjectTest.sample05.system.CustomerService;
import AAAAA.ObjectTest.sample05.system.Language;
import java.util.Scanner;
/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/5 - 21:27
 * @Description:
 */
public class Customer {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        int areaCode = scanner.nextInt();
        Language language = customerService.contact(areaCode);
        language.voice();
    }
}
