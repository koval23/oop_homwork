package lesson_03;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }
    public String toString(){
        return brand +"\n"+"Color: "+color+"\n"+licensePlate+"\n"+registrationDate.toString()+"\n"+engine.toString();
    }
}
