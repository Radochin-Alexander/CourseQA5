package HW;

import java.util.Scanner;

public class HW_3_6 {

    /*Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
    Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
    Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
    а после вывести в консоль необходимую ссылку.
    Если программа с таким названием не существует выводит сообщение в консоль,
    о том что такой программы не существует.
    Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая программа вас интересует? (IntelliJ IDEA, Git, Java)");
        String program = scanner.nextLine();

        System.out.println("Какую ОС вы используете? (Linux, macOS, Windows)");
        String os = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка для скачивания IntelliJ IDEA для Linux: [ссылка для Linux]");
                        break;
                    case "macOS":
                        System.out.println("Ссылка для скачивания IntelliJ IDEA для macOS: [ссылка для macOS]");
                        break;
                    case "Windows":
                        System.out.println("Ссылка для скачивания IntelliJ IDEA для Windows: [ссылка для Windows]");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка для скачивания Git для Linux: [ссылка для Linux]");
                        break;
                    case "macOS":
                        System.out.println("Ссылка для скачивания Git для macOS: [ссылка для macOS]");
                        break;
                    case "Windows":
                        System.out.println("Ссылка для скачивания Git для Windows: [ссылка для Windows]");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            case "Java":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка для скачивания Java для Linux: [ссылка для Linux]");
                        break;
                    case "macOS":
                        System.out.println("Ссылка для скачивания Java для macOS: [ссылка для macOS]");
                        break;
                    case "Windows":
                        System.out.println("Ссылка для скачивания Java для Windows: [ссылка для Windows]");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            default:
                System.out.println("Такой программы не существует.");
                break;
        }
    }
}
