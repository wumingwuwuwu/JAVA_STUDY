package AAAAA.Test.TestIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/16 - 20:29
 * @Description:
 * @version: 1.0
 */

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        //文件—（数据）—》程序
        //1.有一个文件：创建一个File类对象
        File f = new File("E:\\java\\TestIO\\test.txt");
        //2.利用FileReader这个流将管，接到源文件上————》创建一个FileReader的流的对象
        FileReader fr= new FileReader(f);
        //3.进行读取
        char[] ch = new char[5];
        int len = fr.read(ch);//一次读取数组长度的字符
        while(len != -1){

            len = fr.read(ch);
        }

        //4.管道不用了就要关闭（必须）
        //流、数据库、网络资源，靠JVM本身无法代替我们关闭，此时程序员必须要手动关闭：
        fr.close();
    }
}
