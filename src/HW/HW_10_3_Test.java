package HW;

import java.util.Map;

public class HW_10_3_Test {
    public class Main {
        public static void main(String[] args) {
            HW_10_3_Father.Father father = new HW_10_3_Father.Father("Валентин", 500);

            try {
                father.buy(HW_10_3_Enum.Product.APPLE, 3);
                father.buy(HW_10_3_Enum.Product.MILK, 6);

                System.out.println("Уважаемый " + father.getName() + ", стоимость ваших покупок " + (500 - father.getRemainingMoney()) + ".");
                for (Map.Entry<HW_10_3_Enum.Product, Integer> entry : father.getBasket().entrySet()) {
                    System.out.println("Вы приобрели " + entry.getKey() + " в количестве " + entry.getValue() + ".");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
