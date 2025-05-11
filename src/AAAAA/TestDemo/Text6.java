package AAAAA.TestDemo;

/**
 * @Auther: zhaoss
 * @Date: 2021/4/13 - 11:50
 * @Description:
 * @version: 1.0
 */
import java.io.*;
import java.net.Socket;
public class Text6 {
    public static void main(String[] args) {
        String clientInfo = null;
        Socket mySocket;
        DataInputStream in = null;
        DataOutputStream out = null;
        try{
            mySocket = new Socket("localhost",4212);
            in = new DataInputStream(mySocket.getInputStream());
            out = new DataOutputStream(mySocket.getOutputStream());
            out.writeUTF("你好！");
            for(int i = 0 ; i < 4 ; i++ ){
                clientInfo = in.readUTF();
                out.writeUTF(":"+Math.random());
                System.out.println("客户端收到："+clientInfo);
                Thread.sleep(800);
            }
            out.close();
            in.close();
            mySocket.close();
        }catch(IOException e ){
            System.out.println("无法连接");
        }
        catch (InterruptedException e){

        }
    }
}
