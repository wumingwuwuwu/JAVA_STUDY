package wofuhuola.jinjie.X18_JDBC;

import java.sql.*;

public class JDBCTest04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","root");
            //3、获取数据库连接对象
            stmt = conn.createStatement();
            //执行sql
            String sql = "select empno,ename,sal from emp;";
            rs = stmt.executeQuery(sql);
            //5、处理查询结构集
            while (rs.next()) {
                //1、第一种方法
                //String empno = rs.getString(1); //第一列
                //String ename = rs.getString(2); //第二列
                //String sal = rs.getString(3);   //第三列
                //System.out.println(empno + "\t" + ename + "\t" + sal + "\t"); //jdbc中所有下标从1开始

                //2、第二种方法
                String empno = rs.getString("empno"); //第一列
                String ename = rs.getString("ename"); //第二列
                String sal = rs.getString("sal");   //第三列
                System.out.println(empno + "\t" + ename + "\t" + sal + "\t"); //jdbc中所有下标从1开始
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6、释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
