import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        boolean userChoice = true;
        do {

            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();


            System.out.println("number\t | squared\t | cubed");
            System.out.println("------\t | ------\t | ------");
            for (int i = 1; i <= userInput; i++) {
                System.out.println(i + "\t\t |" + (i * i) + " \t \t |" + (i * i * i));
            }
            System.out.println("Do you want to continue? (yes or no) ");
            String yesOrNo = scanner.next();
            if(!yesOrNo.equals("yes")) {
                userChoice = false;
            }
        } while (userChoice);
    }
}
