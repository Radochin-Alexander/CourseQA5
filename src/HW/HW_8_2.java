package HW;

public class HW_8_2 {

    /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводитсообщение, что введен тип boolean.

    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводит сообщение, что введен тип boolean.

    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.*/

    public class Converter {
        private String name;

        public Converter(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int convertToInt(byte value) {
            return value;
        }

        public int convertToInt(short value) {
            return value;
        }

        public int convertToInt(int value) {
            return value;
        }

        public int convertToInt(long value) {
            return (int) value;
        }

        public int convertToInt(char value) {
            return value;
        }

        public int convertToInt(float value) {
            return (int) value;
        }

        public int convertToInt(double value) {
            return (int) value;
        }

        public int convertToInt(String value) {
            return Integer.parseInt(value);
        }

        public int convertToInt(boolean value) {
            System.out.println("Введен тип boolean");
            return 0; // Можно вернуть любое значение или выбросить исключение
        }

        public double convertToDouble(byte value) {
            return value;
        }

        public double convertToDouble(short value) {
            return value;
        }

        public double convertToDouble(int value) {
            return value;
        }

        public double convertToDouble(long value) {
            return value;
        }

        public double convertToDouble(char value) {
            return value;
        }

        public double convertToDouble(float value) {
            return value;
        }

        public double convertToDouble(double value) {
            return value;
        }

        public double convertToDouble(String value) {
            return Double.parseDouble(value);
        }

        public double convertToDouble(boolean value) {
            System.out.println("Введен тип boolean");
            return 0.0; // Можно вернуть любое значение или выбросить исключение
        }

        public String convertToString(byte value) {
            return String.valueOf(value);
        }

        public String convertToString(short value) {
            return String.valueOf(value);
        }

        public String convertToString(int value) {
            return String.valueOf(value);
        }

        public String convertToString(long value) {
            return String.valueOf(value);
        }

        public String convertToString(char value) {
            return String.valueOf(value);
        }

        public String convertToString(float value) {
            return String.valueOf(value);
        }

        public String convertToString(double value) {
            return String.valueOf(value);
        }

        public String convertToString(boolean value) {
            return String.valueOf(value);
        }

        public String convertToString(String value) {
            return value;
        }
    }
}
