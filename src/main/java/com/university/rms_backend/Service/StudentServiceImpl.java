package com.university.rms_backend.Service;
import java.util.stream.Collectors;
import java.util.List;
import com.university.rms_backend.dto.StudentDto;
import com.university.rms_backend.entity.Student;
import com.university.rms_backend.exception.ResourceNotFoundException;
import com.university.rms_backend.mapper.StudentMapper;
import com.university.rms_backend.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    public StudentDto createStudent(StudentDto studentDto){
        Student student = StudentMapper.mapToStudent(studentDto);
        Student createStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(createStudent);
    }
    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student does not exist with given id " + studentId));
        return StudentMapper.mapToStudentDto(student);
    }
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(student -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto updateStudent)  {

        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student does not exist with the given Id: " + studentId));

        student.setName(updateStudent.getName());
        student.setIt3501(updateStudent.getIt3501());
        student.setIt3502(updateStudent.getIt3502());
        student.setIt3503(updateStudent.getIt3503());
        student.setIt3504(updateStudent.getIt3504());
        student.setIt3505(updateStudent.getIt3505());
        student.setIt3506(updateStudent.getIt3506());



        Student updatedStudent = studentRepository.save(student);


        return StudentMapper.mapToStudentDto(updatedStudent);
    }
    @Override
    public void deleteStudent(Long studentId) {
        // Check if the student exists
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student does not exist with the given Id: " + studentId));
        // Delete the student
        studentRepository.delete(student);
    }

}
