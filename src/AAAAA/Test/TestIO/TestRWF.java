package AAAAA.Test.TestIO;

import java.io.*;

/**
 * @author 1
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/16 - 23:09
 * @Description:
 * @version: 1.0
 */
/*
用Reader和Writer将文件复制
 */
public class TestRWF {
    public static void main(String[] args) {
        File f = new File("E:\\java\\TestIO\\demo.txt");
        FileReader fr = null;
        File f1 = new File("E:\\java\\TestIO\\demo(1).txt");
        FileWriter fw = null;
        try{
            fr = new FileReader(f);
            fw = new FileWriter(f1);
            char[] ch = new char[5];
            int len = fr.read(ch);
            while(len != -1){
                fw.write(ch,0,len);
                len = fr.read(ch);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
