package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return studentName;
    }     // returns the student's name


    public void addGrade(int grade) {
        grades.add(grade);
    } // adds the given grade to the grades property


    public double getGradeAverage(ArrayList<Integer> grades) {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    } // returns the average of the students grades


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }


}
