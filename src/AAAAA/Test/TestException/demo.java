package AAAAA.Test.TestException;

import java.util.Scanner;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/4 - 11:22
 * @Description:
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args)  {
        try {
            defa();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void defa() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数");
        int num2 = scanner.nextInt();
        if(num2  == 0){
            throw new Exception("除数不能为零");
        }else{
            System.out.println("两者之商为："+num1/num2);
        }

    }
}
