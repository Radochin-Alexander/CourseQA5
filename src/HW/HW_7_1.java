package HW;

public class HW_7_1 {

    /*Написать перегруженный метод, который может:

            •	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
            •	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
            •	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
            •	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
            •	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/


    // Метод без параметрів
    public static void displayMessage() {
        System.out.println("Я пустой");
    }

    // Метод з одним параметром String
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    // Метод з масивом строк
    public static void displayMessage(String[] messages) {
        for (String message : messages) {
            System.out.print(message + " ");
        }
        System.out.println(); // Перехід на новий рядок
    }

    // Метод з масивом чисел
    public static void displayMessage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    // Метод з числом і строкою
    public static void displayMessage(int number, String message) {
        System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + number);
    }
}
