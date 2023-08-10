package lesson_03;

public class Car {
    // В классе Car добавьте методы drive и stop. Первый должен заводить двигатель
    // и писать, что такая-то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.

    // #3 ** Реализовать проверку, если машина уже едет, а я пытаюсь
    // вызвать метод drive, должно появляться сообщение, что машина уже едет.
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;
    boolean flag = false;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString() {
        return brand + "\n" + "Color: " + color + "\n" + licensePlate + "\n" + registrationDate.toString() + "\n" + engine.toString() + "\n";
    }

    public void drive() {
        if (flag) {
            System.out.println("Машина уже едет.");
        } else {
            flag = true;
            System.out.println("Машина " + brand + " поехала!");
        }
    }

    public void stop() {
        if (flag) {
            flag = false;
            System.out.println("Машина " + brand + " остановилась!");
        } else {
            System.out.println("Машина стоит!");
        }
    }
}
