package ADS.Lesson2;

public class ArraySorts {
//    private static final int ARRAY_CAPACITY = 10000;    оставлено для теста
    private static final int ARRAY_CAPACITY = 1000000;

    public static void main(String[] args) {

        ArrayImpl<Integer> arrayBubble = new ArrayImpl<>(ARRAY_CAPACITY);
        ArrayImpl<Integer> arraySelect = new ArrayImpl<>(ARRAY_CAPACITY);
        ArrayImpl<Integer> arrayInsert = new ArrayImpl<>(ARRAY_CAPACITY);

        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            arrayBubble.insert((int) (Math.random() * ARRAY_CAPACITY + 1), i);
            arrayInsert.insert(arrayBubble.get(i), i);
            arraySelect.insert(arrayBubble.get(i), i);
        }

        System.out.println("Пузырьковая сортировка.");
        long startTime = System.currentTimeMillis();
        arrayBubble.sortBubble();
        long endTime = System.currentTimeMillis();
        long bubbleSortTime = endTime - startTime;

        System.out.println("Сортировка выбором.");
        startTime = System.currentTimeMillis();
        arraySelect.sortSelect();
        endTime = System.currentTimeMillis();
        long selectSortTime = endTime - startTime;

        System.out.println("Сортировка вставкой.");
        startTime = System.currentTimeMillis();
        arrayInsert.sortInsert();
        endTime = System.currentTimeMillis();
        long insertSortTime = endTime - startTime;

        System.out.println("Готово! Время выполнения сортировок: ");
        System.out.println("Пузырьковая: " + bubbleSortTime + "ms.");
        System.out.println("Выбором: " + selectSortTime + "ms.");
        System.out.println("Вставкой: " + insertSortTime + "ms.");
    }
}
