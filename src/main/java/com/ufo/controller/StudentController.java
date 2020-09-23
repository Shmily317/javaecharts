package com.ufo.controller;

import com.ufo.dao.StudentDao;
import com.ufo.entity.ScoreResult;
import com.ufo.entity.Student;
import com.ufo.service.StdentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName: javaecharts
 * author:小黄同学
 * time: 2020/9/23 20:11
 * description:
 */
@Controller
public class StudentController {
    @Autowired
   private StdentService stdentService;
     @RequestMapping("/a.do")
     @ResponseBody
    public List<Student> inquire(){
         List<Student> students = stdentService.stuByid();
         return students;
     }
    @RequestMapping("/b.do")
    @ResponseBody
    public List<ScoreResult> inquireY(){
        List<Student> students = stdentService.stuByid();
        List<ScoreResult> scoreResults = new ArrayList<ScoreResult>();
        for (Student student : students) {
            ScoreResult scoreResult = new ScoreResult(student.getScore(),student.getName());
            scoreResults.add(scoreResult);
        }
        //111
        return scoreResults;
    }
}
