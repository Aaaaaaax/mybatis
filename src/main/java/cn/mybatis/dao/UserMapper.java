package cn.mybatis.dao;

import cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;

public interface UserMapper {

    /**
     * 根据id获取User实例
     * @param id
     * @throws IOException
     */
    public User getUserByID(@Param("id") Integer id) throws IOException;

    /**
     * 添加一条记录
     * @param user
     * @throws IOException
     */
    public void addUser(@Param("User") User user) throws IOException;

}
