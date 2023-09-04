package TryToDoHomework3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    /*За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
     та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
      • Перед початком на екран виводиться текст: Let the game begin!
      • Сам процес гри обробляється у нескінченному циклі.
      • Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим,
      що ввів користувач. • Якщо введене число менше загаданого, програма виводить на екран текст:
      Your number is too small. Please, try again.. Якщо введене число більше за загадане,
      то програма виводить на екран текст: Your number is too big. Please, try again..
      • Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
      • Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner1 = new Scanner(System.in);
        String nameValue = scanner1.next();
        System.out.println("Let the game begin!");
        Random rand = new Random();
        int newInt = rand.nextInt(101);
        while (true) {
            System.out.println("Enter value");
            int intValue = scanner1.nextInt();
            if (intValue > newInt){
                System.out.println("Your number is too big. Please, try again.");
            }else if (intValue < newInt) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Congratulations, " + nameValue + "!");
                break;
            }

        }
    }
}
