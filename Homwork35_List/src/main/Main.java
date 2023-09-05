package main;

import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List<Integer> numArr1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> numArr2 = Arrays.asList(5, 2, 3, 8);

        List<Integer> n1 = new ArrayList<Integer>(numArr1);
        List<Integer> n2 = new ArrayList<Integer>(numArr2);

        System.out.println(yesOrNoNumber(n1, n2));
//        =======================================================
        List<Integer> numArr3 = Arrays.asList(1, 2, 3, 4, 23, 5, 25, 87, 124, 23, 14);
        List<Integer> n3 = new ArrayList<>(numArr3);
        n3.sort(Collections.reverseOrder());

        System.out.println(lessNumberArr(numArr3, 45));


    }

    //        Задача 1
//  Написать метод, принимающий два листа целых чисел одинаковой длины
//   и возвращающий лист, содержащий элементы Yes или No, где значения
//  на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
//  Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
//  Протестировать
//
    public static List<String> yesOrNoNumber(List<Integer> list1, List<Integer> list2) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        return res;
    }
    //Задача 2
//  Написать метод, принимающий лист целых чисел и целое число
//  и возвращающий лист без элементов больших этого числа.
//  Протестировать.

    public static List<Integer> lessNumberArr(List<Integer> listNum, int num) {
        List<Integer> resArrNum = new ArrayList<>();
        listNum.forEach(n -> {
            if (n <= num) {
                resArrNum.add(n);
            }
        });
        return resArrNum;
    }
}