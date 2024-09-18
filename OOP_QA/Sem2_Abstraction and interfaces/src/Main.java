import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
    Необходимо реализовать:
     1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
     2. Абстрактный класс Actor, который хранит в себе параметры актора,
     включая состояние готовности сделать заказ и факт получения заказа.
     Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих “персональных данных” abstract
     3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

     Задание 2
     Необходимо реализовать строение классов, без конкретной реализации:
     1.Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
     принятие/отдача заказа
     2.Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
     3.Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
     список людей в очереди в различных статусах
 */
    public static void main(String[] args) {
        // Создаем несколько покупателей (людей)
        Human customer1 = new Human("Иван");
        Human customer2 = new Human("Мария");
        Human customer3 = new Human("Алексей");

        // Создаем магазин
        Market market = new Market();

        // Принимаем покупателей в магазин
        market.acceptToMarket(customer1);
        market.acceptToMarket(customer2);
        market.acceptToMarket(customer3);

        // Обновляем состояние магазина (принимаем заказы, выдаем заказы и освобождаем из очереди)
        market.update();

        // Симулируем выход покупателей из магазина
        List<Actor> actorsLeaving = new ArrayList<>();
        actorsLeaving.add(customer1);
        actorsLeaving.add(customer2);
        market.releaseFromMarket(actorsLeaving);

        // Обновляем состояние магазина после того, как часть покупателей ушла
        market.update();
    }
}

