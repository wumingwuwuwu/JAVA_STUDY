package AAAAA.Test.TestIO;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/13 - 9:41
 * @Description:
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //将目录封装为一个Fill类的对象
        File f = new File("E:\\java\\jiandan") ;
        System.out.println("文件是否可读"+f.canRead());
        System.out.println("文件是否可写"+f.canWrite());
        System.out.println("文件的名字为"+f.getName());
        System.out.println("文件的上级目录为"+f.getParent());
        System.out.println("是否是一个目录"+f.isDirectory());
        System.out.println("是否是一个文件"+f.isFile());
        System.out.println("文件的大小"+f.length());
        System.out.println("绝对路径："+f.getCanonicalPath());
        System.out.println("相对路径："+f.getPath());
        System.out.println("toString:"+f.toString());
        //跟目录相关的方法
        File f1 = new File("E:\\java\\wang\\wang1\\wang2");
        //创建目录
        //f1.mkdir();//创建单层目录
        //f1.mkdirs();//创建多层目录

        //删除:如果删除目录，只会删一层，且前提是：这层目录为空，如果有内容则不会删除
        f1.delete();

        //查看：
        String[] list = f.list();
        for (String i:list) {
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //listFiles()返回一个File类型
        File[] files = f.listFiles();
        for (File i : files) {
            //getName():获取文件名，getAbsolutePath():获取文件的绝对路径
            System.out.println(i.getName()+"\t\t"+i.getAbsolutePath());
        }
    }
}
