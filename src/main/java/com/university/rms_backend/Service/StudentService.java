package com.university.rms_backend.Service;

import com.university.rms_backend.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);

    List<StudentDto> getAllStudents();
    StudentDto updateStudent(Long StudentId,StudentDto updateStudent);

    void deleteStudent(Long studentId);

}
