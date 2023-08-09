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

        MyDate renoRegistration = new MyDate(23, 12, 2012);

        Engine powerRenoClio = new Engine("бензин", "120 л.с");

        Car reno = new Car("clio", "red", "321-23", renoRegistration, powerRenoClio);

        System.out.println(reno.toString());
    }
}
