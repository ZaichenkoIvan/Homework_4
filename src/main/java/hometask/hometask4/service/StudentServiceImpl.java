package hometask.hometask4.service;


import hometask.hometask4.domain.Student;
import hometask.hometask4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student not exist");
        }

        return studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be positive");
        }

        return studentRepository.findById(id);
    }

    @Override
    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void update(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student not exist");
        }
        studentRepository.update(student);
    }

    @Override
    public Student deleteById(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be positive");
        }

        return studentRepository.deleteById(id);
    }

    @Override
    public ArrayList<Student> findByDepartment(Long idDepartment) {
        if (idDepartment < 0) {
            throw new IllegalArgumentException("Id must be positive");
        }

        return studentRepository.findByDepartment(idDepartment);
    }

    @Override
    public ArrayList<Student> findByYear(int year) {
        if (year < 1900) {
            throw new IllegalArgumentException("Year must be >1900");
        }

        return studentRepository.findByYear(year);
    }

    @Override
    public ArrayList<Student> findByGroup(String group) {
        if (group == null) {
            throw new IllegalArgumentException("Group is not null");
        }
        return studentRepository.findByGroup(group);
    }

    @Override
    public ArrayList<Student> findByDepartmentAndCourse(Long idDepartment, int course) {
        if (course < 0 || course > 6 || idDepartment < 0) {
            throw new IllegalArgumentException("Course must be in range [0;6] or id department must be possitive");
        }
        return studentRepository.findByDepartmentAndCourse(idDepartment, course);
    }
}
