package seminars.first.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод сортировки списка продуктов по возрастанию стоимости
    public List<Product> sortProductsByPrice() {
        // Сортировка продуктов по цене
        Collections.sort(products, Comparator.comparingInt(Product::getCost));
        return products;
    }

    // Метод возврата самого дорогого продукта
    public Product getMostExpensiveProduct() {
        // Поиск продукта с максимальной ценой
        return products.stream()
                .max(Comparator.comparingInt(Product::getCost))
                .orElse(null); // Если список пуст, возвращаем null
    }
}
