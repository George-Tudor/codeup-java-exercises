package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double dblNum1 = 20.00d;
        double dblNum2 = 80.00d;
        double dblOperation = (dblNum1 + dblNum2) * 100.00d;
        System.out.println(dblOperation);
        System.out.println("The result of " + dblOperation + " % 40.00 is " + dblOperation % 40.00);

        boolean isItZero = ((dblOperation % 40.00) == 0)  ? true : false;
        System.out.println(isItZero);
        if(dblOperation % 40.00 != 0) {
            System.out.println("Got some remainder!");
        }

    }
}
