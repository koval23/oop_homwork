package onLineShop;

public class Product {
    //    У нас есть класс Товар (придумайте, какие поля должны быть).
    private String type;
    private String model;
    private double price;
    private Basket basket;

    public Product(String type, String model, double price) {
        this.type = type;
        this.price = price;
        this.model = model;
        basket = new Basket();
    }
    public double getPrice(){
        return price;
    }

    public String toString() {
        return type + ", " + model + " " + price;
    }
}
