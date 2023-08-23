package ait.user.model;

public class Circle extends Shape {
    public Circle(String figure, double num) {
        super(figure, num);
    }

    public double getRadius() {
        return num;
    }

    //    круг
    public double area() {
        return Math.PI * num * num;
    }

    public double perimeter() {
        return 2 * Math.PI * num;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        return sb.toString();
    }
}
