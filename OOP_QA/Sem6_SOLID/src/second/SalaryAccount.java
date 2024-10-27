package second;

import java.math.BigDecimal;

// наследник Account - зарплатный счет
// теперь он будет наследоваться от PaymentAccount
public class SalaryAccount extends PaymentAccount{
    @Override
    public BigDecimal balance(String numberAccount) {
        return null;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        // logic;
    }

    @Override
    public void payment(String numberAccount, BigDecimal sum) {
        // logic;
    }
}
