package smartArrayHomWork;

import java.util.Arrays;

public class SmartArray {
    // size - переменная которая считает количество оценок которое мы добавили
    private int size = 0;
    // arr - начальный массив  типа int
    private int[] arr = new int[4];

    public int getSize(){
        return size;
    }


    // add метод, который добавляет числа в массив
    public void add(int element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    // increaseArray - пересоздает массив с количеством под оценки x2
// при условии, что количество мест закончилось
    private void increaseArray() {
        int[] tempArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public String specialToString() {
        return Arrays.toString(arr) + "   size: " + size;
    }

    // getArray - возвращает массив с всеми элементами массива
    public int[] getArray() {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    //  toString - возвращает строку с всеми оценками массива
    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += (i == 0 ? "" : ", ") + arr[i];
        }
        res += "]";
        return res;
    }
//
    public double averageValue(){
        double sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return sum/ size;
    }

}
