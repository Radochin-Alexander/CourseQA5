package HW;

import java.util.Random;

public class HW_4_6 {

    /*Заполнить массив на 45 элементов случайными числами от -50 до +50.
    Найти минимальный элемент и вывести его на консоль. Найти максимальный элемент и вывести его на консоль.*/


    public static void main(String[] args) {
        int[] numbers = new int[45];
        Random random = new Random();

        // Заполнение массива
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50; // Получаем случайное число от 0 до 100 и вычитаем 50,
            // чтобы получить диапазон от -50 до +50
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        // Поиск минимального и максимального элемента
        for (int num : numbers) {
            if (num < minNumber) {
                minNumber = num;
            }
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        System.out.println("Минимальное число в массиве: " + minNumber);
        System.out.println("Максимальное число в массиве: " + maxNumber);
    }
}
