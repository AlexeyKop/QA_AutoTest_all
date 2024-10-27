package fourth;

import java.math.BigDecimal;

public interface Payment {
    // добавляем метод по транзакциям, который будет принимать в себя сумму
    void doTransaction(BigDecimal amount);
}
