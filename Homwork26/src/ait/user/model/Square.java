package ait.user.model;

public class Square extends Shape {
    // квадрат

    public Square(String figure, double num) {
        super(figure, num);
    }

    public double getSideLength() {
        return num;
    }

    public double area() {
        return num * num;
    }

    public double perimeter() {
        return num * 4;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        return sb.toString();
    }
}
