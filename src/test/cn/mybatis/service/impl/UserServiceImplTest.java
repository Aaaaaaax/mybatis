package cn.mybatis.service.impl;

import cn.mybatis.dao.UserMapper;
import cn.mybatis.pojo.User;
import cn.mybatis.service.UserService;
import cn.mybatis.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void getUserByID(){
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User user = sqlSession.getMapper(UserMapper.class).getUserByID(1);
            System.out.println(user.getId()+"/"+user.getName()+"/"+user.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
