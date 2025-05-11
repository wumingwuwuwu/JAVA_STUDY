package AAAAA.TestDemo;

/**
 * @Auther: zhaoss
 * @Date: 2021/4/13 - 10:58
 * @Description:
 * @version: 1.0
 */
import java.io.*;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class Text5 {
    public static void main(String[] args) {
        try{
            Socket conn = new Socket("stdtime.gov.hk",13);
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String dayTime = in.readLine();
            System.out.println("DayTime :"+dayTime);
            conn.close();
        }catch(IOException e){
            System.out.println("Error:" + e);
        }
    }
}
