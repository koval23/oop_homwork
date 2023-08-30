package ait.test;

import ait.Person.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestPerson {
// Напишите OddEvenComparator,
// реализующий Comparator с методом сравнения для сортировки
// массива целых чисел в следующем порядке:
// четные целые числа должны идти перед нечетными числами.
//Пример: {1, 3, 5 ,10,12, 45, 78, 23}
//        {10, 12, 78, 1, 3, 5, 45, 23}
//    =========================================
//    Обновите OddEvenComparator, добавив в него метод сравнения
//    для сортировки массива целых чисел по порядку:
//    четные целые числа должны идти перед нечетными числами в порядке возрастания.
//    Нечетные целые числа должны идти после четных в порядке убывания.
//    Напишите тестовый пример Junit для OddEvenComparator.
//    Целое число [] начало = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
//    Ожидается целое число [] = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
//    =========================================
    OddEvenComparator[] oddEvenComparators;
    Integer[] numbers;

    @BeforeEach
    void setUp() {
        numbers = new Integer[]{1, 3, 5, 10, 12, 45, 78, 23};
    }

    @Test
    void OddEvenComparatorTest() {
        Arrays.sort(numbers, new OddEvenComparator());
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }

    }
}