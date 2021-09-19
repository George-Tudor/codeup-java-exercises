package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(12, 10);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }


}

//    create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5

//    verify that the getPerimeter and getArea methods return 18 and 20, respectively.

//    create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
