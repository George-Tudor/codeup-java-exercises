import java.util.Scanner;

public class therapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing today?");
        String response = scanner.next();
        if(response.equals("good")) {
            System.out.println("I'm glad!");
        } else if(response.equals("bad")) {
            System.out.println(":( I'm sorry, I hope things get better.");
        } else {
            System.out.println("Feeling " + response + " is a part of the human experience.");

        }
    }
}
