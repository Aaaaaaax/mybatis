package cn.mybatis.service;

import cn.mybatis.pojo.User;

import java.io.IOException;

public interface UserService {

    /**
     * 根据id获取User对象
     * @param id
     * @return
     * @throws IOException
     */
    public User getUserByID(Integer id) throws IOException;

    /**
     * 增加一条记录
     * @param user
     * @throws IOException
     */
    public void addUser(User user) throws IOException;
}
