package AAAAA.Test.TestAnnotation;

/**
 * //作者
 * @Auther: wumingwuwuwu
 * //日期
 * @Date: 2021/5/21 - 15:22
 * @Description:
 * //版本号
 * @version: 1.0
 */
public class Person {
    /**
     * 下面的是eat方法，实现了
     * //说明变量的意义
     * @param num1 int 就餐的人数
     * @param num2 int 点菜的数量
     */
    public void eat(int num1,int num2){

    }
    /**
     * @param qwe
     * //说明该方法返回值的返回类型
     * @return int
     * //说明异常的种类 和 异常出现的情况
     * @exception RuntimeException 当年龄过大的时候
     * @exception ArrayIndexOutOfBoundsException 当年龄过小
     * @see Student
     */
    public int sleep(int qwe){
        new Student();
        if(qwe > 100){
            throw new RuntimeException();
        }
        if(qwe < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return qwe;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sleep(12);
    }

}
