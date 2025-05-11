package AAAAA.Test.TestAnnotation;

import java.util.ArrayList;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/23 - 14:58
 * @Description:
 * @version: 1.0
 */
public class Student {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int age = 10;

        int num = 10;
        System.out.println(num);
        @SuppressWarnings({"unused"})
        ArrayList al= new ArrayList();
    }
}
