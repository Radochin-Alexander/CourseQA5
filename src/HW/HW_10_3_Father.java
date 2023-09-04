package HW;

public class HW_10_3_Father {
    import java.util.HashMap;
    import java.util.Map;

    public class Father {
        private String name;
        private int money;
        private Map<Product, Integer> basket = new HashMap<>();

        public Father(String name, int money) {
            this.name = name;
            this.money = money;
        }

        public void buy(Product product, int quantity) throws NotEnoughMoneyException, ForbiddenProductException, IndivisibleProductCountException, TooManyProductTypesException {
            if (basket.keySet().size() > 1 && !basket.containsKey(product)) {
                throw new TooManyProductTypesException("You can buy at most two types of products.");
            }

            int cost = product.getPrice() * quantity;
            if (cost > money) {
                throw new NotEnoughMoneyException("You don't have enough money for this purchase.");
            }

            if (product == Product.BEER || product == Product.TOBACCO) {
                throw new ForbiddenProductException("You can't bring beer or tobacco home.");
            }

            if (quantity % 3 != 0) {
                throw new IndivisibleProductCountException("The quantity of " + product + " can't be divided equally among family members.");
            }

            money -= cost;
            basket.put(product, basket.getOrDefault(product, 0) + quantity);
        }

        public String getName() {
            return name;
        }

        public Map<Product, Integer> getBasket() {
            return basket;
        }

        public int getRemainingMoney() {
            return money;
        }
    }
}
