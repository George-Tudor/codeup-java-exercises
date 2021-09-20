package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsTest {

    public static ArrayList<Integer> omit2s(ArrayList<Integer> integers) {
        integers.removeIf(integer -> integer == 2);

        return integers;

    }

    public static void main(String[] args) {
         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                 0, 2, 1, 3, 2, 5, 2, 10, 5, 2
         ));

        System.out.println(omit2s(numbers));
    }
}
