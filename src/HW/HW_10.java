package HW;

public class HW_10 {

    /*Написать метод, который будет выводить на консоль информацию о названии магазина в котором происходит покупка,
    о стоимости данной покупки. Об имени продавца, который продает товар, об имени покупателя, который покупает товар,
    название товара и возраст покупателя.

• Продавец может быть честным или нет.
            • Если он честный и товар является алкогольным, то тогда он не продаст данный товар покупателю.
            • Если он нечестный и товар является алкогольным, то тогда он продаст данный товар покупателю.
• Если у покупателя имеется скидочная карта, то цена покупки будет снижена на 10 процентов.
• Все поля классов должны быть приватными.
            • Метод покупки принадлежит самому магазину.
• Свойство честности принадлежит только продавцу.
• Только покупатель может иметь скидочную карту.
    Также метод, который необходимо реализовать для решения данной задачи,
    должен имплементировать функциональный интерфейс с таким же методом.

    По итогу в классе Main должна быть прописана примерно такая логика:

    Shop shop = new Shop();
shop.returnCost();
    Конечно же с правильно заданными параметрами метода, и аргументами конструкторов.

    А на консоль должно выводиться сообщение примерно следующее:

    Уважаемый {Имя покупателя}, продавец {Имя продавца} нашего магазина “{Название магазина}”,
    продаст вам этот товар {Название товара}, в них есть алкогольная продукция, а ваш возраст {Возраст покупателя}.
    Стоимость вашей покупки равна {Стоимость покупки} Вот вам скидка

    P.s. Сообщение для вывода напишите такое, какое пожелаете. Это просто пример.
    Плюс оно должно меняться в зависимости от параметра объектов, которые будут приниматься в метод.*/

    @FunctionalInterface
    interface PurchaseInterface {
        void returnCost(Product product, Seller seller, Buyer buyer);
    }

    class Seller {
        private String name;
        private boolean isHonest;

        public Seller(String name, boolean isHonest) {
            this.name = name;
            this.isHonest = isHonest;
        }

        public String getName() {
            return name;
        }

        public boolean isHonest() {
            return isHonest;
        }
    }

    class Buyer {
        private String name;
        private int age;
        private boolean hasDiscountCard;

        public Buyer(String name, int age, boolean hasDiscountCard) {
            this.name = name;
            this.age = age;
            this.hasDiscountCard = hasDiscountCard;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean hasDiscountCard() {
            return hasDiscountCard;
        }
    }

    class Product {
        private String name;
        private double cost;
        private boolean isAlcoholic;

        public Product(String name, double cost, boolean isAlcoholic) {
            this.name = name;
            this.cost = cost;
            this.isAlcoholic = isAlcoholic;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }

        public boolean isAlcoholic() {
            return isAlcoholic;
        }
    }

    class Shop implements PurchaseInterface {
        private String name;

        public Shop(String name) {
            this.name = name;
        }

        @Override
        public void returnCost(Product product, Seller seller, Buyer buyer) {
            double finalCost = product.getCost();

            if(buyer.hasDiscountCard()) {
                finalCost *= 0.9; // 10% discount
            }

            String message = "Уважаемый " + buyer.getName() + ", продавец " + seller.getName() +
                    " нашего магазина “" + name + "”";

            if(product.isAlcoholic()) {
                if(seller.isHonest() && buyer.getAge() < 18) {
                    message += ", не может продать вам этот товар " + product.getName() +
                            ", так как в нем есть алкогольная продукция, а ваш возраст " + buyer.getAge();
                    System.out.println(message);
                    return;
                }
                message += ", продаст вам этот товар " + product.getName() +
                        ", в нем есть алкогольная продукция, а ваш возраст " + buyer.getAge();
            } else {
                message += ", продаст вам этот товар " + product.getName();
            }

            message += ". Стоимость вашей покупки равна " + finalCost;
            if(buyer.hasDiscountCard()) {
                message += ". Вам предоставлена скидка!";
            }

            System.out.println(message);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Shop shop = new Shop("Лучший магазин");
            Product product = new Product("Вино", 500.0, true);
            Seller seller = new Seller("Анна", true);
            Buyer buyer = new Buyer("Иван", 20, true);

            shop.returnCost(product, seller, buyer);
        }
    }
}
