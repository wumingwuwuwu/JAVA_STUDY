package AAAAA.Test.TestIO;

import java.io.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/16 - 21:12
 * @Description:
 * @version: 1.0
 */
public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        //程序—（数据）—》文件
        //1.有一个文件：创建一个File类对象
        File f = new File("E:\\java\\TestIO\\demo.txt");
        //2.利用FileWriter这个流将管，接到源文件上————》创建一个FileWriter的流的对象
        FileWriter fw= new FileWriter(f);
        //3.进行写出
        String str = new String("hello 你好");
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        //关闭流
        fw.close();
    }
}
