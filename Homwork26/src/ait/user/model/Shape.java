package ait.user.model;

public abstract  class Shape {
    // - Создайте абстрактный класс Shape с типом поля double
    // - и абстрактными методами CalcArea и CalcPerimeter.
    protected String figure;
    protected double num;

    public Shape(String figure, double num) {
        this.figure = figure;
        this.num = num;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("figure: ").append(figure);
        sb.append("; area: ").append(area());
        sb.append("; perimeter: ").append(perimeter());
        return sb.toString();
    }
}
