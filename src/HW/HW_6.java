package HW;

import java.util.Random;

public class HW_6 {

   /* Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.*/

    public static void main(String[] args) {
        Random random = new Random();

        // Создаем двумерный массив (например, размером 5x5)
        int[][] twoDArray = new int[5][5];

        // Заполняем массив случайными числами
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = random.nextInt(1001);
            }
        }

        // Создаем одномерный массив для максимальных значений
        int[] maxValues = new int[twoDArray.length];

        // Ищем максимальные значения для каждого вложенного массива
        for (int i = 0; i < twoDArray.length; i++) {
            int max = twoDArray[i][0];  // берем первое значение как начальное максимальное
            for (int j = 1; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j] > max) {
                    max = twoDArray[i][j];
                }
            }
            maxValues[i] = max;
        }

        // Выводим новый массив на экран
        for (int value : maxValues) {
            System.out.println(value);
        }
    }
}
