package unit05.mcf;

import java.util.Iterator;

public interface Queue<E> { // E type parameter for elements
    void enqueue(E value); // inserts value to the back of the queue

    E dequeue(); // removes the front value from the queue

    int size();

    @Override
    default Iterator<E> iterator(){
        throw new UnsupportedOperationException();
    }
}
