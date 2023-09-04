package HW;

public class HW_8_1 {

    /*Создать класс Tree с перегруженными конструкторами.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;

    Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".

    Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".

    Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".

    Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.

    Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/

    public class Tree {

        private String type;
        private int height;
        private int countOfSticks;
        private String colour;

        // Конструктор1
        public Tree(String type, int height) {
            this.type = type;
            this.height = height;
            this.countOfSticks = 13;
            this.colour = "Зеленый";
        }

        // Конструктор2
        public Tree(int height, int countOfSticks, String colour) {
            this.type = "пихта";
            this.height = height;
            this.countOfSticks = countOfSticks;
            this.colour = colour;
        }

        // Конструктор по умолчанию
        public Tree() {
            this.height = 350;
            this.countOfSticks = 29;
            this.colour = "Желтый";
        }

        // Конструктор4
        public Tree(String type) {
            this(); // вызывает конструктор по умолчанию
            this.type = type;
        }

        @Override
        public String toString() {
            return "Tree{" +
                    "type='" + type + '\'' +
                    ", height=" + height +
                    ", countOfSticks=" + countOfSticks +
                    ", colour='" + colour + '\'' +
                    '}';
        }
    }
}
