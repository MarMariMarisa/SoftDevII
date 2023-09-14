package unit05.mcf;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public Node(E value) {
        this(value, null);
    }
    public void setNode(E value){
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String string = this.value + "->" + this.next;

        return string;
    }

    public static void main(String[] args) {
        Node<String> node1 = new Node<>("1"); // tail
        Node<String> node2 = new Node<>("2", node1);
        Node<String> node6 = new Node<>("6", node2);

        Node<String> node5 = new Node<>("5"); // head
        node5.setNext(node6);

        System.out.println(node5);

        String value = node5.getNext().getNext().getValue();
        System.out.println(value);
    }

}
