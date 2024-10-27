package fourth;

import java.math.BigDecimal;

public class Shop {
//    // вместо Cash вставим интерфейс Payment
//    // маг-н принимает оплату только Cash
//    private Cash cash;
//    public Shop(Cash cash){
//        this.cash = cash;
//    }

    private Payment payment;

    public Shop(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(Object order, BigDecimal amount){
        payment.doTransaction(amount);
    }
}
