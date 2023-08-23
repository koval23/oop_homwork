package ait.user.model;

public class Triangle extends Shape {
    // треугольник


    public Triangle(String figure, double num) {
        super(figure, num);
    }


    public double getX() {
        return num;
    }

    public double area() {
        return (num * num * Math.sqrt(3)) / 4;
    }

    public double perimeter() {
        return num * 3;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        return sb.toString();
    }
}
