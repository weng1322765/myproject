package com.controller;

import com.DTO.StudentDTO;
import com.alibaba.fastjson.JSON;
import com.service.StudentService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WengLei on 2017/6/16.
 */
@RestController
public class TestController {

    private Logger logger = com.common.utils.Logger.get();

    @Autowired
    StudentService studentService;

    @RequestMapping("/home.do")
    public String index(){
        logger.info("进来了！");
        return "home";
    }


    @RequestMapping("/allStu.do")
    public @ResponseBody List<StudentDTO> student(){
        logger.info("incomming!");
        List<StudentDTO> list=studentService.getAllStudents();
        return list;
    }


    @RequestMapping("/newStu.do")
    public StudentDTO student(@RequestBody StudentDTO studentDTO) {
        logger.info("入参：{}", JSON.toJSONString(studentDTO));
        studentService.insertNewStudent(studentDTO);
        return studentDTO;
    }


}
