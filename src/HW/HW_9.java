package HW;

import java.util.Arrays;

public class HW_9 {


    /*• У класі Human створіть конструктори:
            • конструктор, що описує ім'я, прізвище та рік народження
            • конструктор, що описує ім'я, прізвище, рік народження, тата та маму
            • конструктор, який описує всі поля
• Порожній конструктор
• Оголосіть усі поля наявних класів як приватні. Додайте гетери та сетери; зробіть рефакторинг наявних методів з урахуванням змін.
• Опишіть у класу Family наступні поля:
            • мама mother (тип Human)
• тато father (тип Human)
• діти children (масив Human)
• домашній улюбленець pet (тип Pet)
• Додайте гетери, сетери; пере визначте toString так щоб він показував всю інформацію про всіх членів сім’ї.
• У класі Family створіть конструктор:\
            • єдиною умовою створення нової сім'ї є наявність 2-х батьків,
    причому у батьків має встановлюватися посилання на поточну нову сім'ю,
    а сім'я створюється з порожнім масивом дітей.
            • Зробіть рефакторинг класу Human з урахуванням структури Family:
            • Видаліть з Human всю інформацію, що дублюється в класі Family (Human повинен зберігати тільки інформацію,
                                                                             що описує себе)
• додайте поле family (тип Family) (тепер воно зберігає всю інформацію про сімейні дані людини)
            • додайте необхідні гетери, сетери, конструктори; видаліть неактуальні конструктори та методи;
            зробіть рефакторинг методів привітати свого улюбленця, описати свого улюбленця, нагодувати
• Зробіть рефакторинг методу toString(). Він повинен виводити інформацію в наступному форматі:
    Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}.
            • У Family опишіть методи:
            • додати дитину addChild (приймає тип Human і додає її до масиву дітей;
            додає дитині посилання на поточну родину)
            • видалити дитину deleteChild (приймає індекс масиву та видаляє даний елемент;
            повертає логічне значення - чи був видалений елемент)
            • отримати кількість осіб у сім'ї countFamily (батьки у сім'ї ніколи не змінюються;
            якщо відбувається зміна батьківського складу – це вже інша родина)
            • Пере визначте метод toString()
• Вирішіть, які поля варто використовувати для порівняння в методі equals()
    (наприклад, звички тварини можуть змінюватися).
            • У класі Main створіть кілька сімей, щоб у кожного класу були використані всі можливі конструктори.
    Виведіть інформацію про кожну людину на екран.
• У класі Main створіть маму, тата, дитину та її домашню тварину. Надайте всі необхідні посилання
            (у дитини на батьків та вихованця), щоб вийшла повноцінна сім’я.
    Викличте всі доступні методи у дитини (включаючи метод toString()) та у його вихованця.*/



    class Pet {
        private String species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String[] habits;

        public Pet(String species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }

        public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        public Pet() {}

        public void eat() {
            System.out.println("Я ї'м!");
        }

        public void respond() {
            System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
        }

        public void foul() {
            System.out.println("Потрібно добре замести сліди...");
        }

        @Override
        public String toString() {
            return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
        }
    }

    class Human {
        private String name;
        private String surname;
        private int year;
        private int iq;
        private Family family;
        private Pet pet;

        public Human(String name, String surname, int year) {
            this.name = name;
            this.surname = surname;
            this.year = year;
        }

        public Human(String name, String surname, int year, Human mother, Human father) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            if (mother != null) this.family = mother.family;
            if (father != null) this.family = father.family;
        }

        public Human(String name, String surname, int year, Human mother, Human father, Family family, Pet pet, int iq) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.family = family;
            this.pet = pet;
            this.iq = iq;
        }

        public Human() {}

        public void greetPet() {
            System.out.println("Привіт, " + pet.nickname);
        }

        public void describePet() {
            String slyness = (pet.trickLevel > 50) ? "дуже хитрий" : "майже не хитрий";
            System.out.println("У мене є " + pet.species + ", їй " + pet.age + " років, він " + slyness);
        }

        @Override
        public String toString() {
            return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", family=" + family + ", pet=" + pet + "}";
        }
    }

    class Family {
        private Human mother;
        private Human father;
        private Human[] children;
        private Pet pet;

        public Family(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
            this.children = new Human[0];
            mother.family = this;
            father.family = this;
        }

        public void addChild(Human child) {
            children = Arrays.copyOf(children, children.length + 1);
            children[children.length - 1] = child;
            child.family = this;
        }

        public boolean deleteChild(int index) {
            if (index < 0 || index >= children.length) {
                return false;
            }
            Human[] updatedChildren = new Human[children.length - 1];
            for (int i = 0, j = 0; i < children.length; i++) {
                if (i != index) {
                    updatedChildren[j++] = children[i];
                }
            }
            children = updatedChildren;
            return true;
        }

        public int countFamily() {
            return 2 + children.length; //2 is for parents
        }

        @Override
        public String toString() {
            return "Family{" + "mother=" + mother + ", father=" + father + ", children=" + Arrays.toString(children) + ", pet=" + pet + "}";
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Ваш код для тестування створених класів буде тут.
        }
    }
}
