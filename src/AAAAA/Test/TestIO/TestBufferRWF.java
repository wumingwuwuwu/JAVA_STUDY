package AAAAA.Test.TestIO;
import java.io.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/18 - 11:22
 * @Description:
 * @version: 1.0
 */
public class TestBufferRWF {
    public static void main(String[] args) throws IOException {
        //1.一个源文件
        File f = new File("E:\\java\\TestIO\\demo.txt");
        //2.接一个输入管道到源文件
        FileReader fr = new FileReader(f);
        //3.功能加强，在FileReader外面套一个管BufferedReader
        BufferedReader br = new BufferedReader(fr);
        //4.一个目标文件
        File f1 = new File("E:\\java\\TestIO\\demo(1).txt");
        //5.接一个输出管道到目标文件
        FileWriter fw = new FileWriter(f1);
        //6.功能加强，在FileWriter外面套一个管BufferedWriter
        BufferedWriter bw = new BufferedWriter(fw);
        //7.开始复制操作
        //方式一，一个一个字符复制
        int len = br.read();
        while(len != -1){
            bw.write(len);
            len = br.read();
        }
        /*
        //方式二，利用缓冲字符数组
        char[] ch = new char[30];
        int len = br.read(ch);
        while(len != -1){
            bw.write(ch,0,len);
            len = br.read(ch);
        }
        * */

        //8.关闭流（关闭流的时候，后用先关）
        bw.close();
        br.close();
    }
}
