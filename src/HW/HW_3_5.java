package HW;

import java.util.Scanner;

public class HW_3_5 {

    /*Написать программу, используя тернарный оператор,
    где пользователь вводит с клавиатуры два числа и символ – или + или % или / или *.
    На экран выводится резултат действия над двумя введенными числами.
    Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Введите символ действия (+, -, *, /, %):");
        char operation = scanner.next().charAt(0);

        double result = operation == '+' ? num1 + num2 :
                operation == '-' ? num1 - num2 :
                        operation == '*' ? num1 * num2 :
                                operation == '/' && num2 != 0 ? num1 / num2 : // Проверка деления на ноль
                                        operation == '%' && num2 != 0 ? num1 % num2 : // Проверка деления на ноль
                                                0; // Все остальные символы

        System.out.println("Результат: " + result);
    }


}
