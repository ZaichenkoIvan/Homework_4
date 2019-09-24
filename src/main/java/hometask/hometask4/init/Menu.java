package hometask.hometask4.init;

import hometask.hometask4.domain.Address;
import hometask.hometask4.domain.Department;
import hometask.hometask4.domain.PhoneNumber;
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
                .withId(1L)
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-62")
                .withPhoneNumber(new PhoneNumber(380, 9393939))
                .withCourse(5)
                .withDepartment(kpi)
                .build();

        Student vasyl = Student.builder()
                .withName("Vasyl")
                .withSurname("Zaichenko")
                .withId(2L)
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 14))
                .withGroup("IP-64")
                .withPhoneNumber(new PhoneNumber(380, 92222222))
                .withCourse(4)
                .withDepartment(kpi)
                .build();

        Student volodymyr = Student.builder()
                .withName("Volodymyr")
                .withSurname("Tsaruk")
                .withId(3L)
                .withBirthday(LocalDate.of(1999, 6, 11))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-64")
                .withPhoneNumber(new PhoneNumber(380, 93333333))
                .withCourse(4)
                .withDepartment(kpi)
                .build();

        studentService.register(ivan);
        studentService.register(volodymyr);
        studentService.register(vasyl);

    }
}
