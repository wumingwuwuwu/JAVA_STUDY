package wofuhuola.jichu;

/**
 * 方法
 */
public class text010 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println(c+" "+Add(a,b));
        System.out.println(Max(a,b));
        System.out.println(Max(a,b,c));
        System.out.println(Equal(a,b));
    }

    /**
     * 方法的格式：
     * 修饰符 返回值数据类型 方法名（参数类型 形参名1，参数类型 形参名2……）{
     *     函数体；
     *     return 返回值；
     * }
     * @param num1
     * @param num2
     * @return
     */
    //两数相加
    public static double Add(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * 返回参数中较大值
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int Max(int num1 ,int num2,int num3) {
        return num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3) ;
    }
    //Max方法重载（只看方法名和参数列表 ）
    public static int Max(int num1 ,int num2){
        return num1 > num2 ? num1 : num2 ;
    }

    /**
     * 是否相等
     * @param num1
     * @param num2
     * @return
     */
    public static String Equal(int num1 , int num2) {
        if(num1 == num2){
            return "这俩数相等";
        }else{
            return "这俩数不等";
        }
    }

}
