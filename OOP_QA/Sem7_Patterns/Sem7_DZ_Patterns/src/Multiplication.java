// Класс умножения комплексных чисел, реализует интерфейс Operation
public class Multiplication implements Operation {
    // Метод execute выполняет умножение двух комплексных чисел
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(); //умножения действительных частей
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal(); //умножения мнимых частей
        return new ComplexNumber(real, imaginary);
    }
}
