package com.dao;

import com.DTO.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WengLei on 2017/6/13.
 */
@Repository
public interface StudentMapper {

    public List<StudentDTO> getAllStudents();

    public StudentDTO getByStuId(StudentDTO studentDTO);

    public void insertNewStudent(StudentDTO studentDTO);

}
