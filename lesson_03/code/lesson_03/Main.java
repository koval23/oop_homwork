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

//#2 В классе Engine добавьте методы start и stop.
// Каждый из них пусть выводит строку "Engine is started" "Engine is stopped".

// В классе Car добавьте методы drive и stop. Первый должен заводить двигатель
// и писать, что такая-то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.

// #3 ** Реализовать проверку, если машина уже едет, а я пытаюсь
// вызвать метод drive, должно появляться сообщение, что машина уже едет.


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
        car.drive();
        car.stop();

    }
}
