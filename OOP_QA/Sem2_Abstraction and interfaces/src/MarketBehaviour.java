import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); // добавление посетителя в магазин
    void releaseFromMarket(List<Actor> actorList); // метод по выходу из магазина
    void update(); // обновление магазина
}
