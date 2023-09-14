package unit01.hwAssignments;
import java.util.Scanner;
public class Log {
    public static int log(int base,double n){
        n = (int) n;
        int nearest = 0;
        if(n < 1){
            nearest = -1;
        }else{
            int w = (int) n;
            while( w / base != 0){
                nearest = nearest + 1;
                w = w / base;
            };
        }
        return nearest;
    }
    public static void main(String[] args){
        int base;
        double n;
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        while(isTrue == true){
            System.out.print("Enter your base number: ");
            base = scanner.nextInt();
            if(base < 1){
                System.out.println("Goodbye");
                break;
            }
            System.out.print("Enter your n number: ");
            n = scanner.nextDouble();
            if(n < 1){
                System.out.println("Goodbye");
                break;
            }
            System.out.println("Base of: " + base + "\nn value of: " + n + "\nResult is: " + log(base,n));
        }
        scanner.close();
    }
    
}
