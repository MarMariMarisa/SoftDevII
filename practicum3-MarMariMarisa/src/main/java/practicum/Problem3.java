package practicum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

    public interface Testable {
        boolean test(int elt);
    }

    public static List<Integer> myfilter(List<Integer> unfilteredList, Testable testable) {
        List<Integer> filteredList = new ArrayList<>();
        for (int e : unfilteredList) {
            if (testable.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        // Problem 2-1
        // myfilter(list, new Example()) returns [7,9,-2,8,0,-3,5]

        // Problem 2-2 - use anonymous class expression in place of null:

        Testable isPositive = (new Testable(){
            @Override
            public boolean test(int elt){
                return elt>0;
            }
        });

        // Problem 2-3 - use a lambda expression in place of null:

        Testable isEven = ((e) -> {return e%2 == 0;});

        List<Integer> list = Arrays.asList(7, -15, 9, -2, 8, 0, -3, 20, -12, 5);

        List<Integer> positiveList = myfilter(list, isPositive);
        List<Integer> evenList = myfilter(list, isEven);
        System.out.println(positiveList); // [7, 9, 8, 20, 5]
        System.out.println(evenList); // [-2, 8, 0, 20, -12]
    }

}
