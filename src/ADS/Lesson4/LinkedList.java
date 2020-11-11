package ADS.Lesson4;

public interface LinkedList<E> extends Iterable<E> {

    /**
     * add element to the beginning of list
     * @param value
     */
    void insertFirst(E value);

    /**
     * @return remove element from the beginning of list
     */
    E removeFirst();

    /**
     * @param value
     * @return
     */
    boolean remove(E value);

    /**
     * @param value
     * @return
     */
    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    Node<E> getFirstElement();

    class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
