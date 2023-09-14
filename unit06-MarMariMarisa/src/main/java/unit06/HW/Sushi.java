package unit06.HW;

import java.util.Random;

public class Sushi implements Comparable<Sushi> {
    private int number;
    private int weight;
    private int price;
    private Random rand = new Random();
    public Sushi(int number){
        this.number = number;
        this.price = rand.nextInt(10,41);
        this.weight = rand.nextInt(20,101);
    }

    public int getNumber(){
        return number;
    }
    public int getWeight(){
        return weight;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Sushi{Number: " + number + ", Weight: " + weight + "g, Price: $" + price + "}";
    }
    @Override
    public int compareTo(Sushi other) {
        return this.weight - other.getWeight();
    }

}
