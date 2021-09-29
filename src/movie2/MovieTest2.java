package movie2;

public class MovieTest2 {
    public static void main(String[] args) {
//        Movie2 movie = new Movie2(null, null);
        Comedy comedy = new Comedy("Unfunny movie", "Mr Big", false);
        System.out.println(comedy.getName() + " " + comedy.getDirector() + " " + comedy.funny);
        System.out.println(comedy.audienceReaction());
    }
}
