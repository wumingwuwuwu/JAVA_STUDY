package AAAAA.Test.TestIO.Stream;

import java.io.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/18 - 8:51
 * @Description:
 * @version: 1.0
 */
public class TestIOF {
    public static void main(String[] args) throws IOException {
        //功能：复制图片
        //1.有一个源图片：
        File f = new File("E:\\java\\TestIO\\ewwq.jpg");
        //2.有一个目标图片：
        File f1 = new File("E:\\java\\TestIO\\ewwqq.jpg");
        //3.将一个输入流管道接在源图片上（将数据带到程序）
        FileInputStream fis = new FileInputStream(f);
        //4.将一个输出流管道接在目标图片上（将数据送到目标文件）
        FileOutputStream fos = new FileOutputStream(f1);
        //5.开始复制（边读边写）
        long startTime = System.currentTimeMillis();
        int n = fis.read();
        while(n != -1){
            fos.write(n);
            n = fis.read();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制需要的时间为："+(endTime-startTime));
        //利用缓冲数组
        /*
        long startTime = System.currentTimeMillis();
        byte[] b = new byte[1024*8];
        int len = fis.read(b);
        while(len != -1){
            fos.write(b);
            len = fis.read(b,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制需要的时间为："+(endTime-startTime));
        * */
        //6.关闭流
        fos.close();
        fis.close();

    }
}
