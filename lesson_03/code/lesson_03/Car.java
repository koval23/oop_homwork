package lesson_03;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;
    boolean drive;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine, boolean drive) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
        this.drive = drive;
    }

    public String toString() {
        return brand + "\n" + "Color: " + color + "\n" + licensePlate + "\n" + registrationDate.toString() + "\n" + engine.toString() + "\n" + driveOrNotDrive();
    }

    public String driveOrNotDrive() {
        if (drive) {
            return "Drive";
        } else {
            return "Not Drive";
        }
    }
}
