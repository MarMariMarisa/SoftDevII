package unit01;
import java.util.Scanner;
public class Hello {
    public static void helloYou(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + " YouMr age is " + age);
        scanner.close();

    }
    public static void main(String[] args){
        helloYou();
    }
}
