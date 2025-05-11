package AAAAA.TestDemo;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/18 - 15:29
 * @Description:
 */

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

    static int wenjianjia = 0;
    static int wenjian = 0;

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件夹路径");
        File file = new File(sc.nextLine());
        getFile(file, map);
        System.out.println(wenjian+" "+wenjianjia);

    }
    public static void getFile(File file, Map<String, Integer> map) {
        File[] files = file.listFiles();
        for (File f2 : files) {
            // 如果是文件
            if (f2.isFile()) {
                wenjian++;
            }
            // 如果是文件夹
            if (f2.isDirectory()) {
                wenjianjia++;
            }
        }
    }
}



