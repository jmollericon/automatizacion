package student;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(5);
        grades.add(3);

        Student student = new Student(grades);
        System.out.println("El promedio de notas del estudiante es de: " + student.calculateAVGGrades());

    }
}
