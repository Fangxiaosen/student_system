package com.ynnz.servlet;

import com.alibaba.fastjson.JSON;
import com.ynnz.entity.Student;
import com.ynnz.mapper.StudentMapper;
import com.ynnz.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/queryStudent")
public class QueryStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        int startindex, handleSizeChange;
        startindex = Integer.parseInt(request.getParameter("startindex"));
        handleSizeChange = Integer.parseInt(request.getParameter("handleSizeChange"));
        List<Student> queryStudent = mapper.QueryStudent(startindex, handleSizeChange);

        //List<Student> students = mapper.selectByExample(null);
        String jsonString = JSON.toJSONString(queryStudent);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
