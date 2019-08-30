package cn.mybatis.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class DBTool {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 利用静待代码块保证SqlSessionFactory只初始化一次
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Mybatis-SqlSession对象 默认开启事务自动提交
     * @return
     */
    public static SqlSession getSqlSession(){
        if(sqlSessionFactory != null){
            return sqlSessionFactory.openSession(true);
        }else {
            return null;
        }
    }

    /**
     * 获取Mybatis-SqlSession对象
     * @param autoCommit：事务自动提交/false不开启/true开启
     * @return
     */
    public static SqlSession getSqlSession(Boolean autoCommit){
        if(sqlSessionFactory != null){
            return sqlSessionFactory.openSession(autoCommit);
        }else {
            return null;
        }
    }

    /**
     * 关闭SqlSession对象
     * @param sqlSession：要关闭的SqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession != null){
            sqlSession.close();
        }
    }

}
