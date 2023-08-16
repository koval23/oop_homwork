public class Basket {
    // Класс, представляющий корзину с товарами
//   + Реализуйте класс Корзинка,
//   + в которую можно добавить несколько товаров.
//   + Реализовать метод удаления
//   + и добавления товара в корзину.
//   + Реализовать метод, который распечатает весь заказ.
//   + Реализовать метод, который вернет сумму заказа.
    private int size = 0; // Текущее количество товаров в корзине
    private Product[] arr = new Product[5]; // Массив для хранения товаров


    //================== ADD =========================================
    // Метод для добавления товара в корзину
    public void add(Product product) {

        if (size >= arr.length) {
            increaseArray(); // Если корзина полностью заполнена, увеличиваем массив
        }
        arr[size] = product; // Добавляем товар в корзину
        size++; // Увеличиваем количество товаров
        System.out.println("You have added in basket: " + product.getName());
    }

//    public void addToBasket(Product product) {
//        arr.add(product);
//    }

    // Метод для увеличения размера массива
    private void increaseArray() {
        Product[] tempArray = new Product[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray; // Присваиваем увеличенный массив
    }

    //================== ADD END =========================================
    //================== DELETED =========================================
// Метод для удаления товара из корзины
    public void deleteElement(Product product) {
        size--; // Уменьшаем количество товаров

        // Создаем новый массив для хранения оставшихся товаров
        Product[] newProductArray = new Product[size];

        // Находим индекс элемента, который хотим удалить
        int indexElement = findIndexElement(product);

        // Проверяем, существует ли элемент с таким индексом
        if (indexElement != -1) {
            for (int i = 0, newIndex = 0; i < size + 1; i++) {
                if (i != indexElement) {
                    newProductArray[newIndex++] = arr[i];
                }
            }
        } else {
            System.out.println("No such product"); // Выводим сообщение, если товар не найден
            return;
        }

        arr = newProductArray; // Присваиваем новый массив
    }

    // Метод для нахождения индекса товара в массиве
    public int findIndexElement(Product product) {
        for (int i = 0; i < size; i++) {
            if (product.getId() == arr[i].getId()) {
                System.out.println(arr[i] + " DELETED");
                return i; // Возвращаем индекс товара, если найден
            }
        }
        return -1; // Возвращаем -1, если товар не найден
    }
//================== DELETED END =====================================

    // Метод для печати содержимого корзины
    public void printOrder() {
        System.out.println("===== YOUR BASKET ======");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
        System.out.println("Total price: " + sumOrder());
        System.out.println("===== YOUR BASKET END ======");

    }

    // Метод для расчета суммы стоимости товаров в корзине
    private double sumOrder() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }
}
