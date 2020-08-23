package com.ah.servlet;

import com.ah.dao.StudentMapper;
import com.ah.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;



public class StudentServlet extends javax.servlet.http.HttpServlet {
//    //Logger logger = Logger.getLogger(String.valueOf(StudentServlet.class));
//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//        SqlSession sqlSession = null;
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            sqlSession = sqlSessionFactory.openSession();
//
//            StudentMapper mapper =  sqlSession.getMapper(StudentMapper.class);
////            Student student = mapper.selectStudentById(1);
////            System.out.println(student.toString());
////            List<Student> students = mapper.selsctAllStudent();
////            for (Student s : students){
////                System.out.println(s);
////            }s
//
////            Student student = new Student();
////            student.setId(2);
////            student.setName("李四");
////            student.setAge(13);
////            int line = mapper.addAllStudents(student);
////            System.out.println(line);
////            sqlSession.commit();
//
//            mapper.deleteStudentById(2);
//            sqlSession.commit();
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sqlSession.close();
//        }
//    }
//
//    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        this.doPost(request, response);
//    }
}
