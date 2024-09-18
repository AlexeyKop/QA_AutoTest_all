import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    Product getProduct(String name);

//    public VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//
//    private List<Product> productList;
//    private Integer money;
//
//    // метод getProduct
//    public Product getProduct(String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;
//    }
//    // метод, который возвращает начальное кол-во продуктов
//    private List<Product> initProduct() {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Молоко", 100));
//        products.add(new Product("Вода", 50));
//        products.add(new Product("Сухарики Кириешки", 30));
//        return products;
//    }

}
