import java.util.Scanner;

public class Task3 {
    /*Используя цикл while просите у пользователя ввести с клавиатуры слово,
 каждое введенное слово нужно добавлять в одну переменную типа стринг,
 что бы там получался тескт из введенных предложений. Программа завершается тогда,
 когда количество символов в тексте превышает 150 символов.*/
    public static void main(String[] args) {

        Scanner words = new Scanner(System.in);
        String arrayWords ="";
        while (arrayWords.length()< 150) {
            System.out.println("Введите слово");
            String x = words.nextLine();
            arrayWords = arrayWords + " " + x;
        }
        System.out.println(arrayWords);
    }
}
