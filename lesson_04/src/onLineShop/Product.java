package onLineShop;

import java.util.UUID;

public class Product {
    // У нас есть класс Товар (придумайте, какие поля должны быть).

    //    ================================
    private static int currentId = 0;
    private int id;

    // Тип товара (например, "phone", "laptop" и т.д.)
    private String type;

    // Название товара
    private String name;

    // Цена товара
    private double price;

    // Корзина, в которой может находиться этот товар
    private Basket basket;

    // Конструктор класса, который инициализирует поля товара
    public Product(String type, String name, double price) {
        this.id = currentId++;
        this.type = type;
        this.price = price;
        this.name = name;
        basket = new Basket(); // Создание новой корзины для товара
    }

    // Метод для получения уникального идентификатора товара
    public int getId() {
        return id;
    }

    // Метод для получения цены товара
    public double getPrice() {
        return price;
    }

    // Метод для получения названия товара
    public String getName() {
        return name;
    }

    // Переопределение метода toString() для удобного вывода информации о товаре
    public String toString() {
        return "Type product: "+type + "\nModel: (" + name + ") \nPrice: " + price;
    }
}
