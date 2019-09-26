package hometask.hometask7.example1;

import hometask.hometask7.example1.sort.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void shouldReturnSortArrayList() {
        User student1 = new User("dimoooon", "surname", 20, "first@gmail.com");
        User student2 = new User("anton", "surname", 20, "second@gmail.com");
        User student3 = new User("dimoooon", "surname", 15, "third@gmail.com");

        ArrayList studentsExpected = new ArrayList();
        studentsExpected.add(student2);
        studentsExpected.add(student3);
        studentsExpected.add(student1);

        ArrayList studentsActual = new ArrayList();
        studentsActual.add(student1);
        studentsActual.add(student2);
        studentsActual.add(student3);
        BubbleSort.sort(studentsActual);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());

    }
}