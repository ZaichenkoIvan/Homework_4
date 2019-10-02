package hometask.hometask4.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void shouldReturnCopyStudent() {
        Student studentWithNewPassword = Student.builder()
                .withId(1L)
                .withName("Vania")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-62")
                .withPhoneNumber("380911111111")
                .withCourse(5)
                .withDepartment(new Department(228L, "KPI"))
                .withEmail("ivan@gmail.com")
                .withPassword("ivanIVAN70")
                .build();

        Student studentForCopy = Student.builder()
                .withId(1L)
                .withName("Vania")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withAddress(new Address("Uman", "South", 13))
                .withGroup("IP-62")
                .withPhoneNumber("380911111111")
                .withCourse(5)
                .withDepartment(new Department(228L, "KPI"))
                .withEmail("ivan@gmail.com")
                .withPassword("12345")
                .build();

        Student studentActual = (Student) studentForCopy.clone("ivanIVAN70");

        assertEquals(studentWithNewPassword, studentActual);
    }
}
