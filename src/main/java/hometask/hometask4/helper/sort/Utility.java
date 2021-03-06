package hometask.hometask4.helper.sort;

import hometask.hometask4.domain.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
final class Utility {
    private Utility() {
    }

    public static void swap(ArrayList<Student> students, int i, int j) {
        Collections.swap(students, i, j);
    }
}
