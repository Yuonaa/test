package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.TestMapper;
import com.example.demo.model.Student;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<Student> getAllStudent() {
        return testMapper.selectList(null);
    }

    @Override
    public Student getStudentById(String id) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return testMapper.selectOne(queryWrapper);
//        Student student = testMapper.selectById(id);
//        redisTemplate.opsForValue().set(student.getId(),student);
//        return student;
    }
}
