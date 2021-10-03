import util.Input;

public class HighLow {

    public static void printGuess(int userInput, int randomNumber) {
        if (userInput == randomNumber) {
            System.out.println("GOOD GUESS!");
        } else if (userInput < randomNumber) {
            System.out.println("HIGHER!");
        } else {
            System.out.println("LOWER!");
        }
    }

    public static void startHighLow() {
        Input input = new Input();
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.print("Guess a number between 1 and 100: ");
        int userInput = 0;
        while(userInput != randomNumber) {
            userInput = input.getInt(1, 100);
            printGuess(userInput, randomNumber);
        }
    }


    public static void main(String[] args) {
        startHighLow();
        }
    }



//        while (!isNumeric) {
//            try {
//
//                isNumeric = true;
//
//            } catch (InputMismatchException ime) {
//                System.out.println("\nInvalid input.  Please enter only a numeric integer. Try again.");
//                break;
//            }