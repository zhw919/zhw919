package demo.controller;

import demo.domain.Student;
import demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class StuInfo {
    @Autowired
    private StuMapper stuMapper;
    @RequestMapping("/stu")
    public List<Student> StuInfo() {
        List<Student> students = stuMapper.selectList(null);
        return students;

    }
    @RequestMapping("/updateStu")
    public String updateUser( @RequestBody Student student){
        stuMapper.updateById(student);
        System.out.println(student);
        return "修改成功";
    }
    @RequestMapping("/insertStu")
    public Student insertStu(@RequestBody Student student){
        stuMapper.insert(student);
        System.out.println("新增成功"+student);
        return student;
    }
    @RequestMapping("/deleteStu")
    public int deleteStu(int id){
        stuMapper.deleteById(id);
        System.out.println("删除成功"+id);
        return id;

    }
    @RequestMapping("/queStu")
    public Student queStu(@RequestBody Student student,int id){
        stuMapper.selectById(id);
        System.out.println("条件查询"+student);
        return student;


    }

}
