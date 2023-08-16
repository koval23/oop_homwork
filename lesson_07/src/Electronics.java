public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
    }
    public void issuingGuarantee(){
        System.out.println("Вам оформлена гарантия");
    }
    public void buy(Basket basket) {
        basket.add(this);
        issuingGuarantee();

    }
}
