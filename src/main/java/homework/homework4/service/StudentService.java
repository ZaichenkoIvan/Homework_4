package homework.homework4.service;

import homework.homework4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private StudentService() {
    }

    private static class StudentServiceHolder {
        private final static StudentService instance = new StudentService();
    }

    public static StudentService getInstance() {
        return StudentServiceHolder.instance;
    }

    public void printFindingStudents(String info, List<Student> students) {
        System.out.println(info);
        for (Student student : students
        ) {
            System.out.println(student);
        }
        System.out.println();
    }

    public ArrayList<Student> findByFaculty(String faculty, List<Student> students) {
        ArrayList<Student> findByFacultyStudents = new ArrayList<>();
        for (Student student : students
        ) {
            if (faculty.equals(student.getFaculty())) {
                findByFacultyStudents.add(student);
            }
        }
        return findByFacultyStudents;
    }

    public ArrayList<Student> findByYear(int year, List<Student> students) {
        ArrayList<Student> findByYearStudents = new ArrayList<>();
        for (Student student : students
        ) {
            if (year < student.getBirthday().getYear()) {
                findByYearStudents.add(student);
            }
        }
        return findByYearStudents;
    }

    

}

