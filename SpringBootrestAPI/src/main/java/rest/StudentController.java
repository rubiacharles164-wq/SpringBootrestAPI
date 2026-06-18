package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentservice;

    @GetMapping("/students")
    public  List<Student> getAllStudents(){
        return studentservice.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentservice.getStudentById(id);
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentservice.createStudent(student);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentservice.updateStudent(id, student));
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentservice.deleteStudentById(id);
    }
}
