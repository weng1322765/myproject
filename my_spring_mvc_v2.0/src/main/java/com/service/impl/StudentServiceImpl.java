package com.service.impl;

import com.DTO.StudentDTO;
import com.dao.StudentMapper;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WengLei on 2017/6/13.
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;


    public List<StudentDTO> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    public void insertNewStudent(StudentDTO studentDTO){
        studentMapper.insertNewStudent(studentDTO);
    }
}
