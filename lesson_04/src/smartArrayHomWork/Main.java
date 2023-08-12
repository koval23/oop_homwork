package smartArrayHomWork;

import java.util.Scanner;

public class Main {
// Используя класс SmartArray реализуйте следующую программу:
// пользователь с клавиатуры вводит целые числа.
// Как только пользователь вводит 0, программа выдает следующее:
//    -You have input the following numbers: …введенные_значения…..
//    -Total …количество_чисел… numbers
//    -Average value: …среднее…
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomNumWithScanner randomNum = new RandomNumWithScanner();

        boolean bol = true;

        while (bol) {
            int num = scanner.nextInt();
            if (num != 0) {
                randomNum.addNum(num);
            }else {
                bol = false;
                System.out.println("You have input the following numbers: "+ randomNum.toString());
                System.out.println("Total: "+randomNum.getSize()+" numbers");
                System.out.printf("Average value: %.1f",randomNum.averageValue());
            }
        }

    }
}
