// package unit05.mcf;

// public class Misc {
//     public static void main(String[] args) {
//         Container<String> containerS = new Container<>("HHello");
//         containerS.setX("Hi there");
//         containerS.getX(); // Hi there
//         Container<Integer> containerI = new Container<>(123);
//         Container<Double> containerD = new Container<>(123.45);
//         Warehouse<String> warehouse = new Warehouse(containerS);

//         // Autoboxing
//         Integer x = 123; // Integer <-- int
//         // Unboxing
//         int y = Integer.valueOf("123"); // int <--- Integer

//     }
// }

// class Warehouse<T> {
//     private Container<T> container;

//     public Warehouse(Container<T> container) {
//         this.container = container;
//     }

//     public Container<T> getContainer() {
//         return container;
//     }
// }

// class Container<T> { // T - type parameter, only accepts object, reference type
//     private T x;

//     public Container(T x) {
//         this.x = x;
//     }

//     public T getX() {
//         return x;
//     }

//     public void setX(T x) {
//         this.x = x;
//     }
// }

// class ContainerTwo<T, S> {
//     private T x;
//     private S y;

//     public ContainerTwo(T x, S y) {
//         this.x = x;
//         this.y = y;
//     }

//     public S getY() {
//         return y;
//     }

//     public T getX() {
//         return x;
//     }

//     public void setX(T x) {
//         this.x = x;
//     }
// }

