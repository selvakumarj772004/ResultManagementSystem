package com.university.rms_backend.mapper;

import com.university.rms_backend.dto.StudentDto;
import com.university.rms_backend.entity.Student;

public class StudentMapper {

public static StudentDto mapToStudentDto(Student student){
    return new StudentDto(
            student.getId(),
            student.getName(),
            student.getIt3501(),
            student.getIt3502(),
            student.getIt3503(),
            student.getIt3504(),
            student.getIt3505(),
            student.getIt3506()
    );
}

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getIt3501(),
                studentDto.getIt3502(),
                studentDto.getIt3503(),
                studentDto.getIt3504(),
                studentDto.getIt3505(),
                studentDto.getIt3506()
        );
    }
}
