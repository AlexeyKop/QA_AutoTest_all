package seminars.first.Shop;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public static void main(String[] args) {
        // Тесты для проверки работы магазина

        // Создание продуктов с использованием конструктора
        Product product1 = new Product(100, "Product 1");
        Product product2 = new Product(200, "Product 2");
        Product product3 = new Product(150, "Product 3");

        // Добавление продуктов в список магазина
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        // Создание экземпляра магазина и добавление продуктов
        Shop shop = new Shop();
        shop.setProducts(products);

        // 1. Проверка правильности хранения продуктов
        Assertions.assertThat(shop.getProducts()).hasSize(3);  // Ожидается 3 продукта
        Assertions.assertThat(shop.getProducts()).contains(product1, product2, product3);

        // 2. Тест метода sortProductsByPrice
        List<Product> sortedProducts = shop.sortProductsByPrice();
        Assertions.assertThat(sortedProducts.get(0).getTitle()).isEqualTo("Product 1"); // Первый продукт по цене
        Assertions.assertThat(sortedProducts.get(1).getTitle()).isEqualTo("Product 3"); // Второй продукт по цене
        Assertions.assertThat(sortedProducts.get(2).getTitle()).isEqualTo("Product 2"); // Третий продукт по цене

        // 3. Тест метода getMostExpensiveProduct
        Product mostExpensive = shop.getMostExpensiveProduct();
        Assertions.assertThat(mostExpensive).isNotNull();
        Assertions.assertThat(mostExpensive.getTitle()).isEqualTo("Product 2");  // Самый дорогой продукт - Product 2
    }
}
