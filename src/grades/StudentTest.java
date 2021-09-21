package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student bart = new Student("Bart Simpson");
        System.out.println(bart.getName());
        bart.addGrade(70);
        bart.addGrade(75);
        bart.addGrade(60);
        bart.addGrade(85);
        bart.addGrade(80);
        System.out.println(bart.getGrades());
        System.out.println(bart.getGradeAverage(bart.getGrades()));

        Student lisa = new Student("Lisa Simpson");
        System.out.println(lisa.getName());
        lisa.addGrade(95);
        lisa.addGrade(89);
        lisa.addGrade(92);
        lisa.addGrade(98);
        lisa.addGrade(100);
        System.out.println(lisa.getGrades());
        System.out.println(lisa.getGradeAverage(lisa.getGrades()));
    }
}
