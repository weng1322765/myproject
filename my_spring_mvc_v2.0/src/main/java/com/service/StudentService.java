package com.service;

import com.DTO.StudentDTO;

import java.util.List;

/**
 * Created by WengLei on 2017/6/13.
 */
public interface StudentService {

    public List<StudentDTO> getAllStudents();

    public void insertNewStudent(StudentDTO studentDTO);

}
