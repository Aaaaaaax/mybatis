package cn.mybatis.service;

import cn.mybatis.pojo.User;

import java.io.IOException;

public interface UserService {

    public User getUserByID(Integer id) throws IOException;

}
