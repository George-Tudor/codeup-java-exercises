public class ServerNameGenerator {

    private static String[] adjectives = {
            "fierce",
            "actual",
            "defective",
            "special",
            "absent",
            "slippery",
            "unhealthy",
            "horrible",
            "caring",
            "premium"
    };

    private static String[] nouns = {
            "highway",
            "arrival",
            "profession",
            "membership",
            "extent",
            "nation",
            "surgery",
            "employer",
            "bread",
            "thanks"
    };

    public static String adjective() {
        int randNum = (int) (Math.random() * adjectives.length - 1) + 1;
        return adjectives[randNum];
    }

    public static String noun() {
        int randNum = (int) (Math.random() * nouns.length - 1) + 1;
        return nouns[randNum];
    }


    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(adjective() + "-" + noun());
    }
}

