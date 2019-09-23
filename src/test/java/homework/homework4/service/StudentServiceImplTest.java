package homework.homework4.service;

import homework.homework4.entity.Student;
import homework.homework4.init.StudentsInit;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceImplTest {


    @Test
    public void findByFaculty() {
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> studentsExpected = StudentsInit.initStudents();

        List<Student> studentsActual = studentServiceImpl.findByFaculty("FICT", studentsExpected);

        studentsExpected.remove(0);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
    }

    @Test
    public void findByYear() {
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> studentsExpected = StudentsInit.initStudents();

        List<Student> studentsActual = studentServiceImpl.findByYear(1990,studentsExpected);

        studentsExpected.remove(1);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
    }

    @Test
    public void findByGroup() {
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> studentsExpected = StudentsInit.initStudents();

        List<Student> studentsActual = studentServiceImpl.findByGroup("IP-64",studentsExpected);

        studentsExpected.remove(0);
        studentsExpected.remove(1);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
    }

    @Test
    public void findByFacultyAndCourse() {
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> studentsExpected = StudentsInit.initStudents();

        List<Student> studentsActual = studentServiceImpl.findByFacultyAndCourse("FICT",4,studentsExpected);

        studentsExpected.remove(0);
        studentsExpected.remove(1);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
    }
}