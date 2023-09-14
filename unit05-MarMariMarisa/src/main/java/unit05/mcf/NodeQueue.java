package unit05.mcf;

public class NodeQueue<E> implements Queue<E> {
    private Node<E> front; // dequeue
    private Node<E> back; // enqueue
    private int size;

    public NodeQueue() { // empty queue
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    @Override
    public void enqueue(E value) { // back of the queue, O(C)
        Node<E> newNode = new Node<>(value);
        if (front == null) { // special
            front = newNode;
            back = newNode;
        } else {// general
            back.setNext(newNode);
            back = newNode;
        }
        size++;

    }

    @Override
    public E dequeue() { // front of the queue, O(C)
        E toReturn = front.getValue();
        this.front = this.front.getNext();
        if (front == null) {
            this.back = null;
        }
        this.size--;
        return toReturn;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (front == null) {
            return null;
        }
        return front.toString();
    }

    public static void main(String[] args) {
        Queue<String> queue = new NodeQueue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        System.out.println(queue);
        String string = queue.dequeue();
        System.out.println(string);
        string = queue.dequeue();
        System.out.println(string);
        string = queue.dequeue();
        System.out.println(string);

        for()

    }

}
