import Homework_3.TaskWork;

import java.util.Scanner;

public class Peoples {
    public static void main(String[] args) {
//        Person ivan = new Person();
//        ivan.name = "Ivan";
//        ivan.age = 20;
//        ivan.isMarried = true;
//        ivan.lastName = "Fedorov";
//
//        ivan.aboutPerson();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String first = input.nextLine();
        String second = input.nextLine();

        TaskWork newTask = new TaskWork();
        newTask.inputText( first, second);


    }
}
