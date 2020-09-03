package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentTests {

    @Test
    public void testCalculateAVGGrades(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        Student student = new Student(list);

        Assert.assertEquals(student.calculateAVGGrades(), 5);
    }

    @Test
    public void testCalculateAVGWithZeroGrades(){
        List<Integer> list = new ArrayList<>();
        Student student = new Student(list);

        Assert.assertEquals(student.calculateAVGGrades(), 0);
    }

    @Test
    public void testCalculateAVGV2WithZeroGrades(){
        List<Integer> list = new ArrayList<>();
        Student student = new Student(list);

        Assert.assertEquals(student.calculateAVGGradesV2(), 0);
    }
}
