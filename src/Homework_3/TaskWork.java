package Homework_3;

import java.util.Scanner;

/*3) Создать метод принимающий в параметры два аргументы строкового типа. Этот метод ничего не возвращает,
 он выводит в консоль сообщение:
" Вы ввели две строки.
Первая: $Строка которая введена в первом параметре$.
Вторая: $Строка которая введена во втором параметре$.*/
public class TaskWork {
    public void inputText (String val1, String val2) {
        System.out.println("Вы ввели две строки");
        System.out.println("Первая: " + val1);
        System.out.println("Вторая: " + val2);
    }
}
