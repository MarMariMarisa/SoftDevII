package unit06.practicum;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<E> extends ArrayIterator<E> implements StackInterface<E>, Iterable<E>{
    private Object[] elements;
    private int size = 0;;
    
    public ArrayStack(){ // not sure why this bug is here :/ 
        this.elements = new Object[2];
        this.size = 0;
    }

    @Override
    public String toString(){
        String a = "[";
        for(int i = 0;i < elements.length;i++){
            if(i == elements.length-2){
                a += elements[i] + "]";
            }else{
                a+= elements[i] + ", ";
            }
        }
        return a;
    }
    @Override
    public int size(){
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E top(){
        return (E)elements[elements.length-1];
    }
    @Override
    public void push(E value){
        if (size == elements.length) {
            elements = Arrays.copyOf(elements,2*elements.length);
        }
        elements[size] = value;
        size++;
    }
    public ArrayIterator<E> iterator(){
        return new ArrayIterator<E>(elements,size);
    }
    @Override
    @SuppressWarnings("unchecked")
    public E pop(){
        if(size > 0){
        size--;
        E holder = (E)elements[size];
        elements[size] = null;
        return holder;
        }
        return null;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args){
        ArrayStack<String> stackOne = new ArrayStack<>();
        stackOne.push("A");
        stackOne.push("B");
        stackOne.push("C");
        System.out.println(stackOne.toString());
        String c = stackOne.pop();
        System.out.println(stackOne.toString());
        String b = stackOne.top();
        System.out.println(b);
        for(String i : stackOne){
            System.out.println(i);
        }
    }

}
