package Student.Student.controller;

import Student.Student.repository.StudentRepository;
import Student.Student.studenttable.Student;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import javax.persistence.Id;
import javax.security.auth.Subject;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    //Get Student Data

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/loadeddata")
    public Student createStudentData(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable(value="id")int studentId){
        return studentRepository.findById(studentId);
    }

    @PostMapping("/information")
    public List<Student> saveStudentInformation(@RequestBody List<Student>student){
        return studentRepository.saveAll(student);

    }

    @DeleteMapping("/deleted")
    public void deleteStudent(Integer id){
        studentRepository.delete(id);


    }
}


