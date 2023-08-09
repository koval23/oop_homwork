package lesson_03;

public class Main {
// #1 Создать класс Car со следующими полями (
// String brand, String color, String licensePlate, MyDate registrationDate, Engine engine)

// Обратите внимание, поля registrationDate и engine - это тоже объект.
// Engine - содержит информация о мощности двигателя и о типе (бензин, дизель, электро).
//
//Реализуйте метод toString в каждом классе.
//Реализуйте метод конструктор в каждом классе.
//Создайте два объекта автомобиля.

    public static void main(String[] args) {
//=========Car-1===========
        MyDate renoRegistration = new MyDate(23, 12, 2012);
        Engine powerRenoClio = new Engine("бензин", "120 л.с");
        Car car = new Car("Reno clio", "red", "321-23", renoRegistration, powerRenoClio);
//=========Car-1===========
        MyDate renoRegistration2 = new MyDate(10, 2, 2022);
        Engine powerRenoClio2 = new Engine("бензин", "160");
        Car car2 = new Car("Reno megane", "black", "145-12", renoRegistration2, powerRenoClio2);


        System.out.println(car.toString());
        System.out.println();
        System.out.println(car2.toString());
    }
}
