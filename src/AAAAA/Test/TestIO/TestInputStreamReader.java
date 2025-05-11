package AAAAA.Test.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/19 - 20:57
 * @Description:
 * @version: 1.0
 */
public class TestInputStreamReader {
    public static void main(String[] args) throws IOException {
        //文件 --》 程序
        //1.有一个源文件
        File f = new File("E:\\java\\TestIO\\Demo.txt");
        //2.需要一个输出的字节流接触文件
        FileInputStream fis = new FileInputStream(f);
        //3.加入一个转换流，将字符流转换成
        //将字节流换为字符的时候，需要指定一个编码，这个编码跟文件本身的编码相统一
        //不统一则会出现乱码
        //InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //不加编码的情况直接获取文件本身的编码
        InputStreamReader isr = new InputStreamReader(fis);
        //4.开始打印。将文件内容打印到控制台上
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len != -1){
            //将缓冲数组转为字符串在控制台打印出来
            System.out.print(new String(ch,0,len));

            len = isr.read(ch);
        }

        //5.关闭流
        isr.close();
    }
}
