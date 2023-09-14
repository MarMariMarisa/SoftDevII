package unit06.practicum;

import java.util.Iterator;

public interface StackInterface<E>{
    public int size();
    public E top();
    public void push(E value);
    public E pop();
    Iterator<E> iterator();
}
