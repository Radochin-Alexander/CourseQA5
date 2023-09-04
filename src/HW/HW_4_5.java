package HW;

import java.util.Random;
import java.util.Scanner;

public class HW_4_5 {

    /*Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число.
    Программа показывает есть ли такое число в созданном до этого массиве.*/

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Допустим, числа от 0 до 99
            System.out.println(numbers[i]); // Для демонстрации чисел в массиве
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputNumber = scanner.nextInt();

        boolean numberFound = false;
        for (int num : numbers) {
            if (num == inputNumber) {
                numberFound = true;
                break;
            }
        }

        if (numberFound) {
            System.out.println("Число " + inputNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + inputNumber + " не найдено в массиве.");
        }
    }
}
