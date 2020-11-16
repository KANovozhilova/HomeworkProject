package ADS.Lesson5.homework.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // айтемы для рюкзака
        List<Item> items = new ArrayList<>();
        items.add(new Item("Котелок", 1, 500));
        items.add(new Item("Книга",   1, 600));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Ноутбук", 2, 40000));

// суммарный вес предметов - 10, для рюкзака ставим меньше, иначе влезет всё

        Backpack backpack = new Backpack(1);
        backpack.calcBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("Суммарная стоимость лучшей комбинации: " + backpack.getBestPrice());
    }

}
