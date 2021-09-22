import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsMiniExercise2 {

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
            int firstInt = scanner.nextInt();
            System.out.println("Please enter another integer");
            int secondInt = scanner.nextInt();
            System.out.println(sentence);
            ArrayList<String> wordArrayList = new ArrayList<String>();
            try {
                String[] stringArray = sentence.split(" ");
                for (String word : stringArray) {
                    wordArrayList.add(word);
                }
                List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
                String newSentence = String.join(" ", shorterList);
                System.out.println(newSentence);
            } catch (IndexOutOfBoundsException iobe) {
                System.out.println("For that sentence, I need integers between 0 and " + wordArrayList.size());
            } catch (NullPointerException npe) {
                System.out.println("This method was not provided with a sentence to operate on");
            } catch (IllegalArgumentException iax) {
                System.out.println("I think you just gave me numbers in descending order.");
            } finally {
                System.out.println("Thank You!");
            }

    }
//might be on test
//    public void echoWord() throws IllegalArgumentException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("I am a parrot. Please say something so I can parrot you.");
//        String userInput = sc.nextLine();
//        if (userInput.equalsIgnoreCase("curses")) {
//            throw new IllegalArgumentException();
//        }
//        System.out.println(userInput);
//    }

    public void echoWord() throws CusswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am a parrot. Please say something so I can parrot you.");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("curses")) {
            throw new CusswordException("How dare you? We don't allow that sort of language in here.");
        }
        System.out.println(userInput);
    }

}
