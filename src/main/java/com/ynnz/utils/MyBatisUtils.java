package com.ynnz.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    /**
     * 加载mybatis核心配置文件，并获取sqlSession对象
     *
     * @throws IOException
     */
    public static SqlSession getSqlSession() throws IOException {
        // 加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        return sqlSessionFactory.openSession();
    }
}
