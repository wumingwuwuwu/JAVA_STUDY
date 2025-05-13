package wofuhuola.jichu;

/**
 * 数组
 */
public class text011 {
    public static void main(String[] args) {
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] =arr[i]*2;
            System.out.println(arr[i]);
        }
        System.out.println(getMax(arr));
    }

    /**
     * 返回数组最大值
     * @param arr
     * @return
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 反转
     * @param arr
     */
    public static void reverse(int[] arr){
        for (int qian = 0,hou = arr.length-1; qian <= hou; qian++,hou--) {
            int temp = arr[qian];
            arr[qian] = arr[hou];
            arr[hou] = temp;
        }
    }
}
