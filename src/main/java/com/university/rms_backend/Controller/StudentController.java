package com.university.rms_backend.Controller;

import java.util.List;

import com.university.rms_backend.Service.StudentService;
import com.university.rms_backend.dto.StudentDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("api/students")
public class StudentController {
    private com.university.rms_backend.Service.StudentService StudentService;

    @PostMapping
    public ResponseEntity<StudentDto>createStudent(@RequestBody StudentDto studentDto){
        StudentDto savedStudent = StudentService.createStudent(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long studentId) {
        StudentDto studentDto = StudentService.getStudentById(studentId);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }
    // Build to get all students
    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> students = StudentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Build update student REST API
    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") Long studentId, @RequestBody StudentDto updatedStudent) {
        StudentDto studentDto = StudentService.updateStudent(studentId, updatedStudent);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    // Build delete student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId) {
        StudentService.deleteStudent(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }

}
