package smartArrayHomWork;

public class RandomNumWithScanner {
    private SmartArray array;

    //    =============================
    public RandomNumWithScanner() {
        array = new SmartArray();
    }
//    =============================


    public int getSize() {
        return array.getSize();
    }
// добавляет число в массив
    public void addNum(int num) {
        array.add(num);
    }
// выводит на печать массив
    public String toString() {
        return array.toString();
    }
// возвращает среднее значение всех чисел массива
    public double averageValue() {
        return array.averageValue();
    }
}
