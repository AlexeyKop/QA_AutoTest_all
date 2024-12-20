package seminars.first.Shop;

public class Product {
    private Integer cost;  // Стоимость продукта
    private String title;  // Название продукта

    // Конструктор
    public Product(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры и сеттеры
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
