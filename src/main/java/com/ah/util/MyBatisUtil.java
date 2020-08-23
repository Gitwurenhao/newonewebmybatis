package com.ah.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    private MyBatisUtil(){

    }

    private  static SqlSessionFactory sqlSessionFactory;
    //初始化
    static{

        try {
            //加载config配置文件
            String resource = "mybatis-config.xml";
            //将得到的文件的加载到流中
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //创建sqlseccion工厂建造者
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ThreadLocal<SqlSession>  t = new ThreadLocal<SqlSession>();
     //获取seccion对象
    public static SqlSession getSeccion(){
        SqlSession sqlSession = t.get();
        if (sqlSession == null){
            sqlSession = sqlSessionFactory.openSession();
            t.set(sqlSession);
        }
        return sqlSession;
    }
    //关闭资源
    public static void colse(SqlSession sqlSession){
        if (sqlSession !=null){
            sqlSession.close();
            t.remove();
        }
    }
}
