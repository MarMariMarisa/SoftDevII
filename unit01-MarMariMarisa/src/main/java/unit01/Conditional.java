package unit01;

public class Conditional {
    public static void evenlyDivisible(int n){
        if (n%2 == 0){
            System.out.println("Even");

        }
        else if(n%3 == 0){
            System.out.println("Divisible by 3");
        }
        else if(n%5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divsible by 3 or 5");
        }

    }
    public static void main(String[] args){
        evenlyDivisible(10);
        evenlyDivisible(13);

    }
    
}
