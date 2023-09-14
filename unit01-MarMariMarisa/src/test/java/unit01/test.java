package unit01;
public class test {
    public static void main(String[] args){
        int x = 1;
        while(x < 101){
            if(x % 5 == 0 && x % 7 == 0   ){
                System.out.println("FizzBuzz");
            }else if(x % 5 == 0){
                System.out.println("Fizz");
            }else if(x % 7 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(x);
            }
            x = x + 1;

        }
    }
}
