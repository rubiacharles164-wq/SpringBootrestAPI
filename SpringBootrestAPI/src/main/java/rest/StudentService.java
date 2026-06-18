package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(long id) {
        Optional<Student> SchoolOptional = studentRepository.findById(id);

        return SchoolOptional.orElse(null);
    }

    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    public Student createStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public Student updateStudent(long id, Student updatedStudent) {
        Optional<Student> studentToUpdateOptional = studentRepository.findById(id);

        if (studentToUpdateOptional.isPresent()) {
            Student studentToUpdate = studentToUpdateOptional.get();

            studentToUpdate.setName(updatedStudent.getName());
            studentToUpdate.setEmail(updatedStudent.getEmail());
            studentToUpdate.setCourse(updatedStudent.getCourse());

            return studentRepository.save(studentToUpdate);
        }

        return null;
    }

}
