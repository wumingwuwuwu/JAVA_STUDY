package BBBBBB._TestProject2;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2022/2/23 - 20:21
 * @Description:
 * @version: 1.0
 */
public class Account {
    private double balance ;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        balance -= amt;
    }

}
