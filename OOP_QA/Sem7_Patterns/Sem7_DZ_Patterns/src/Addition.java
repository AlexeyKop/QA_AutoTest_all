// Класс сложения комплексных чисел, реализует интерфейс Operation
public class Addition implements Operation {
    // Метод execute выполняет сложение двух комплексных чисел
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}
