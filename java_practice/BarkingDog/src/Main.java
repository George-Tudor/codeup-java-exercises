public class Main {
    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true, -1);

        int  newScore = calculateScore("George", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimetersFromFeetAndInches = calcFeetAndInchesToCentimeters(5, 10);
        System.out.println("George is " + centimetersFromFeetAndInches + " centimeters tall.");

        double centimetersFromInchesOnly = calcFeetAndInchesToCentimeters(60);
        System.out.println("60 inches is " + centimetersFromInchesOnly + " centimeters.");


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches > 12) {
            return -1;
        }
        double totalInches = feet / 12 + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = inches / 12;
        return calcFeetAndInchesToCentimeters(feet, inches);

    }

}
