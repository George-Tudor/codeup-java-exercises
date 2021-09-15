public class LionTest {
    public static void main(String[] args) {
        Lion simba = new Lion();
        simba.setName("Simba");


        String randQuote = simba.randomQuote();
        System.out.println("Simba says: " + randQuote);

    }
}
