package cn.mybatis.dao;

import cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;

public interface UserMapper {

    /**
     * @param id
     *
     * 根据id获取User实例
     */
    public User getUserByID(@Param("id") Integer id) throws IOException;

}
