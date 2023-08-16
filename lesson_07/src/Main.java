public class Main {
    // #1
//  Допустим, у нас есть магазин.
//  В нашем магазине есть товары трёх категорий:
// - + (продукты(FoodProduct), электроника(Electronics), одежда(Clothing).)
// - + У каждого товара есть цена и наименование.
// - + У каждого товара есть метод купить (реализовать через add в корзину)
// - + при покупках продуктов должна появиться дополнительная цена за срочность доставки.
// - + при покупке электроники, покупателю оформляют гарантию
//   (т.е. при покупке должен выполнятся метод “Оформить гарантию”)
//
// Необходимо создать соответствующую структуру классов метод покупки товара.
// Вы можете использовать класс “корзина” реализованный ранее.
    //#2
// + Придумайте свою иерархию классов в которой будет родительский класс и классы наследники, расширяющих его функционал
    public static void main(String[] args) {
        Basket vova = new Basket();
//---------- Shop Electronics ------------

        Electronics samsungGalaxyS20 = new Electronics("phone", 1233);
        Electronics iPhone_11 = new Electronics("phone", 1500);
        Electronics macBookAir = new Electronics("laptop", 1300);


//---------- Shop FoodProduct ------------
        FoodProduct apple = new FoodProduct("Apple", 1.5);
        FoodProduct bread = new FoodProduct("Bread", 2.0);
        FoodProduct yogurt = new FoodProduct("Yogurt", 3.75);
//---------- Shop FoodProduct ------------
        Clothing shirt = new Clothing("Shirt", 25.0);
        Clothing jeans = new Clothing("Jeans", 50.0);
        Clothing shoes = new Clothing("Shoes", 80.0);
// =========================================================================
//        shirt.buy(vova);
        apple.buy(vova);
        shirt.buy(vova);
        macBookAir.buy(vova);
//        vova.printOrder();
    }
}