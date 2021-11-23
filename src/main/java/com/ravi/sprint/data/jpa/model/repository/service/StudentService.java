package com.ravi.sprint.data.jpa.model.repository.service;

import com.ravi.sprint.data.jpa.model.entity.Student;
import com.ravi.sprint.data.jpa.model.entity.StudentResponse;


import java.util.List;
/**
 * created by ravichandra chakka
 */
public interface StudentService {

    public Student saveStudentDetails(Student student);

    public StudentResponse getStudentDetails();

    public StudentResponse updateStudentById(Student student);
}
