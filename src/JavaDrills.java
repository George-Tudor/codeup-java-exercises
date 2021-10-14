//================================= WARM UP
//        In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
//        Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“caT”)); // Cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT

public class JavaDrills {
    public static String flipOuterCase(String word) {
        char[] charArray = word.toCharArray();
        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i)) {
                //word.charAt(i).
            }
        }
    }
}
