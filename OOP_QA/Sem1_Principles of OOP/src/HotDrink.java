public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);  // вызов конструктора базового класса Product
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + getName() +  // используется метод из родительского класса для получения имени
                ", price=" + getPrice() +  // используется метод из родительского класса для получения цены
                ", temperature=" + temperature +
                '}';
    }
}

