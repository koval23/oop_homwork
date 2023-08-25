package ait.proect.homwork.exesize1;

import java.util.Arrays;
import java.util.Random;

public class RundomArr {
    //    Задача 1.
//    + Задайте массив на 10 элементов и заполните его
//    + случайными числами в интервале от -10 до 10.
//    + Распечатайте полученный массив.
//    Создайте метод, который определяет наличие
//    дубликатов в массиве.
//    Разработайте соответсвующий тест (набор тестов).
    public static void main(String[] args) {
        int[] runArrNum = new int[10];
        for (int i = 0; i < runArrNum.length; i++) {
            runArrNum[i] = (int) (-10 + (Math.random() * (10 - (-10) + 1)));
        }
//        int[] runArrNum = {-9, 5, 3, -2, 4, 7, 10, -6};
        System.out.println(Arrays.toString(runArrNum));
        System.out.println(isdublicateNumInArr(runArrNum));
    }

    public static boolean isdublicateNumInArr(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
