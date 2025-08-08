package wofuhuola.jinjie.X18_JDBC;

import java.sql.*;
import java.util.*;

public class JDBCTest03 {
    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.cj.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String user = "root";
        String password = "123123";

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(url,user,password);

            stmt = conn.createStatement();

            int count = stmt.executeUpdate("insert into dept(deptno,dname,loc) values(50,'人事部','北京');");

            System.out.println(count == 1? "保存成功":"保存失败");

        } catch(SQLException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
