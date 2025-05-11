package AAAAA.TestDemo;

/**
 * @Auther: zhaoss
 * @Date: 2021/4/13 - 9:26
 * @Description:
 * @version: 1.0
 */
import java.net.InetAddress;
public class Text4 {
    public static void main(String[] args) throws Exception{
        InetAddress ia;
        //获取本地主机的InetAddress
        ia = InetAddress.getLocalHost();
        //输出本地的主机的ip地址
        System.out.println("本地主机的IP地址为"+ia.getHostAddress());
        //输出主机名
        System.out.println("本地主机名"+ia.getHostName());
        //获得百度网主机的InetAddress对象
        ia = InetAddress.getByName("www.baidu.com");
        //输出百度网的ip地址
        System.out.println("百度网的IP地址"+ia.getHostAddress());
        //输出百度网主机名
        System.out.println("百度网的主机名"+ia.getHostName());

    }
}
