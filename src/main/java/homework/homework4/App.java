package homework.homework4;

import homework.homework4.entity.Student;
import homework.homework4.init.StudentsInit;
import homework.homework4.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Student> students = StudentsInit.initStudents();
        List<Student> findingStudents;

        StudentService studentService = StudentService.getInstance();

        findingStudents = studentService.findByFaculty("FICT",students);
        studentService.printFindingStudents("Students find by faculty FICT", findingStudents);

        findingStudents = studentService.findByYear(1990,students);
        studentService.printFindingStudents("Students find by year more 1990", findingStudents);

        findingStudents = studentService.findByGroup("IP-64",students);
        studentService.printFindingStudents("Students find by group IP-64", findingStudents);
    }
}
