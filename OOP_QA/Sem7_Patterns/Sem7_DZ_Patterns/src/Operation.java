// Интерфейс для операций с комплексными числами, применение паттерна Strategy
public interface Operation {
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
}
