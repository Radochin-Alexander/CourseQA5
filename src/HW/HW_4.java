package HW;

import java.util.Scanner;

public class HW_4 {

    /*Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
    и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
    Все слова введенные до этого должны отобразится в консоли одним предложением.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Введите слова. Для завершения введите слово STOP.");

        while (true) {
            String word = scanner.next();

            if ("STOP".equals(word)) {
                break;
            }

            sentence.append(word).append(" ");  // Добавляем слово и пробел к нашему предложению
        }

        System.out.println("Получившееся предложение:");
        System.out.println(sentence.toString().trim());  // trim() удаляет лишний пробел в конце
    }
}
