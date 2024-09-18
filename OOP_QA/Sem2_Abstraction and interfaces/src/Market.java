import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> queue = new ArrayList<>();  // Очередь покупателей в магазине

    // Метод добавляет покупателя в магазин (принимает его)
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел в магазин.");
        takeInQueue(actor);  // Когда покупатель заходит в магазин, его сразу ставят в очередь
    }

    // Метод удаляет покупателей из магазина (когда они выходят)
    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + " покидает магазин.");
            queue.remove(actor);  // Удаляем покупателя из очереди, если он выходит из магазина
        }
    }

    // Метод обновляет состояние магазина (выполнение различных действий: принять заказы, выдать заказы)
    @Override
    public void update() {
        takeOrders();  // Принять заказы от покупателей в очереди
        giveOrder();   // Отдать заказы покупателям
        releaseFromQueue();  // Освобождаем покупателей из очереди после получения заказа
    }

    // Метод добавляет покупателя в очередь магазина
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь.");
        queue.add(actor);  // Добавляем покупателя в очередь
    }

    // Метод имитирует прием заказов от покупателей в очереди
    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {  // Проверяем, сделал ли покупатель заказ
                actor.setMakeOrder(true);  // Покупатель делает заказ
                System.out.println(actor.getName() + " сделал заказ.");
            }
        }
    }

    // Метод имитирует выдачу заказов покупателям
    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOsder()) {  // Проверяем, сделал ли заказ и не получил ли его
                actor.setTakeOrder(true);  // Покупатель получает заказ
                System.out.println(actor.getName() + " получил свой заказ.");
            }
        }
    }

    // Метод освобождает покупателей из очереди после получения заказа
    @Override
    public void releaseFromQueue() {
        List<Actor> actorsToRemove = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOsder()) {  // Проверяем, получил ли покупатель заказ
                actorsToRemove.add(actor);  // Добавляем в список на удаление
                System.out.println(actor.getName() + " вышел из очереди.");
            }
        }
        queue.removeAll(actorsToRemove);  // Удаляем из очереди всех, кто получил заказы
    }
}
