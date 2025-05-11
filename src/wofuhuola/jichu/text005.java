package wofuhuola.jichu;

public class text005 {
    public static void main(String[] args) {
        int num1 = 61;
        int num2 = 59;
        //if分支语句
        if(num1>=60){
            System.out.println("及格了");
        }else{
            System.out.println("不及格");
        }
        if(num2>=60){
            System.out.println("及格了");
        }else{
            System.out.println("不及格");
        }
        //循环不变的就是循环体和跳出点
        //while循环
        int num = 1;
        int sum = 0;
        while(num<=5){
            sum += num;
            num++;
        }
        System.out.println(sum);
        sum = 0;
        num = 1;

        //do-while循环
        do{
            sum += num;
            num++;
        }while (num<=10);
        System.out.println(sum);
        sum = 0;
        num = 1;

        //for循环
        for (num = 0; num <= 100; num++) {
            sum += num;
        }
        System.out.println(sum);
        num = 1;
        sum = 0;

        //break
        //从1逐一累加，和达到300以上输出当前num和sum
        for (int i = 0; i < 200; i++) {
            sum += i;
            if(sum > 300){
                System.out.println(sum);
                System.out.println(i);
                break;
            }
        }

        //continue
        //输出100以内能被6整除
        for (int numi = 0; numi <= 100; numi++) {
            if(numi%6 != 0){
                continue;
            }
            System.out.println(numi);
        }

        //递归函数
        text005 tnum = new text005();
        tnum.reversePrintDigits(12);;
    }
    public static void reversePrintDigits(int n) {
        if (n < 0) {
            reversePrintDigits(-n);
            return;
        }
        if (n < 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n % 10);
        reversePrintDigits(n / 10);
    }

}
