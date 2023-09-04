package HW;

public class HW_10_3_Exception {

    class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    class ForbiddenProductException extends Exception {
        public ForbiddenProductException(String message) {
            super(message);
        }
    }

    class IndivisibleProductCountException extends Exception {
        public IndivisibleProductCountException(String message) {
            super(message);
        }
    }

    class TooManyProductTypesException extends Exception {
        public TooManyProductTypesException(String message) {
            super(message);
        }
    }
}
