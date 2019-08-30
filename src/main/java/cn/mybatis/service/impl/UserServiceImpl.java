package cn.mybatis.service.impl;

import cn.mybatis.dao.UserMapper;
import cn.mybatis.pojo.User;
import cn.mybatis.service.UserService;
import cn.mybatis.tools.DBTool;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class UserServiceImpl implements UserService {

    @Override
    public User getUserByID(Integer id) throws IOException {
        SqlSession sqlSession = DBTool.getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getUserByID(id);
        DBTool.closeSqlSession(sqlSession);
        return user;
    }

    @Override
    public void addUser(User user) throws IOException {
        SqlSession sqlSession = DBTool.getSqlSession();
        sqlSession.getMapper(UserMapper.class).addUser(user);
        DBTool.closeSqlSession(sqlSession);
    }
}
