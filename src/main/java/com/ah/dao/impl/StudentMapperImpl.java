package com.ah.dao.impl;

import com.ah.dao.StudentMapper;
import com.ah.pojo.Student;
import com.ah.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

//public class StudentMapperImpl implements StudentMapper {
//    SqlSession session = null;
//    //查询id
//    public Student selectStudentById(int id) {
//        session = MyBatisUtil.getSeccion();
//        Student student = session.selectOne("com.ah.dao.StudentMapper.selectStudentById", id);
//        return student;
//    }
//
//    //添加信息
//    public int addAllStudents(Student student) {
//       session = MyBatisUtil.getSeccion();
//        int line = session.insert("com.ah.dao.StudentMapper.addAllStudents",student);
//        return line;
//    }
//
//}
