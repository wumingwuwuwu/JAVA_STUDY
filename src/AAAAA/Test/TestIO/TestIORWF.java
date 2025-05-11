package AAAAA.Test.TestIO;

import java.io.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/20 - 10:50
 * @Description:
 * @version: 1.0
 */
public class TestIORWF {
    public static void main(String[] args) throws IOException{
        //1.有一个源文件
        File f = new File("E:\\java\\TestIO\\Demo.txt");
        //2.有一个目标文件
        File f1 = new File("E:\\java\\TestIO\\Demo(1).txt");
        //3.需要一个输出的字节流接触源文件
        FileInputStream fis = new FileInputStream(f);
        //4.需要一个输入的字节流接触目标文件
        FileOutputStream fos = new FileOutputStream(f1);
        //5.加入一个转换流，将输入字符流转换成
        InputStreamReader isr = new InputStreamReader(fis);
        //6.加入一个转换流，将输出字符流转换成
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //7.开始复制
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len != -1){
            //将缓冲数组转为字符串在控制台打印出来
            osw.write(ch,0,len);
            len = isr.read(ch);
        }
        //8.关闭流
        osw.close();
        isr.close();

    }
}
