package wofuhuola.jinjie.X15_IO.XX1_ZijieStream.File.FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\ziyuan\\a.txt");
        // OutputStream os = new FileOutputStream("a.txt");
        /*
         * 创建字节输入流对象做了哪些事情呢? A:调用系统功能创建了一个文件a.txt B:创建了一个对象fos
         * C:把fos对象指向了a.txt文件
         */

        // 写数据
        // public void write(int b):一次写一个字节的数据
        // fos.write(57);
        // fos.write(55);
        // fos.write(97);

        // public void write(byte[] b):一次写一个字节数组的数据
        // byte[] bys = {97,98,99,100,101};
        // fos.write(bys);
        // 曾经我们讲解过，可以通过String得到byte[]
        // byte[] bys = "abcde".getBytes();
        // fos.write(bys);
        fos.write("helloworld".getBytes());

        // public void write(byte[] b,int off,int len):一次写一个字节数组的一部分
        // fos.write("helloworld".getBytes(), 0, 5);
        // fos.write("helloworld".getBytes(), 0, "helloworld".length());

        //释放资源
        fos.close();
        //关闭此文件输出流并释放与此流有关的所有系统资源。
        /*
         * 两件事情：
         * A:关闭流对象(流对象不可以继续在写数据了)
         * B:释放与此流相关的资源(通知系统去释放与此流相关的资源)
         */

    }
}
