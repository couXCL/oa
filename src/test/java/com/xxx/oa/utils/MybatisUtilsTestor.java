package com.xxx.oa.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisUtilsTestor {
    @Test
    public void testCase1(){
        String result = (String)MybatisUtils.executeQuery(SqlSession->{
            String s = (String)SqlSession.selectOne("test.sample");
            return s;
        });
        System.out.println(result);
    }
    @Test
    public void testCase2(){
        String result = (String)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("test.sample"));
        System.out.println(result);
    }
}
