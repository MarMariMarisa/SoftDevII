package unit06.HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Shop {
    
    private static HashMap<Integer,Sushi> display = new HashMap<Integer,Sushi>();
    private static HashSet<Integer> wantedItems = new HashSet<Integer>();
    private static HashSet<Sushi> holder  = new HashSet<Sushi>();
    private static Order order;

    public static void makeDisplay(){ 
        for(int i = 0; i < 25; i ++){
            display.put(i,new Sushi(i));
        }
    }

    public static void customerOrder(){
        Random RNG = new Random();
        int orderSize = RNG.nextInt(3,9);
        while (wantedItems.size() < orderSize) {
            int random = RNG.nextInt(display.size());
            if(display.containsKey(random)){
                wantedItems.add(random);
            } 
        }
        System.out.println("The cashier takes your order: " + wantedItems );
    }

    public static Order cashier(){
        for(int elt : wantedItems ){
            holder.add(new Sushi(elt));
        }
        Order order = new Order(holder);
        System.out.println("The cashier prepares your oder.\nThat will be $" + order.getCost() + "\nHere is your order, please come again!");
        return new Order(holder);
    }

    public static void eatSushi(){
        System.out.println("Back at your apartment, you take our your sushi and eat it\n...");
        for(Sushi sushi : order.getBag()){
            System.out.println("Eating " + sushi + " ... yum!");
        }
    }

    public static void main(String[] args){
        makeDisplay();
        customerOrder();
        order = cashier();
        eatSushi();
    }
}
