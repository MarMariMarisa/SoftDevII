package unit01;
public class HelloWorld {
    public static void main(String[] args){
        //System.out.println("Hello, World");
        helloName("John", "Smith");
        double z = add(2.5,3);
        System.out.println(z);

    }
    public static void helloName(String first,String last){
        System.out.println("Hello " + first + " " + last + "!");
    }

    public static double add(double x, int y){
        return x + y;
    }

}
