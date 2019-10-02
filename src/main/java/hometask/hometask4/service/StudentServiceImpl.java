package hometask.hometask4.service;


import hometask.hometask4.domain.Student;
import hometask.hometask4.exception.UncorrectLoginException;
import hometask.hometask4.helper.utility.PasswordUtils;
import hometask.hometask4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student not exist");
        }

        String encodePassword = PasswordUtils.generateSecurePassword(student.getPassword());

        Student studentWithEncodePassword = (Student) student.clone(encodePassword);

        return studentRepository.save(studentWithEncodePassword);
    }

    @Override
    public Optional<Student> login(String email, String password) {
        String encodePassword = PasswordUtils.generateSecurePassword(password);

        Student student = studentRepository.findByEmail(email)
                .orElseThrow(() -> new UncorrectLoginException("Login are not exist"));

        String studentPassword = student.getPassword();

        if(studentPassword.equals(encodePassword)){
            return Optional.of(student);
        }
        throw new UncorrectLoginException("Password is uncorrected");
    }


    @Override
    public Optional<Student> findById(Long id) {
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
    public Optional<Student> deleteById(Long id) {
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
