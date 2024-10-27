package second;

import java.math.BigDecimal;

public class DepositAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount) {
        // logic
        return null;
    }

    // оплата невозможна с депозитного счета
    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        // logic
    }

//    // удалим отсюда этот метод, т.к. мы удалили payment из Account
//    @Override
//    public void payment(String numberAccount, BigDecimal sum) {
//        throw new UnsupportedOperationException("Operator not supported");
//    }

}
