// Контроллер для обработки запросов на вычисления
public class CalculatorController {
    private final CalculatorService service = new CalculatorService();

    // Метод выполнения операции и возврата результата
    public ComplexNumber performOperation(String operator, ComplexNumber a, ComplexNumber b) {
        return service.calculate(operator, a, b);
    }
}
