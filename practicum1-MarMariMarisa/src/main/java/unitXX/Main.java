package unitXX;

public class Main {
    public static void main(String[] args){
        Triangle triangle = new Triangle("Triangle",5,5);
        Circle circle = new Circle("Cricle",5);
        Rectangle rectangle = new Rectangle("Rectangle",5,5);
        Sphere sphere = new Sphere("Sphere",5);
        Shape[] shapesArray = {triangle,circle,rectangle,sphere};
        double sum = 0.0;
        for(int i = 0;i<shapesArray.length;i++){
            System.out.println(shapesArray[i]);
            sum += shapesArray[i].anArea();

        }
        System.out.println("The sum of all the elements is: " + sum);
    }
}
