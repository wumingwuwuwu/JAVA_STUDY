package AAAAA.Test.TestIO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/17 - 17:46
 * @Description:
 * @version: 1.0
 */
public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        //文件—（数据）—》程序，用字节流。
        //1.一个源文件
        File f = new File("E:\\java\\TestIO\\ewwq.jpg");
        //2.将字节流接到源文件
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取文件
        byte[] b = new byte[1024*6];
        int len = fis.read(b);
        while(len!=-1){
            //System.out.println(len);
            for (int i = 0; i < len; i++) {
                System.out.println(b[i]);
            }
            len = fis.read(b);
        }
        //4.关闭流
        fis.close();

    }
}
