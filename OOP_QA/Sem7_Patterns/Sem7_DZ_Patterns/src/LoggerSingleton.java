import java.util.logging.Logger;

// Класс LoggerSingleton - Singleton для логирования
public class LoggerSingleton {
    private static Logger logger = Logger.getLogger("ComplexCalculator"); // Единственный экземпляр Logger

    // Приватный конструктор для предотвращения создания нового экземпляра
    private LoggerSingleton() {}


    public static Logger getInstance() {
        return logger;
    }
}
