package seminars.first.Calculator;

public class Main {
    public static void main(String[] args) {
        // Пример тестов метода calculateDiscount с выводом результатов

        // Сумма покупки 1000, скидка 10%
        double result1 = Calculator.calculateDiscount(1000, 10);
        System.out.println("Сумма покупки 1000 со скидкой 10%: " + result1);  // Ожидается: 900.0

        // Сумма покупки 500, скидка 0%
        double result2 = Calculator.calculateDiscount(500, 0);
        System.out.println("Сумма покупки 500 без скидки: " + result2);  // Ожидается: 500.0

        // Сумма покупки 100, скидка 100%
        double result3 = Calculator.calculateDiscount(100, 100);
        System.out.println("Сумма покупки 100 со скидкой 100%: " + result3);  // Ожидается: 0.0

        // Пример с недопустимыми данными: сумма покупки отрицательная
        try {
            Calculator.calculateDiscount(-100, 10);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Ожидается исключение
        }

        // Пример с недопустимыми данными: скидка больше 100%
        try {
            Calculator.calculateDiscount(100, 110);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Ожидается исключение
        }

        // Пример с недопустимыми данными: отрицательная скидка
        try {
            Calculator.calculateDiscount(100, -5);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Ожидается исключение
        }
    }
}
