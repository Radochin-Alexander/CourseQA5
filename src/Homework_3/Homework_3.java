package Homework_3;

import java.util.Scanner;

public class Homework_3 {
    /*У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры
     в консоль. Необходимо при помощи только метода next() класса Scanner
     (не используем метод nextLine()) присвоить перемнным типа String следующие значения:
     string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
     Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("FIRST TASK");
        System.out.println("================");

        System.out.println("Enter text");
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        System.out.println("Enter text");
        String string2 = input.next();
        System.out.println("Enter text");
        String string3 = input.next();
        System.out.println("Enter text");
        String string4 = input.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);


        System.out.println("================");
        System.out.println("SECOND TASK");
        System.out.println("================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение первой стороны: ");
        int side1 = scanner.nextInt();

        System.out.print("Введите значение второй стороны: ");
        int side2 = scanner.nextInt();

        System.out.print("Введите значение третьей стороны: ");
        int side3 = scanner.nextInt();

        boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);

        if (isTriangle) {
            System.out.println("Можно построить треугольник");
        } else {
            System.out.println("Нельзя построить треугольник");
        }

        System.out.println("================");
        System.out.println("THIRD TASK");
        System.out.println("================");

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner1.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner1.nextInt();

        int difference = (number1 > number2) ? (number1 - number2) : (number2 - number1);
        System.out.println("Разность чисел: " + difference);

        System.out.println("================");
        System.out.println("THIRD TASK");
        System.out.println("================");

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner2.nextInt();

        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Суббота");
        } else if (number == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }

        System.out.println("================");
        System.out.println("FOURTH TASK");
        System.out.println("================");

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number11 = scanner3.nextInt();

        System.out.print("Введите второе число: ");
        int number22 = scanner3.nextInt();

        System.out.print("Введите символ операции (+, -, *, /, %): ");
        char operator = scanner3.next().charAt(0);

        int result = (operator == '+') ? (number11 + number22)
                : (operator == '-') ? (number11 - number22)
                : (operator == '*') ? (number11 * number22)
                : (operator == '/') ? (number11 / number22)
                : (operator == '%') ? (number11 % number22)
                : 0;

        System.out.println("Результат: " + result);



    }
}
