//package homework.hometask.hometask4.service;
//
//import hometask.hometask4.domain.Department;
//import hometask.hometask4.domain.Student;
//import hometask.hometask4.repository.StudentRepository;
//import hometask.hometask4.service.StudentServiceImpl;
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//import static org.junit.Assert.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.reset;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class StudentServiceImplTest {
//    @Mock
//    private StudentRepository studentRepository;
//
//    @InjectMocks
//    private StudentServiceImpl studentService;
//
//    @After
//    public void resetMock() {
//        reset(studentRepository);
//    }
//
//    @Test
//    public void shouldReturnRegisterStudent() {
//        Student studentExpected = Student.builder().withId(1L).build();
//        when(studentRepository.save(any(Student.class))).thenReturn(studentExpected);
//
//        Student studentActual = studentService.register(studentExpected);
//        assertEquals(studentExpected, studentActual);
//    }
//
//    @Test
//    public void shouldReturnStudentById() {
//        Student studentExpected = Student.builder().withId(1L).build();
//        when(studentRepository.findById(1L)).thenReturn(studentExpected);
//
//        Student studentActual = studentService.findById(1L);
//        assertEquals(studentExpected, studentActual);
//    }
//
//    @Test
//    public void shouldReturnDeleteStudent() {
//        Student studentExpected = Student.builder().withId(1L).build();
//        when(studentRepository.deleteById(1L)).thenReturn(studentExpected);
//
//        Student studentActual = studentService.deleteById(1L);
//        assertEquals(studentExpected, studentActual);
//    }
//
//    @Test
//    public void shouldReturnFindStudentsByDepartment() {
//        Student studentExpected = Student.builder().withId(1L).withDepartment(new Department(228L, "KPI")).build();
//        ArrayList<Student> studentsExpected = new ArrayList<>();
//        studentsExpected.add(studentExpected);
//
//        when(studentRepository.findByDepartment(228L)).thenReturn(studentsExpected);
//
//        ArrayList<Student> studentsActual = studentService.findByDepartment(228L);
//        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
//    }
//
//    @Test
//    public void shouldReturnFindStudentsByYear() {
//        Student studentExpected = Student.builder().withId(1L).withBirthday(LocalDate.of(1999, 1, 13)).build();
//        ArrayList<Student> studentsExpected = new ArrayList<>();
//        studentsExpected.add(studentExpected);
//
//        when(studentRepository.findByYear(1980)).thenReturn(studentsExpected);
//
//        ArrayList<Student> studentsActual = studentService.findByYear(1980);
//        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
//    }
//
//    @Test
//    public void shouldReturnFindStudentsByGroup() {
//        Student studentExpected = Student.builder().withId(1L).withGroup("IP-62").build();
//        ArrayList<Student> studentsExpected = new ArrayList<>();
//        studentsExpected.add(studentExpected);
//
//        when(studentRepository.findByGroup("IP-62")).thenReturn(studentsExpected);
//
//        ArrayList<Student> studentsActual = studentService.findByGroup("IP-62");
//        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
//    }
//
//    @Test
//    public void shouldReturnFindStudentsByDepartmentAndCourse() {
//        Student studentExpected = Student.builder().withId(1L).withDepartment(new Department(228L, "KPI")).withCourse(4).build();
//        ArrayList<Student> studentsExpected = new ArrayList<>();
//        studentsExpected.add(studentExpected);
//
//        when(studentRepository.findByDepartmentAndCourse(228L,4)).thenReturn(studentsExpected);
//
//        ArrayList<Student> studentsActual = studentService.findByDepartmentAndCourse(228L,4);
//        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
//    }
//
//}