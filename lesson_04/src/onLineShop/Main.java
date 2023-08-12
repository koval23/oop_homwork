package onLineShop;

public class Main {
    //    Допустим, мы пишем on-line магазин.
    //TODO сделать рефактор class Product пересмотреть поля продукта
    //TODO возможно каки ето добавит или удалить

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        Product product1 = new Product("phone", "samsung", 1233);
//        System.out.println(product1.toString());
        basket1.add(product1);
        basket1.printOrder();
        System.out.println(basket1.sumOrder());
//       =================================
        System.out.println("======== Oder Alyona =============");
        Product phone1 = new Product("phone", "aiphon-10", 1500);
        Product laptop = new Product("laptop", "MacBook", 1300);
        Basket alenaOder = new Basket();
        alenaOder.add(phone1);
        alenaOder.add(laptop);
        alenaOder.printOrder();
        System.out.println(alenaOder.sumOrder());
    }
}
