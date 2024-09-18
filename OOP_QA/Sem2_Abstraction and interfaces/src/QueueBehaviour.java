public interface QueueBehaviour {
    void takeInQueue(Actor actor); // метод забарать из очереди
    void takeOrders(); //метод забрать заказы
    void giveOrder(); // метод отдать заказ
    void releaseFromQueue(); // метод выйти из очереди

}
