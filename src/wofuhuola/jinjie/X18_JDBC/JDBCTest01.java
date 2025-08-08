package wofuhuola.jinjie.X18_JDBC;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            //1、注册驱动的第二种方法，告诉java我要连接mysql
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            //2、获取连接，告诉java我要连接哪台机器的mysql，并写入用户和密码
            //127.0.0.1和localhost都是本地ip地址
            String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
            String user = "root";
            String password = "123123";
            conn = DriverManager.getConnection(url,user,password);
            System.out.println(conn);

            //3、获取数据库操作对象（statement专门执行sql语句）
            stmt = conn.createStatement();

            //4、执行sql
            String sql = "insert into dept(deptno,dname,loc) values(60,'大大','比亚迪');";
            //专门执行DML语句（insert、delete、update）
            //返回值是“影响数据库中的记录条数”
            int a = stmt.executeUpdate(sql);
            System.out.println(a);
            System.out.println(a == 1 ? "保存成功":"保存失败");

            //5、处理查询结果集
            //插入语句，暂时不需要查询

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6、释放资源
            //为了保证资源一定释放，在finally语句块中关闭资源
            //分别要遵循从小到大依次关闭
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
