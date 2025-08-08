package wofuhuola.jinjie.X15_IO;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IODemo {
    /**
     * File只能对文件本身进行操作，对文件的内容操作不了
     * IO流可以读写文件的内容
     * IO流分类：
     * 		A:数据流向（以内存为参照，从内存到其他是输出，从其他到内存是输入）
     * 			输入流	读数据
     * 			输出流	写数据
     * 		B:数据类型
     * 			字节流
     * 			字符流
     * 		默认情况下，IO流分类说的是按照数据类型分。
     *
     * IO流的四个基类：
     * 		字节流
     * 			字节输入流	InputStream
     * 			字节输出流	OutputStream
     * 		字符流
     * 			字符输入流	Reader
     * 			字符输出流	Writer
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\FileDisk\\java\\IdeaData\\src\\ziyuan\\text.txt");
        String s = "吴泽羽";
        byte[] num = s.getBytes();
        //byte[] num = {97,98,99,100,101,102};
        //1.写入
        fos.write(num);
        //2.释放资源
        fos.close();
        System.out.println(Arrays.toString(num));

    }
}
