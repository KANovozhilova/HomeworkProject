package ADS.Lesson5.homework.Task2;

import java.util.Objects;

public class Item {
    private final String name;
    private final int weight;
    private final int price;

    public Item(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (weight != item.weight) return false;
        if (price != item.price) return false;
        return Objects.equals(name, item.name);
    }

// про число 31 в хэшкоде вычитала на стэке, как и про сам пример реализации
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Item {" +
                "название = '" + name + '\'' +
                ", вес = " + weight +
                ", цена = " + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
