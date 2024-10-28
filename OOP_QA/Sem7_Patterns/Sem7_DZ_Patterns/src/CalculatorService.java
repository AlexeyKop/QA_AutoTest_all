import java.util.logging.Logger;

// Класс для выполнения операций с логированием
public class CalculatorService {
    private final Logger logger = Logger.getLogger(CalculatorService.class.getName());

    public ComplexNumber calculate(String operator, ComplexNumber a, ComplexNumber b) {
        Operation operation = OperationFactory.createOperation(operator); // Создание операции
        ComplexNumber result = operation.execute(a, b);                   // Выполнение операции
        logger.info("Выполнена операция " + operator + " для " + a + " и " + b + ". Результат: " + result); // Логирование
        return result;
    }
}
