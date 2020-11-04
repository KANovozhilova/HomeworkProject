package ADS.Lesson3.deque;

public class HM3_Main_Class {
    public static void main(String[] args) {

          // Task 2. Создать программу, которая переворачивает вводимые строки (читает справа налево).

//        String str = "abcd";
//
//        System.out.println(new StringBuilder(str).reverse());
//
//        Stack<Character> st = new StackImpl<>(str.length());
//        for (int i = 0; i < str.length(); i++) {
//            st.push(str.charAt(i));
//        }
//
//        while ( !st.isEmpty() ) {
//            System.out.print(st.pop());
//        }
//        System.out.println();
//
//        if (true) {
//            return;
//        }


        // TASK 3. Создать класс для реализации дека.

        Deque<Integer> deq = new DequeImpl<>(6);

        insertRight(deq, 1);
        insertRight(deq, 2);
        insertRight(deq, 3);
        insertRight(deq, 4);
        insertLeft(deq, 5);
        insertLeft(deq, 6);

        removeLeft(deq);
        removeRight(deq);

        displayLeftToRight(deq); // Queue
//        displayRightToLeft(deq); //Stack
    }

    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
