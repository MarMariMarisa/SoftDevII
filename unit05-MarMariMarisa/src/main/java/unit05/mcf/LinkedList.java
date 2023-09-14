package unit05.mcf;
@SuppressWarnings("unused")
public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public LinkedList(List<E> list){
        for(int i = 0;i < list.size()-1;i++){
            this.append(list.get(i));
        }
        size = list.size();
    }
    public Node<E> getHead(){
        return head;
    }

    @Override
    public void append(E value) {
        if(size == 0){
            head = new Node<E>(value);
            tail = head;
            
        }else{
            Node<E> node = head;
            for(int i = 0;i< size-1;i++){
                node = node.getNext();
            }
            Node<E> x = new Node<E>(value);
            node.setNext(x);
            tail = x;
        }
        size++;
    }

    @Override
    public E get(int index) {
            Node<E> toReturn = head;
            for(int i = 0;i < index;i++){
                toReturn = toReturn.getNext();
                if(toReturn == null){
                    throw new IndexOutOfBoundsException();
                }
            }
            return toReturn.getValue();
    }

    @Override
    public void set(int index, E value) {
        try{
            Node<E> toSet = head;
            for(int i = 0;i < size;i++){
                toSet = toSet.getNext();
                if(toSet == null){
                    throw new IndexOutOfBoundsException();
                }
            }
            toSet.setNode(value);
        }catch(IndexOutOfBoundsException ibe){
            System.out.println("Index invalid");
        }
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public String toString(){
        return head.toString();
    }
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object o){
        try{
           if(o instanceof LinkedList){
            LinkedList<E> other = (LinkedList<E>)o;
            return this.size == other.size() && this.head.getValue() == other.getHead().getValue();
           }
           return false;
        }catch(ClassCastException cce){
            return false;
        }
    }

}