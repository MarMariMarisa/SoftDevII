package unit01;
import java.util.Scanner;
public class InteractiveFib {
    public static int fib(int n){
        int sum1 = 0;
        int sum2 = 1;
        int placeholder;
        for(int i = 0; i < n;i++){
            placeholder = sum1 + sum2;
            sum2 = sum1;
            sum1 = placeholder;
            }
        
        return sum2;
    }
    public static void main(String[] args){
        System.out.print("Please input the number of iterations for the fibonacchi sequence: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fib = fib(n);
        System.out.println("Your answer is: " + fib);
        scanner.close();
    }
}
