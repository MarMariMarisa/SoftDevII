package unit05.mcf;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private Object[] elements;
    private int size;
    private int index;

    public ArrayIterator(Object[] elements,int size){
        this.elements = elements;
        this.size = size;
    }
    @Override
    @SuppressWarnings("unchecked")
    public E next(){
        E toReturn = (E)elements[index];
        index++;
        return toReturn;
    }
    @Override
    public boolean hasNext(){
        return index < size;
    }
}
