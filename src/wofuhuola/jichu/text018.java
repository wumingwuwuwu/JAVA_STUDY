package wofuhuola.jichu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class text018 {
    public static void main(String[] args) {
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","123123");
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
