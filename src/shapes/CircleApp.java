package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle();
        System.out.print("What is the radius of the circle? ");
        double radius = input.getDouble();
        circle.setRadius(radius);
        System.out.println("The area of the circles is " + circle.getArea() + ".");
        System.out.println("The circumference of the circles is " + circle.getCircumference() + ".");
    }
}
