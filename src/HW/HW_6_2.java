package HW;

import java.util.Random;
import java.util.Scanner;

public class HW_6_2 {

    /*Даний квадрат 5х5, де програма випадковим чином ставить ціль.
            • Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
            • Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
            • Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
            • Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки,
    куди гравець вже стріляв, слід зазначити як *.
            • Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!,
    а також ігрове поле.
            • Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).*/

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Створюємо ігрове поле 5x5
    char[][] board = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
        }
    }

    // Випадкове розміщення цілі
    int targetRow = random.nextInt(5);
    int targetCol = random.nextInt(5);

        System.out.println("All Set. Get ready to rumble!");

        while (true) {
        // Показуємо ігрове поле
        displayBoard(board);

        System.out.println("Enter row (1-5): ");
        int row = getUserInput() - 1;

        System.out.println("Enter column (1-5): ");
        int col = getUserInput() - 1;

        // Перевірка попадання
        if (row == targetRow && col == targetCol) {
            board[row][col] = 'x';
            displayBoard(board);
            System.out.println("You have won!");
            break;
        } else if (board[row][col] == '*') {
            System.out.println("You've already shot here!");
        } else {
            board[row][col] = '*';
        }
    }
}

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= 1 && input <= 5) {
                    return input;
                } else {
                    System.out.println("Invalid input. Enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static void displayBoard(char[][] board) {
        System.out.println("[0, 1, 2, 3, 4, 5]");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print(", " + board[i][j]);
            }
            System.out.println("]");
        }
    }
}
