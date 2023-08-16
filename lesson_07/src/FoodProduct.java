public class FoodProduct extends Product {
    public FoodProduct(String name, double price) {
        super(name, price);
    }
    public void priceForUrgency() {
        System.out.println("цена за срочность: 10%");
    }
    public void buy(Basket basket) {
        basket.add(this);
        priceForUrgency();
    }


}
