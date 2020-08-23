package com.ah.service;

import com.ah.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    //根据学生id查数据
    public Student selectStudentById(int id);

    //添加学生信息
    public int addAllStudents(Student student);

   public List<Student> getAllStudent();

   public  List<Student> getStudentBynameAndage(Map<String,Object> map);

   public  List<Map<String, Object>> queryAllStudent();
}
