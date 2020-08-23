package com.ah.dao;

import com.ah.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    //根据学生id查数据
    public Student selectStudentById(int id);

    //添加学生
    public int addAllStudents(Student student);

    //查询所有信息
    public List<Student> getAllStudent();
    //查询姓名或者年龄
   public List<Student> getStudentBynameAndage(Map<String, Object> map);

   //多表联查
    public List<Map<String, Object>> queryAllStudent();
}
