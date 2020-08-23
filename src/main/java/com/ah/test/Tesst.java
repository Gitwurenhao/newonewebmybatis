package com.ah.test;

import com.ah.dao.StudentMapper;
import com.ah.pojo.Student;
import com.ah.service.StudentService;
import com.ah.service.impl.StudentServiceImpl;
import com.ah.util.ServiceFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Tesst {

    public static void main(String[] args) {

        StudentService service = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
//      //添加学生信息
//        Student student = new Student();
//        student.setId(3);
//        student.setName("张耀");
//        student.setAge(11);
//        service.addAllStudents(student);

        //查询学生id
//        Student student = service.selectStudentById(1);
//        System.out.println(student);

        //查询所有信息
//        List<Student> list = service.getAllStudent();
//        for (Student s :list){
//            System.out.println(s);
//        }

//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("name","张耀");
//        map.put("age",11);
//
//        List<Student> list = service.getStudentBynameAndage(map);
//        for (Student student : list ){
//            if(student != null){
//                System.out.println(student);
//            }
//        }

//        多表联查
       List<Map<String,Object>> mapList = service.queryAllStudent();
        for (Map<String,Object> map : mapList){

             Set<String> set = map.keySet();

            for (String s : set){
               System.out.println(s);//获取的是属性

                System.out.println(map.get(s));
            }
        }

    }

}
