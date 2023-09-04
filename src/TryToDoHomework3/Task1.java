package TryToDoHomework3;

import java.sql.Array;
import java.util.Scanner;

public class Task1 {
    /*Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
    Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
    Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”,
    “поликлинику”. Пользователь вводит три числа с клавиатуры, которые будут соответствовать
    индексам каждого из элементов массивов. Пример1. после ввода 3,2,1: На экране должно вывестись следующее
    сообщение: “Федя будет идти в магазин в 14:00” Пример2. после ввода 1,2,3: На экране должно вывестись
    следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/

    public static void main(String[] args) {
        System.out.println("Enter values");
        String[] arrayNames = new String[]{"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] arrayNumbers = new int[]{10, 12, 14, 16, 18, 20};
        String[] arrayPlaces = new String[]{"школу", "магазин", "церковь", "тренажерный зал", "кино",
    "поликлинику"};
        Scanner newScanner = new Scanner(System.in);
        int inputValue1 = newScanner.nextInt();
        int inputValue2 = newScanner.nextInt();
        int inputValue3 = newScanner.nextInt();
        System.out.println(arrayNames[inputValue1] +
                " будет идти в " + arrayPlaces[inputValue2] +
                " в " + arrayNumbers[inputValue3] + ":00");

    }
}
