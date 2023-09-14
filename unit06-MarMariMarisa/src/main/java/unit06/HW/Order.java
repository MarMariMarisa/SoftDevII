package unit06.HW;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Order {
    private PriorityQueue<Sushi> bag = new PriorityQueue<Sushi>();
    private int cost;

    public Order(HashSet<Sushi> sushis){
        for(Sushi ele : sushis){
            this.cost+= ele.getPrice();
            bag.add(ele);
        }
    }

    public int getCost(){
        return cost;
    }
    public PriorityQueue<Sushi> getBag(){
        return bag;
    }
}
