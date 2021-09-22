package grades;

import java.util.*;


public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Student> userNames = new HashMap<>();
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

        userNames.put("mysterion", kenny);
        userNames.put("awesomeo3000", cartman);
        userNames.put("toolshed", stan);
        userNames.put("humankite", kyle);

        System.out.println("Welcome!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the GitHub usernames of our students: \n");
        List<String> userName = new ArrayList<>(userNames.keySet());
        System.out.println(userName + "\n");
        System.out.println("Which student would you like to see more information on? \n");
        String input = scanner.nextLine();
        


    }
}
