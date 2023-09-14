package unit09.series;

import java.util.stream.Stream;

public class Series {
    public static Stream<Double> streamDoubles(int length){
        Stream.Builder <Double> builder = Stream.builder ();
        for (Double i = 1.0; i <= length; i++) {
            builder.add(i);
        }
        return builder.build (); // {1, 2, …, length}    
    }
    private static double product;
    public static Double factForEach(int num){ 
        product = 1;
        Stream<Double> series = streamDoubles(num);
        series.forEach((e) -> {
            product = product*e;
        });
        series = streamDoubles(num);
        return product;
    }

    public static int factReduce(int num){
        Stream<Double> series =  streamDoubles(num);
        double result = series.reduce((x,y) -> {return 
         x*y;} ).get();
         
        return (int) result;
     
    }
    public static Double piGregoryLeibniz(int num){
        Stream<Double> series =  streamDoubles(num);
        Double result = series.mapToDouble((n)->{
            if(n%2 == 0){
                return 1.0/(2*n+1);
             } else{
                return -1.0/(2*n+1);
             }
        }).sum();
        return (result + 1 ) * 4;
    }
    private static double a;
    private static double b;
    private static double c;

    private static double d;
    private static double e;
    private static double f; 
    public static Double piNilikantha(int num){
        Stream<Double> series =  streamDoubles(num);
        a = 2.0;
        b  = 3.0;
        c = 4.0; 

        d = 2.0;
        e  = 3.0;
        f = 4.0; 
        Double result = series.mapToDouble((n)->{
            if(n%2 == 0){
                d = a;
                e = b;
                f = c;
                a+=2;
                b+=2;
                c+=2;
                return 4.0/(d*e*f);
             } else{
                d = a;
                e = b;
                f = c;
                a+=2;
                b+=2;
                c+=2;
                return -4.0/(d*e*f);
             }
        }).sum();
        return result + 3;
    }
    public static void main(String[] args){
        Stream<Double> stream= streamDoubles(10);
        stream.forEach((e)->{
            System.out.println(e);
        });

        double tenFact = factForEach(10);
        System.out.println(tenFact  + "\n");

        double fiveFact = factForEach(5);
        System.out.println(fiveFact+"\n");

        int reduction = factReduce(5);
        System.out.println(reduction);

        double p = piGregoryLeibniz(100000);
        System.out.println(p);

        double l = piNilikantha(1000000);
        System.out.println(l);
    }


    
}
