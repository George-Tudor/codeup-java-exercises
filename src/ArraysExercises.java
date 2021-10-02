import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] person, Person newPerson) {
        Person[] output = Arrays.copyOf(person, person.length + 1);
        output[person.length] = newPerson;
        return output;

    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person p1 = new Person("Eddie");
//        Person p2 = new Person("Steve");
//        Person p3 = new Person("Bill");
//
//        Person[] people = new Person[3];
//
//        people[0] = p1;
//        people[1] = p2;
//        people[2] = p3;

        Person[] people = {
                new Person("Eddie"),
                new Person("Steve"),
                new Person("Bill")
        };



//        Arrays.toString(person);
        people = addPerson(people, new Person("Ryan"));

        System.out.println((Arrays.toString(people)));

        for (Person p : people) {
            System.out.println(p.getName());
        }
    }


}
