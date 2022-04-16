package com.ynnz.mapper;

import com.ynnz.entity.Student;
import com.ynnz.entity.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    List<Student> QueryStudent(@Param("startindex") int startindex, @Param("handleSizeChange") int handleSizeChange);

    Student selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * @param id
     * @param state
     * @param reviewTime
     * @param reviewer
     * @param reviewIp
     * @param score
     * @return
     */
    int updateStudent(@Param("id") String id, @Param("state") String state, @Param("reviewTime") String reviewTime, @Param("reviewer") String reviewer, @Param("reviewIp") String reviewIp, @Param("score") String score);
}