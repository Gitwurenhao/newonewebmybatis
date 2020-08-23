package com.ah.service.impl;

import com.ah.dao.StudentMapper;
import com.ah.pojo.Student;
import com.ah.service.StudentService;
import com.ah.util.MyBatisUtil;

import java.util.List;
import java.util.Map;


public class StudentServiceImpl implements StudentService {

    private StudentMapper dao = MyBatisUtil.getSeccion().getMapper(StudentMapper.class);

    // 查询id
    public Student selectStudentById(int id) {
        Student student = dao.selectStudentById(id);
        return student;
    }

    //添加信息
    public int addAllStudents(Student student) {
        int line = dao.addAllStudents(student);
        return line;
    }

    //查询所有学生
    public List<Student> getAllStudent() {

        List<Student> studentList = dao.getAllStudent();
        return studentList;
    }

    public List<Student> getStudentBynameAndage(Map<String, Object> map) {

        List<Student> list= dao.getStudentBynameAndage(map);
        return list;
    }

    public List<Map<String, Object>> queryAllStudent() {
        List<Map<String, Object>> maplist = dao.queryAllStudent();
        return maplist;
    }
}
