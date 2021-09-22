package grades;

import java.util.*;


public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        Student kenny = new Student("Kenny McCormick");
        Student cartman = new Student("Eric Cartman");
        Student stan = new Student("Stan Marsh");
        Student kyle = new Student("Kyle Broflovski");

        kenny.addGrade(79);
        kenny.addGrade(85);
        kenny.addGrade(88);

        cartman.addGrade(65);
        cartman.addGrade(70);
        cartman.addGrade(79);

        stan.addGrade(89);
        stan.addGrade(94);
        stan.addGrade(88);

        kyle.addGrade(91);
        kyle.addGrade(82);
        kyle.addGrade(88);

        studentMap.put("mysterion", kenny);
        studentMap.put("awesomeo3000", cartman);
        studentMap.put("toolshed", stan);
        studentMap.put("humankite", kyle);

        System.out.println("Welcome!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the GitHub usernames of our students: \n");
        List<String> userName = new ArrayList<>(studentMap.keySet());
        System.out.println(userName + "\n");
        String input;
        do {
            System.out.println("Which student would you like to see more information on? \n");

            input = scanner.nextLine();
            if (studentMap.containsKey(input)) {
                Student s = studentMap.get(input);
                System.out.println("\nName: " + s.getName() + " - GitHub Username: " + input);
                System.out.println("Current Average: " + s.getGradeAverage(s.getGrades()));
            } else {
                System.out.println("Sorry, no student found with the Github username of " + input);
            }
            System.out.println("Would you like to see another student?");
            input = scanner.nextLine();
        } while (!"no".equals(input));
        System.out.println("Goodbye, and have a wonderful day!");

    }
}
