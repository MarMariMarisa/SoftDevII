package unit01;

public class CountUp {
    public static int countWhile(int n){
        int sum = 0;
        int i = 0;
        while(i <= n){
            System.out.println("i = " + i);
            sum += 1;
            i += 1;

        }
        return sum;
    }
    public static int countFor(int n){
        int sum = 0;
        for(int i = 0;i <= n;i++){
            System.out.println("i = " + i);
            sum += 1;
        }
        return sum;
    }
    public static void main(String[] args){
        //CountUp.countWhile(10);
        countWhile(10);
        countFor(10);
    }
}
