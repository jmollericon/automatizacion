package student;
import java.util.List;
public class Student {
    public List<Integer> gradeList;

    public Student(List<Integer> gradeList){
        this.gradeList = gradeList;
    }
    public int calculateAVGGrades(){
        int gradeSum = 0;
        for (int i=0;i<gradeList.size();i++){
            gradeSum += gradeList.get(i);
        }
        return gradeSum / gradeList.size();
    }
}
