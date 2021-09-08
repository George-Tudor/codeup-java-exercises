import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String endConversation = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Talk to Bob.  Enter 'STOP' to end the conversation");
            String message = scanner.nextLine();
            if (message.contains("?")) {
                System.out.println("Sure.");
                ;
            } else if (message.contains("!")) {
                System.out.println("Whoa, chill out!");
            } else if (message.trim().equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (message.equals("STOP")) {
                endConversation = "STOP";
            } else {
                System.out.println("Whatever.");
            }
        } while(!endConversation.equals("STOP"));
    }
}
