// Класс деления комплексных чисел, реализует интерфейс Operation
public class Division implements Operation {
    // Метод execute выполняет деление двух комплексных чисел
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2); // Знаменатель
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}
