package AAAAA.Test.TestIO.Stream;

import java.io.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/18 - 10:18
 * @Description:
 * @version: 1.0
 */
public class TestBufferIO {
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

        //5.功能加强，在FileInputStream外面套一个管BufferedInputStream
        BufferedInputStream Bis = new BufferedInputStream(fis);

        //6.功能加强，在FileIOutputStream外面套一个管BufferedOutputStream
        BufferedOutputStream Bos = new BufferedOutputStream(fos);

        //7. 开始复制
        long startTime = System.currentTimeMillis();
        byte[] b = new byte[1024*8];
        int len = Bis.read(b);
        while(len != -1){
            Bos.write(b);
            /*Bos.flush();底层已经泵我们做了这个刷新缓冲区的操作，不用我们手动完成了，底层调用flushBuffer()*/
            len = Bis.read(b,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制需要的时间为："+(endTime-startTime));

        //8.关闭流
        //其实只用关闭外层的处理流
        Bos.close();
        Bis.close();
        fos.close();
        fis.close();

    }
}
