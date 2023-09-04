package HW;

import java.util.Scanner;

public class HW_4_2 {

    /*Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
    является она полиндромом или нет.
    И выводит данную информацию на экран.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Число является полиндромом.");
        } else {
            System.out.println("Число не является полиндромом.");
        }
    }

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
