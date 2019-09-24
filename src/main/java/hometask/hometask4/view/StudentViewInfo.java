package hometask.hometask4.view;

import hometask.hometask4.controller.StudentController;
import hometask.hometask4.domain.Student;

import java.util.ArrayList;

public class StudentViewInfo {
    private StudentController studentController = new StudentController();

    public void run() {
        System.out.println("Id");
        print(studentController.findById(1L));
        System.out.println("Dep");
        print(studentController.findByDepartment(228L));
        System.out.println("Group");
        print(studentController.findByGroup("IP-62"));
        System.out.println("Dep+course");
        print(studentController.findByDepartmentAndCourse(228L, 4));
    }

    private void print(ArrayList<Student> students) {
        for (Student student : students
        ) {
            print(student);
        }
    }

    private void print(Student student) {
        System.out.println(student);
    }

}
