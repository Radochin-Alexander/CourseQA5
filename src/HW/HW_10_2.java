package HW;

import java.util.Random;
import java.util.Scanner;

public class HW_10_2 {

    /*Создать метод, в котором создается одномерный массив типа int произвольного размера от 1 до 30,
    в котором каждому элементу массива присваивается произвольное значение от 0 до 30.
    Данный метод спрашивает у пользователя ввести с клавиатуры индекс случайно сгенерированного массива.
    Метод возвращает значение типа double,
    которое получается при делении элемента с указанным индексом пользователя на первый элемент данного массива.

    Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе.
    Для каждой исключительной ситуации создать собственный класс checked исключения.
    Прописать в методе условия генерации данных исключений, а также указать их в сигнатуре данного метода.

    Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.*/

    import java.util.Random;
    import java.util.Scanner;

    class InvalidArraySizeException extends Exception {
        public InvalidArraySizeException(String message) {
            super(message);
        }
    }

    class InvalidIndexException extends Exception {
        public InvalidIndexException(String message) {
            super(message);
        }
    }

    class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public class ArrayGenerator {

        public double generateAndDivide() throws InvalidArraySizeException, InvalidIndexException, DivisionByZeroException {
            Random random = new Random();
            int size = random.nextInt(30) + 1;
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(31);
            }

            System.out.println("Сгенерированный массив: ");
            for (int val : array) {
                System.out.print(val + " ");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nВведите индекс элемента массива:");
            int index = scanner.nextInt();

            if (index < 0 || index >= size) {
                throw new InvalidIndexException("Введенный индекс выходит за пределы массива!");
            }

            if (array[0] == 0) {
                throw new DivisionByZeroException("Первый элемент массива равен 0. Деление на 0 недопустимо!");
            }

            return (double) array[index] / array[0];
        }

        public static void main(String[] args) {
            ArrayGenerator generator = new ArrayGenerator();
            try {
                double result = generator.generateAndDivide();
                System.out.println("Результат деления: " + result);
            } catch (InvalidArraySizeException | InvalidIndexException | DivisionByZeroException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
