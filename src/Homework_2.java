import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("FIRST TASK");
        System.out.println("================");
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.concat(" it is perfect.");

        System.out.println(string1);
        System.out.println(string1.length());

        System.out.println(string2);
        System.out.println(string2.length());

        System.out.println(string3);
        System.out.println(string3.length());
        System.out.println("================");
        System.out.println("SECOND TASK");
        System.out.println("================");
        String string = "Testing, is my favourite job";

        String[] words = string.split(" ");

        String firstWord = words[0].replaceAll(",", "");
        System.out.println("Cлово1 = " + firstWord + ", Длина этого слова = " + firstWord.length());

        String secondWord = words[1];
        System.out.println("Cлово2 = " + secondWord + ", Длина этого слова = " + secondWord.length());

        String thirdWord = words[2];
        System.out.println("Cлово3 = " + thirdWord + ", Длина этого слова = " + thirdWord.length());

        String fourthWord = words[3].replaceAll(",", "");
        System.out.println("Cлово4 = " + fourthWord + ", Длина этого слова = " + fourthWord.length());

        String fifthWord = words[4];
        System.out.println("Cлово5 = " + fifthWord + ", Длина этого слова = " + fifthWord.length());

        System.out.println(firstWord.length() > secondWord.length()
                && firstWord.length() > thirdWord.length() && firstWord.length()
                > fourthWord.length() && firstWord.length() > fifthWord.length());
        System.out.println("================");
        System.out.println("THIRD TASK");
        System.out.println("================");

        String stringg = "Completely random text in English. In it, we just need to determine" +
                " how many times the character ‘a’ occurs there. And we can use the split" +
                " method and the length method.";
        stringg = stringg.toLowerCase();

        String[] splitArray = stringg.split("a");

        System.out.println("Символ ‘a’ встречается " + (splitArray.length - 1) + " раз.");
    }
}
