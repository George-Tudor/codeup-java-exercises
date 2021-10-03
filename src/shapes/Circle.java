package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * (radius * radius) * 100.0) / 100.0;
    }

    public double getCircumference() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }
}
