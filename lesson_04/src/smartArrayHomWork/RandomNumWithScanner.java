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

    public void addNum(int num) {
        array.add(num);
    }

    public String toString() {
        return array.toString();
    }

    public double averageValue() {
        return array.averageValue();
    }
}
