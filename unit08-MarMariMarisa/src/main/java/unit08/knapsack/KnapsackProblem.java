package unit08.knapsack;

import java.util.Collections;
import java.util.List;

public class KnapsackProblem {
    public static void lightestItemFirst(Knapsack knapsack,List<Item> items){
        Collections.sort(items); // sort items by natural ordering
        //ite,ss have been sorted by  weight lightest first
        while(!items.isEmpty()){
            Item item = items.remove(0);
            knapsack.pack(item);
        }

    }

    public static void valuableItemFirst(Knapsack knapsack, List<Item> items){
        Collections.sort(items, new ValueComparator());

        while(!items.isEmpty()){
            Item item = items.remove(0);
            knapsack.pack(item);
        }
    }

    public static void main(String[] args){
        Knapsack knapsack = new Knapsack(10);
        List<Item> items = ItemSets.electronicsSet();
        lightestItemFirst(knapsack, items);
        System.out.println(knapsack);

        knapsack.empty();
        items = ItemSets.electronicsSet();
        valuableItemFirst(knapsack, items);
        System.out.println(knapsack);


    }
}
