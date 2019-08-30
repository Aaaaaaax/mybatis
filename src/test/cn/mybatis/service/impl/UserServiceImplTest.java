package cn.mybatis.service.impl;

import cn.mybatis.pojo.User;
import cn.mybatis.service.UserService;
import org.junit.Test;

import java.io.IOException;

public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void getUserByID(){
        User user = null;
        try {
            user = userService.getUserByID(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(user.getId()+"/"+user.getUserName()+"/"+user.getPassword());
    }

    @Test
    public void addUserTest(){
        User user = new User("小明", "123456");
        try {
            userService.addUser(user);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
