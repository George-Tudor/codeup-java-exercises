package animal;

public class AnimalTest {

    public static void main(String[] args) {
        Dog spot = new Dog();
        System.out.println("Sit Spot!");
        spot.responseToCommand("sit");
        Cat fluffy = new Cat();
        System.out.println("Sit Fluffy!");
        fluffy.responseToCommand("sit");
    }
}
