package BBBBBB.Test;
import BBBBBB._TestProject2.Account;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2022/2/23 - 20:37
 * @Description:
 * @version: 1.0
 */
public class test2 {
    public static void main(String[] args) {
        Account account = null;
        account = new Account(500);
        account.withdraw(150);
        account.deposit(22.50);
        account.withdraw(47.62);


        System.out.println(account.getBalance());
    }
}
