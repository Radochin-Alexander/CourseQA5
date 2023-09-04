package HW;

import java.util.Scanner;

public class HW_3_2 {
    /*Пользователь вводит с клавиатуры три целочисленных значения.
    На экран выводится информация можно ли из этих сторон построить треугольник.
        (необходимо вспомнить правило построения треугольника по трем сторонам).*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника:");
        int a = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника:");
        int b = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Из данных сторон можно построить треугольник.");
        } else {
            System.out.println("Из данных сторон нельзя построить треугольник.");
        }
    }
}
