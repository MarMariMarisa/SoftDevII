package unit01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculon {
    
    public static float add(float x,float y){
        return x+y;
    }
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a float number: ");
            float first = scanner.nextFloat();
            System.out.print("Please enter a float number: ");
            float second = scanner.nextFloat();
            scanner.close();
            float sum = add(first,second);
            System.out.println("sum = " + sum);
        }
        catch(InputMismatchException ime){
            System.out.println("Error occured!,Check your input! Goodbye");
        }

        
    }
    public static float divide(float x,float y){
        return x/y;
    }
    public static float raise(float base,int exponent){
        return (float) Math.pow(base,exponent);
        /* 
        float product = 1;
        for(int i=0;i < exponent;i++){
            product *= base;
        }
        return product;
        */
    }; 
    @SuppressWarnings("unused")
    public static void mai(String[] args){
        float sum = add(1.2F,3.4F);
        float product = raise(1.2F,5);
        //System.out.println("product = " + product + "\nsum = " + sum);
        sum  = add(2,10);
        System.out.println("Your sum is: " + sum);
    }
}
