package wofuhuola.jinjie.X14_File.Breach01;

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        /**
         * public File[] listFiles()       获取当前该路径下所有内容返回File数组
         * 当调用者File表示的路径不存在时，返回NULL
         * 当调用者File表示的路径是文件时，返回NULL
         * 当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
         * 遍历时包括隐藏文件，不包括无权限的文件夹
         */
        //1.创建File对象
        File f = new File("D:\\aaa");
        //2.listFiles方法
        //作用：获取aaa文件夹里面的所有内容，把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            //file依次表示aaa文件夹里面的每一个文件或者文件夹的路径
            System.out.println(file);
        }


    }
}
