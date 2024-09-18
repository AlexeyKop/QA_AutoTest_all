import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> productList;
    private int money;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;  // инициализация списка продуктов в автомате
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {  // перебор продуктов в списке
            if (product.getName().equals(name)) {  // проверка соответствия имени продукта
                money += product.getPrice();  // добавление стоимости продукта к общим деньгам
                return product;  // возврат найденного продукта
            }
        }
        return null;  // возврат null, если продукт не найден
    }

    // Перегруженный метод, который выдает продукт по имени, объему и температуре
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {  // перебор продуктов в списке
            if (product instanceof HotDrink) {  // проверка, является ли продукт горячим напитком
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature) {  // проверка соответствия имени и температуры
                    return hotDrink;  // возврат найденного продукта
                }
            }
        }
        return null;  // возврат null, если продукт не найден
    }
}
