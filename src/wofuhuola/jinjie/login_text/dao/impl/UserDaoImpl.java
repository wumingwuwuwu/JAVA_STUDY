package wofuhuola.jinjie.login_text.dao.impl;

import wofuhuola.jinjie.login_text.dao.UserDao;
import wofuhuola.jinjie.login_text.pojo.User;

import java.util.ArrayList;



public class UserDaoImpl implements UserDao {
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;

        for (User user : array) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @Override
    public void regist(User user) {
        array.add(user);
    }

}