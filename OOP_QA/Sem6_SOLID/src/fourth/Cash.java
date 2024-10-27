package fourth;

import java.math.BigDecimal;

public class Cash implements Payment{
    @Override
    public void doTransaction(BigDecimal amount) {
        // logic
    }
//    // уберем отсюда старый метод и будем имплементироваться от Payment
//    public void doTransaction(BigDecimal amount){
//        // logic

}
