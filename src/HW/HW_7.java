package HW;

public class HW_7 {

    /*Написать метод, принимающий в качестве параметра массив целых чисел.
    И выводит на экран все четные числа списком, a также нечетные числа списком.*/

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displayEvenAndOdd(numbers);
    }

    public static void displayEvenAndOdd(int[] numbers) {
        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println(); // Переходимо на новий рядок

        System.out.print("Odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
