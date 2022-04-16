package com.ynnz.test;

import com.ynnz.entity.Student;
import com.ynnz.mapper.StudentMapper;
import com.ynnz.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @Title: StudentTest
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/12 19:42
 */
public class StudentTest {
    @Test
    public void queryStudent() throws IOException {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectByExample(null);
        System.out.println(students);

    }
}
