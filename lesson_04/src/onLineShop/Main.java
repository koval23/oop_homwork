package onLineShop;

public class Main {
    //    Допустим, мы пишем on-line магазин.


    public static void main(String[] args) {

        //        ======== Product in shop =============
        Product samsungGalaxyS20 = new Product("phone", "Samsung Galaxy S20", 1233);
        Product iPhone_11 = new Product("phone", "iPhone 11", 1500);
        Product macBookAir = new Product("laptop", "MacBook Air", 1300);
        Product macBookPro = new Product("laptop", "MacBook Pro", 1400);
        Product samsungGalaxyTab = new Product("tablet", "Samsung Galaxy Tab", 800);
        Product appleWatchSeries6 = new Product("watch", "Apple Watch Series 6", 400);
        Product sonyWH_1000XM4 = new Product("headphones", "Sony WH-1000XM4", 300);
        Product logitechGProX = new Product("keyboard", "Logitech G Pro X", 150);
        Product razerDeathAdderElite = new Product("mouse", "Razer DeathAdder Elite", 70);
        Product dellU2719D = new Product("monitor", "Dell U2719D", 400);
        //        =================================================================

        // Создание объекта класса Basket для оформления заказа
        Basket alenaOder = new Basket();
        // Добавление товаров в корзину
        alenaOder.add(samsungGalaxyS20);
        alenaOder.add(macBookPro);
        alenaOder.add(appleWatchSeries6);
        // Добавление того же товара повторно
        alenaOder.add(macBookPro);
        // Печать содержимого корзины
        alenaOder.printOrder();

        System.out.println("===================");
        // Удаление товаров из корзины
        alenaOder.deleteElement(macBookPro);
        alenaOder.deleteElement(samsungGalaxyS20);
        alenaOder.deleteElement(appleWatchSeries6);
        // Печать содержимого корзины
        alenaOder.printOrder();



    }
}
