package unit05.mcf;

import java.util.Iterator;

public class CircularArrayIterator<E> implements Iterator {
    private Object[] elements;
    private int size;
    private int index;
    private int count;

    public CircularArrayIterator(Object[] elements,int size,int front){
        this.elements = elements;
        this.size = size;
        this.count = 0;
    }
    @Override
    @SuppressWarnings("unchecked")
    public E next(){
        E toReturn = (E)elements[index];
        index =  (index+1)%elements.length;
        return toReturn;
    }
    @Override
    public boolean hasNext(){
        return false;
    }
}
