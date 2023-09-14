package unit05.mcf;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[2];

        size = 0; // index to which the next elt is appended
    }
    public ArrayList(List<E> list) {
        elements = new Object[2];
        for(int i = 0;i < list.size();i++){
            this.append(list.get(i));
        }
        size = list.size(); // index to which the next elt is appended
    }

    @Override
    public void append(E value) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements,2*elements.length);
        }
        elements[size] = value;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public void set(int index, E value) {
        elements[index] = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return size + ", " + Arrays.toString(elements);
    }
    public Object[] getAll(){
        return elements;
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o){
        try{
           ArrayList<E> other = (ArrayList<E>)o;
           return this.size == other.size() && this.elements.equals( other.getAll());
        }catch(ClassCastException cce){
            return false;
        }
    }

    @Override
    public void iterator(){

    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.append(10);
        list.append(20);
        System.out.println(list);
        list.append(30);
        System.out.println(list);
        list.set(0, 100);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
