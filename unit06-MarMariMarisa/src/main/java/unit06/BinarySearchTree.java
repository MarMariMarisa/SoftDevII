package unit06;

 public class BinarySearchTree <E extends Comparable<E>>{
    private BinaryNode<E> root;
    private int size;

    public BinarySearchTree(E initialValue){
        this.root = new BinaryNode<>(initialValue);
        this.size = 1;
    }

    @Override
    public String toString(){
        return root.infixTraversal();
    }

    public int getSize() {
        return size;
    }
    private boolean search(BinaryNode<E> node, E target){
        if(node.getValue().equals(target)){
            return true;
        } else if (target.compareTo(node.getValue()) < 0){
            if(node.getLeft() != null){
                return node.getLeft().search(target);
            } else {
                return false;
            }
        } else {
            return node.getRight() != null ? node.getRight().search(target) : false;
        }
    }

    public boolean search(E target){
        return search(root, target);
    }
    private void insert(BinaryNode<E> node, E value){
        if(value.compareTo(node.getValue()) < 0){
            if(node.getLeft() != null){
                insert(node.getLeft(), value);
            } else {
                node.setLeft(new BinaryNode<E>(value));
                size++;
            }
        } else {
            if(node.getRight() != null){
                insert(node.getRight(), value);
            } else {
                node.setRight( new BinaryNode<E>(value));
                size++;
            }
        }
    }
    public void insert(E value){
        insert(root, value);
    }
    public static void main(String[] args) {
        BinarySearchTree<Pokemon> BST = new BinarySearchTree<Pokemon>(new Pokemon("Charizard", 50));
        BST.insert(new Pokemon("Meowth", 18));
        BST.insert(new Pokemon("Bulbasaur", 99));
        Pokemon pikachu = new Pokemon("Pikachu", 12);
        BST.insert(pikachu);
        BST.insert(new Pokemon("Dragonite", 56));
        BST.insert(new Pokemon("Chikorita", 1));
        BST.insert(new Pokemon("TalonFlame", 73));
        BST.insert(new Pokemon("Aipom", 49));

        System.out.println(BST);

        System.out.println("Size = " + BST.getSize());

    }
}