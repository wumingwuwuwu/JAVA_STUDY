package wofuhuola.jinjie.ExceptionTest.Breach01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常：编译时异常、运行时异常
 */
public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        /**
         * 异常
         * 	(1)程序出现的不正常的情况。
         * 	(2)异常分类
         * 		Throwable
         * 			|--Error	严重的问题，不需要处理
         * 			|--Exception
         * 				|--RuntimeException	可以处理，也可以不处理。一般就是程序出问题了，需要该程序。
         * 				|--非RuntimeException	是需要进行处理的，否则编译不通过。
         * 		举例：班长去旅游
         * 	(3)jvm的默认处理方案
         * 		把异常的类名，原因，和位置等信息输出在了控制台。
         * 		会在哪里跌倒哪里坐下来。程序停止。
         * 	(4)自己处理异常的方案
         * 		A:try...catch...finally
         * 			变形:
         * 				try...catch...
         * 				try...catch...catch...catch...
         * 				try...catch...finally
         * 				try...catch...catch...catch...finally
         * 				try...finally
         * 		B:throws
         * 			把问题抛出
         * 		建议使用A处理方案。实在解决不了，使用B方案。
         */
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
