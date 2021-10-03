package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

