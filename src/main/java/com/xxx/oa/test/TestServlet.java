package com.xxx.oa.test;

import com.xxx.oa.utils.MybatisUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string = (String) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("test.sample"));
        request.setAttribute("result",string);
        request.getRequestDispatcher("test.ftl").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
