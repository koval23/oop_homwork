package ait.user;

import ait.user.model.Circle;
import ait.user.model.Shape;
import ait.user.model.Square;
import ait.user.model.Triangle;

import java.util.Objects;

public class ShapeAppl {
// 2) + Создайте классы Circle, Triangle, Square, которые расширяют класс Shape и реализуют абстрактные методы.

// 2) + Напишите класс FigureAppl с методом main. В методе создайте массив фигур.


//  P.S. Мы имеем в виду правильные формы-


    public static void main(String[] args) {
        //    + Добавьте в массив два круга, один треугольник и один квадрат.
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 12);
        shapes[1] = new Circle("Circle", 23);
        shapes[2] = new Triangle("Triangle", 45);
        shapes[3] = new Square("Square", 36);
        System.out.println("Sum area and perimeter: " + totalArea(shapes));
        System.out.println(shapes[1].toString());
        System.out.println("Sum area Circle: " + sumAreaCircle(shapes));


    }
//    Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

    public static double totalArea(Shape[] figure) {
        double sumArea = 0;
        double sumPerimeter = 0;
        for (int i = 0; i < figure.length; i++) {
            sumArea += figure[i].area();
            sumPerimeter += figure[i].perimeter();
        }

        return sumArea + sumPerimeter;
    }

    // 3) Вычислите общую площадь кругов. (*)
    public static double sumAreaCircle(Shape[] figure) {
        double sum = 0;

        for (int i = 0; i < figure.length; i++) {
            if (figure[i] instanceof Circle) {
                sum += figure[i].area();
            }
        }
        return sum;
    }
}
