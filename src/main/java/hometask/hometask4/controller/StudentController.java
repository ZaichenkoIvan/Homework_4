package hometask.hometask4.controller;

import hometask.hometask4.domain.Student;
import hometask.hometask4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Optional<Student> register(Student student) {
        return studentService.register(student);
    }

    public Optional<Student> login(String email, String password) {
        return studentService.login(email, password);
    }

    public Optional<Student> findById(Long id) {
        return studentService.findById(id);
    }

    public ArrayList<Student> findAll() {
        return studentService.findAll();
    }

    public void update(Student student) {
        studentService.update(student);
    }

    public Optional<Student> deleteById(Long id) {
        return studentService.deleteById(id);
    }

    public ArrayList<Student> findByDepartment(Long idDepartment) {
        return studentService.findByDepartment(idDepartment);
    }

    public ArrayList<Student> findByYear(int year) {
        return studentService.findByYear(year);
    }

    public ArrayList<Student> findByGroup(String group) {
        return studentService.findByGroup(group);
    }

    public ArrayList<Student> findByDepartmentAndCourse(Long idDepartment, int course) {
        return studentService.findByDepartmentAndCourse(idDepartment, course);
    }
}
