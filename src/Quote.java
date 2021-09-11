public class Quote {
    public static String randomQuote() {
        int quoteNum = (int) (Math.random() * 4) + 1;
        if (quoteNum == 1) {
            return "Go forth and conquer.";
        } else if (quoteNum == 2) {
            return "There can be only one.";
        } else if (quoteNum == 3) {
            return "Board's don't hit back.";
        } else if (quoteNum == 4) {
            return "Water can flow or water can crash, be like water my friend";
        } else {
            return "There's a problem.";
        }


    }
}

/*Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.*/
