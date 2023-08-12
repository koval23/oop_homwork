package onLineShop;

public class Basket {
    //   + Реализуйте класс Корзинка,
//   + в которую можно добавить несколько товаров.
//   ? Реализовать метод добавления
//   + и добавления товара в корзину.
//   + Реализовать метод, который распечатает весь заказ.
//   + Реализовать метод, который вернет сумму заказа.
    private int size = 0;
    private Product[] arr = new Product[5];

    // добавляет продукт в массив
    public void add(Product product) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = product;
        size++;
    }

    // увеличивает количество мест в корзине(массиве)
    private void increaseArray() {
        Product[] tempArray = new Product[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    //    метод, который распечатает весь заказ.
    public void printOrder() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public double sumOrder() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }
}
