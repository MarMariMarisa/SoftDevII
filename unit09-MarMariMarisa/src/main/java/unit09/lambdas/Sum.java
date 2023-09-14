package unit09.lambdas;

import java.util.stream.IntStream;

public class Sum {
    public static int sum(int n){
        IntStream stream = IntStream.range(1,n+1);
        stream.forEach((e)->{
            System.out.println(e);
        });
        stream = IntStream.range(1,n+1);
        return stream.sum();
    }

    public static int shiftedSum(int n,int shift){
        IntStream stream = IntStream.range(1,n+1);
        stream.map((value) -> {return value+shift;
        }).forEach((e) -> {System.out.println(e);
        });
        return 0;
    }
@SuppressWarnings("unused")
    public static void main(String[] args){
        int sum = shiftedSum(10,3);
    }
}
