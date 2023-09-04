public class Person {
    public String name;
    public String lastName;
    public int age;
    public boolean isMarried;

    public void aboutPerson() {
        System.out.println("Имя человека " + name);
        System.out.println("Фамилия человека " + lastName);
        System.out.println("Возраст человека " + age);
        if (isMarried) {
            System.out.println("В браке");
        } else {
            System.out.println("Не в браке");
        }
    }
}