package HW;

public enum HW_10_3_Enum {

    public enum Product {
        APPLE(10),
        POTATO(5),
        MILK(20),
        BEER(50),
        TOBACCO(40);

        private final int price;

        Product(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
