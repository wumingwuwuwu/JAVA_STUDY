package wofuhuola.jinjie.ExceptionTest.Breach01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常：编译时异常、运行时异常
 */
public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        //编译时异常(在编译阶段，必须要手动处理，否则代码报错)
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);

        //运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int[] arr = {1,2,3,4,5};
        //ArrayIndexOutOfBoundsException数组越界
        System.out.println(arr[10]);

        //NullPointerException空指针异常
        Student[] arr1 = new Student[3];// null null null
        String name = arr1[0].getName();
        System.out.println(name);



    }
}
