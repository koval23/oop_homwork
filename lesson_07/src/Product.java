public class Product {
    // У нас есть класс Товар (придумайте, какие поля должны быть).

    //    ================================
    private static int currentId = 0;
    private int id;

    // Тип товара (например, "phone", "laptop" и т.д.)

    // Название товара
    private String name;

    // Цена товара
    private double price;


    // Конструктор класса, который инициализирует поля товара
    public Product(String name, double price) {
        this.id = currentId++;
        this.price = price;
        this.name = name;
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
        return"("+ name + ") Price: " + price;
    }
    public void buy(Basket basket) {
        basket.add(this);
    }


}
