package HW;

import java.util.Random;
import java.util.Scanner;

public class HW_5 {

    /*За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
    та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
    Перед початком на екран виводиться текст: Let the game begin!
    Сам процес гри обробляється у нескінченному циклі.
    Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим,
    що ввів користувач. • Якщо введене число менше загаданого, програма виводить на екран текст:
    Your number is too small. Please, try again.. Якщо введене число більше за загадане,
    то програма виводить на екран текст: Your number is too big. Please, try again..
    Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
    Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(101); // генеруємо випадкове число від 0 до 100

        System.out.print("Введіть своє ім'я: ");
        String name = scanner.nextLine();

        System.out.println("Let the game begin!");

        while (true) { // нескінченний цикл
            System.out.print("Введіть число: ");
            int guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break; // вихід із циклу
            }
        }
        scanner.close();
    }
}
