package hometask.hometask4.init;

import hometask.hometask4.domain.Address;
import hometask.hometask4.domain.Department;
import hometask.hometask4.domain.Student;
import hometask.hometask4.repository.StudentRepository;
import hometask.hometask4.repository.StudentRepositoryImpl;
import hometask.hometask4.service.StudentService;
import hometask.hometask4.service.StudentServiceImpl;

import java.time.LocalDate;

public class Menu {

    private StudentRepository studentRepository = StudentRepositoryImpl.getInstance();
    private StudentService studentService = StudentServiceImpl.getInstance(studentRepository);

    public void run() {

        Department kpi = new Department(228L, "KPI");

        Student ivan = Student.builder()
                .withName("Ivan")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-62")
                .withPhoneNumber("380911111111")
                .withCourse(5)
                .withDepartment(kpi)
                .withEmail("ivan@gmail.com")
                .build();

        Student vasyl = Student.builder()
                .withName("Vasyl")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 14))
                .withGroup("IP-64")
                .withPhoneNumber("380922222222")
                .withCourse(4)
                .withDepartment(kpi)
                .withEmail("vasv@gmail.com")
                .build();

        Student volodymyr = Student.builder()
                .withName("Volodymyr")
                .withSurname("Tsaruk")
                .withBirthday(LocalDate.of(1999, 6, 11))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-64")
                .withPhoneNumber("380933333333")
                .withCourse(4)
                .withDepartment(kpi)
                .withEmail("vv@gmail.com")
                .build();

        studentService.register(ivan);
        studentService.register(volodymyr);
        studentService.register(vasyl);

    }
}
