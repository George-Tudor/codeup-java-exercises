//================================= WARM UP
//        In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
//        Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“caT”)); // Cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT

import javax.swing.*;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaDrills {
    public static String flipFirstCase(String word) {
        String firstLetterFlipped = "";
        if(Character.isUpperCase(word.charAt(0))) {
            firstLetterFlipped  = word.substring(0, 1).toLowerCase() + word.substring(1);
        } else if(Character.isLowerCase(word.charAt(0))) {
            firstLetterFlipped  = word.substring(0, 1).toUpperCase() + word.substring(1);
                }
        return firstLetterFlipped;
            }

        public static String flipLastCase(String word) {
            String lastLetterFLipped = "";
            if(Character.isUpperCase(word.charAt(word.length() -1))) {
                lastLetterFLipped = word.substring(0, word.length() -1) + word.substring(word.length() -1).toLowerCase();
            } else if(Character.isLowerCase(word.charAt(word.length() -1))) {
                lastLetterFLipped = word.substring(0, word.length() -1) + word.substring(word.length() -1).toUpperCase();
            }
            return lastLetterFLipped;
        }

        public static String flipOuterCase(String word) {
            return flipLastCase(flipFirstCase(word));
        }

        public static int addArrayValues(List<Integer> arraylist) {
            int arraySum = 0;
            for(int i = 0; i < arraylist.size(); i++ ) {
                arraySum += arraylist.get(i);
            }
            return arraySum;
    }

        public static int returnTotalDifference(List<Integer> arr1, List<Integer> arr2) {
            return addArrayValues(arr1) - addArrayValues(arr2);
        }

        public static String flipInnerCase(String word) {
            String innerLetters = "";
//            if(Character.isUpperCase(word.charAt(0))) {
//                firstLetterFlipped  = word.substring(0, 1).toLowerCase() + word.substring(1);
//            } else if(Character.isLowerCase(word.charAt(0))) {
//                firstLetterFlipped  = word.substring(0, 1).toUpperCase() + word.substring(1);
//            }
//            return firstLetterFlipped;
            innerLetters = word.substring(1, word.length() -1);
            String innerLettersFlipped = "";
            for(int i = 0; i < innerLetters.length(); i++) {
                if(Character.isUpperCase(innerLetters.charAt(i))) {
//                firstLetterFlipped  = word.substring(0, 1).toLowerCase() + word.substring(1);
//            } else if(Character.isLowerCase(word.charAt(0))) {
//                firstLetterFlipped  = word.substring(0, 1).toUpperCase() + word.substring(1);
//            }
            }

            return innerLetters;
        }
            
         

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("caT")); // Cat
        System.out.println(flipOuterCase("cAt")); // CAT

        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));

        System.out.println("");
        System.out.println(flipInnerCase("cODEUp"));
    }
}


