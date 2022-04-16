package com.ynnz.servlet;

import com.ynnz.mapper.StudentMapper;
import com.ynnz.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;

@WebServlet("/updateReview")
public class UpdateReview extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 获取页面数据
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String score = request.getParameter("score");
        // 自动获取其他批阅信息
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 批阅时间
        String reviewTime = sdf.format(System.currentTimeMillis());
        // 批阅人
        String reviewer = "admin";
        // 批阅IP
        String state = "已批阅";
        String reviewIp = InetAddress.getLocalHost().getHostAddress();
        // 封装数据

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int i = mapper.updateStudent(id, state, reviewTime, reviewer, reviewIp, score);
        if (i > 0) {
            sqlSession.commit();
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write("success");
        }
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
