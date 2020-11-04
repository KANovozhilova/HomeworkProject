package ADS.Lesson3.deque;

import ADS.Lesson3.myQueue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}