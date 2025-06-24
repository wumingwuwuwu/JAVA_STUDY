package wofuhuola.xiangmu.login_text.test;

import wofuhuola.xiangmu.login_text.dao.UserDao;
import wofuhuola.xiangmu.login_text.dao.impl.UserDaoImpl;
import wofuhuola.xiangmu.login_text.game.GuessNumber;
import wofuhuola.xiangmu.login_text.pojo.User;

import java.util.Scanner;

/**
 * 需求：登录注册案例
 * 	A:找该程序中有哪些类
 * 		用户类
 * 			用户描述类	wofuhuola.xiangmu.login_text.pojo(实体类,一个标准的类 成员变量，构造方法，getXxx/setXxx)
 * 				用户操作接口	wofuhuola.xiangmu.login_text.dao (操作接口)
 * 			用户操作类			wofuhuola.xiangmu.login_text.dao.impl (操作接口实现类)
 * 		测试类	wofuhuola.xiangmu.login_text.test
 * 	B:找每个类有哪些成员
 * 		用户描述类：
 * 			用户名，密码
 * 		用户操作类：
 * 			登录，注册
 * 		测试类：
 * 			main
 * 	C:找类与类的关系
 * 		在main方法中创建用户操作类和用户类对象，并使用。
 */
public class UserTest {
    public static void main(String[] args) {
        wc: while (true) {
            // 欢迎界面
            System.out.println("-----------欢迎光临------------");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请选择：");
            // 键盘录入数据
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();

            // 多处使用
            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("-----------登录界面------------");
                    // 键盘录入用户名和密码
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();
                    // 调用功能
                    // UserDao ud = new UserDaoImpl();
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登录成功");

                        String yn;
                        do {
                            // 启动游戏
                            GuessNumber.start();
                            System.out.println("你还要玩吗?是请输入y:");
                            yn = sc.nextLine();
                        } while ("y".equals(yn));

                        // break wc;
                    } else {
                        System.out.println("登录失败,回到选择界面");
                    }
                    break;
                case "2":
                    System.out.println("-----------注册界面------------");
                    // 键盘录入用户名和密码
                    System.out.println("请输入用户名：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = sc.nextLine();
                    // 调用功能
                    // UserDao ud = new UserDaoImpl();
                    // 把数据封装到对象中
                    // User user = new User(newUsername, newPassword);
                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    ud.regist(user);
                    System.out.println("注册成功,回到选择界面");
                    break;
                case "3":
                default:
                    System.out.println("谢谢光临，欢迎再来");
                    System.exit(0);
                    break;
            }
        }
    }
}
