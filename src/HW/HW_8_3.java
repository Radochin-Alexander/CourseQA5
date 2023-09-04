package HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_8_3 {

    /*Создать класс калькулятор.
    В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.

    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.

    Калькулятор должен принимать только следующие типы действий:
            2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.

    В случае ввода другого синтаксисана консоль возвращается сообщение:
            "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.

    Программа закрывается после ввода команды Stop.
    Перед закрытием на консоль должно выводится сообщение:
            "Калькулятор закрыт".*/

    public class Calculator {

        public void summ(double a, double b) {
            System.out.println(a + b);
        }

        public void minus(double a, double b) {
            System.out.println(a - b);
        }

        public void multiply(double a, double b) {
            System.out.println(a * b);
        }

        public void division(double a, double b) {
            if (b == 0) {
                System.out.println("Деление на ноль невозможно!");
            } else {
                System.out.println(a / b);
            }
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            Pattern pattern = Pattern.compile("^(\\d+\\.?\\d*)\\s*([+\\-*/])\\s*(\\d+\\.?\\d*)$");

            System.out.println("Калькулятор запущен. Введите действие:");

            while (true) {
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт");
                    break;
                }

                Matcher matcher = pattern.matcher(input);
                if (matcher.matches()) {
                    double a = Double.parseDouble(matcher.group(1));
                    double b = Double.parseDouble(matcher.group(3));
                    char operation = matcher.group(2).charAt(0);

                    switch (operation) {
                        case '+':
                            summ(a, b);
                            break;
                        case '-':
                            minus(a, b);
                            break;
                        case '*':
                            multiply(a, b);
                            break;
                        case '/':
                            division(a, b);
                            break;
                    }
                } else {
                    System.out.println("Введите корректное действие");
                }

                System.out.println("Введите следующее действие или 'Stop' для завершения:");
            }

            scanner.close();
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }
    }
}
