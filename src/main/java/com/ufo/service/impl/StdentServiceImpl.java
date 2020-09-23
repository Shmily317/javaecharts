package com.ufo.service.impl;

import com.ufo.dao.StudentDao;
import com.ufo.entity.Student;
import com.ufo.service.StdentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: javaecharts
 * author:小黄同学
 * time: 2020/9/23 20:09
 * description:
 */
@Service
public class StdentServiceImpl implements StdentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> stuByid() {
        List<Student> students = studentDao.stuByid();
        return students;
    }
}
