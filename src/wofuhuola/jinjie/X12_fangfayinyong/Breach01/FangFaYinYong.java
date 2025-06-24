package wofuhuola.jinjie.X12_fangfayinyong.Breach01;

import java.util.Arrays;

public class FangFaYinYong {
    public static void main(String[] args) {
        Integer[] nums = {12,12,3,23,123,21,3,43,36,1,4,52,3,52,5,76,5,43,52};
        for (int num : nums) {
            System.out.print(num+"-");
        }
        System.out.println("==================================");
//        Arrays.sort(nums, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        //方法不能用基本数据类型是能用引用数据类型
        Arrays.sort(nums, FangFaYinYong::DES);
        for (int num : nums) {
            System.out.print(num+"-");
        }
    }

    public static int DES(int a,int b) {
        return b - a;
    }
}
