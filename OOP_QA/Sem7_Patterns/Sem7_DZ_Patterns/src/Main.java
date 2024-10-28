public class Main {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        CalculatorView view = new CalculatorView();

        ComplexNumber num1 = new ComplexNumber(3, 2);                // Комплексное число 3 + 2i
        ComplexNumber num2 = new ComplexNumber(1, 7);                // Комплексное число 1 + 7i

        // Выполнение операций и вывод на консоль
        ComplexNumber sum = controller.performOperation("+", num1, num2);
        view.displayResult(sum);

        ComplexNumber product = controller.performOperation("*", num1, num2);
        view.displayResult(product);

        ComplexNumber quotient = controller.performOperation("/", num1, num2);
        view.displayResult(quotient);
    }
}
