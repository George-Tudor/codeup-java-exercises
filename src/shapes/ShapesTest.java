package shapes;
import util.Input;

public class ShapesTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("Enter the length of the rectangle: ");
        double length = input.getDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.getDouble();
        Measurable myShape = new Rectangle(length, width);

        System.out.println("The area of the rectangle is: " + myShape.getArea());
        System.out.println("The perimeter of the rectangle is : " + myShape.getPerimeter());

        System.out.print("Enter the side dimension of the square: ");
        double side = input.getDouble();

        myShape = new Square(side);
        System.out.println("The area of the square is: " + myShape.getArea());
        System.out.println("The perimeter of the square is: " + myShape.getPerimeter());

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());


        //Rectangle box2 = new Square(5);
    }


}

//    create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5

//    verify that the getPerimeter and getArea methods return 18 and 20, respectively.

//    create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
