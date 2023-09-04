package HW;

import java.util.Scanner;

public class HW_3_3 {
    /*При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
    и всегда отнимать от большего меньшее.
    Вывести эту разность в консоль.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int difference = a > b ? a - b : b - a;

        System.out.println("Разность большего числа и меньшего: " + difference);
    }
}
