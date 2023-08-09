package lesson_03;

public class Engine {

    String type;
    String power;
    public Engine(String type, String power){
        this.type = type;
        this.power = power;
    }
    public String toString(){
        return "Мощность: "+power+"Тип: "+type;
    }
}
