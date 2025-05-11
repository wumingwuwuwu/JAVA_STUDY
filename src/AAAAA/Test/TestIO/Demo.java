package AAAAA.Test.TestIO;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/13 - 6:40
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //将文件封装为一个对象
        File f = new File("E:\\wewe.txt");
        File f1 = new File("E:/wewe.text");
        //File.separator属性帮我们获取当前操作系统的路径拼接符号
        File f2 = new File("e:"+File.separator+"wewe.txt");

        //常用方法
        System.out.println("文件是否可读"+f.canRead());
        System.out.println("文件是否可写"+f.canWrite());
        System.out.println("文件的名字为"+f.getName());
        System.out.println("文件的上级目录为"+f.getParent());
        System.out.println("是否是一个目录"+f.isDirectory());
        System.out.println("是否是一个文件"+f.isFile());
        System.out.println("文件的大小"+f.length());
        /*
        if(f.exists()){         //判断文件是否存在
            f.delete();         //存在则删除
        }else{
            f.createNewFile();  //不存在则创建
        }
        * */
        System.out.println(f == f1);
        System.out.println(f.equals(f1));

        //跟路径相关的
        //绝对路径就是指的是完整的路径
        System.out.println("绝对路径："+f.getCanonicalPath());
        //相对路径就是指的是有一个参照物，相对于这个参照物的路径
        System.out.println("相对路径："+f.getPath());
        //toString的结果永远是相对路径
        System.out.println("toString:"+f.toString());

        File f4 = new File("DAda.txt");
        if(!f4.exists() ){
            f4.createNewFile();
        }
        System.out.println("绝对路径："+f4.getCanonicalPath());
        System.out.println("相对路径："+f4.getPath());
        System.out.println("toString:"+f4.toString());


    }
}
