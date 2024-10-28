// Фабрика для создания объектов операций, применение паттерна Factory
public class OperationFactory {

    public static Operation createOperation(String operator) {
        switch (operator) {
            case "+":
                return new Addition();           // Создание объекта сложения
            case "*":
                return new Multiplication();     // Создание объекта умножения
            case "/":
                return new Division();           // Создание объекта деления
            default:
                throw new UnsupportedOperationException("Операция не поддерживается"); // Исключение для неподдерживаемой операции
        }
    }
}
