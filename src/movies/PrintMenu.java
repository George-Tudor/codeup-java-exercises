package movies;

public class PrintMenu {

    public static void printMenu() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("\n📖 Main Menu");
        System.out.println(Colors.ANSI_BLUE + "0. " + Colors.ANSI_CYAN + "Exit." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "1. " + Colors.ANSI_CYAN + "View all movies." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "2. " + Colors.ANSI_CYAN + "View movies in the animated category." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "3. " + Colors.ANSI_CYAN + "View movies in the drama category." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "4. " + Colors.ANSI_CYAN + "View movies in the horror category." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "5. " + Colors.ANSI_CYAN + "View movies in the scifi category." + Colors.ANSI_RESET);
        System.out.print("Enter your choice: ");
        }
}