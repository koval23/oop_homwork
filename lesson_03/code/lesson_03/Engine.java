package lesson_03;

public class Engine {
    //#2 В классе Engine добавьте методы start и stop.
    // Каждый из них пусть выводит строку "Engine is started" "Engine is stopped".
    String type;
    String power;
    public Engine(String type, String power){
        this.type = type;
        this.power = power;
    }
    public String toString(){
        return "Power: "+power+" л.с."+"\n"+"Type: "+type;
    }
    public void start(){
        System.out.println("Engine is started");
    }
    public void stop(){
        System.out.println("Engine is stopped");
    }
}
