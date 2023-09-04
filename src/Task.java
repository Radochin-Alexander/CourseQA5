import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number");
        int num = input.nextInt();
        if (num > 15 && num % 2 == 0) {
            System.out.println("Число чётное и больше 15");
        } else {
            System.out.println("Число нечётное и меньше 15");
        }
    }
}