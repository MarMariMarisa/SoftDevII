package unit05.mcf;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    private Object[] elements;
    private int size;
    private int front;
    private int back;

    public ArrayQueue() {
        elements = new Object[2];
        size = 0;
        front = 0; // index at which the first element is located
        back = 0; // index to which the next element will be inserted
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[(front + i) % elements.length];
        }
        front = 0;
        back = size;
        elements = newArray;
    }

    @Override
    public void enqueue(E value) { // at back of the queue, O(n) in worst case, O(C) on average
        if (size == elements.length) {
            resize();
        }

        elements[back] = value;
        back = (back + 1) % elements.length;
        size++;

    }

    @Override
    @SuppressWarnings("unchecked")
    public E dequeue() { // remove the front elt and return it, O(C)
        E toReturn = (E) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return toReturn;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return size + ", " + Arrays.toString(elements);
    }
    @Override
    public Iterator<E> iterator(){
        new Circul
    }

    public static void main(String[] args) {
        Queue<String> queue = new ArrayQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

    }
}