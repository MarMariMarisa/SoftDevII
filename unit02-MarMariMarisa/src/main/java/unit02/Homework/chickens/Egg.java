package unit02.Homework.chickens;

import java.util.Random;

public class Egg {
    private Colors color;
    private Sizes size;
    private int ounces;
    private CrackedStatus status;

    public Egg(Colors color,Sizes size){
        Random rand = new Random();
        this.color = color;
        this.ounces = size.getOunces() + rand.nextInt(3);
        this.status = CrackedStatus.UNCRACKED;
        this.size = size;
    }
    public void crackEgg(){
        this.status = CrackedStatus.CRACKED;
    }
    public CrackedStatus getStatus(){
        return status;
    }
    @Override
    public String toString(){
        return status + " " + size.toString() + " (" + ounces + "oz.) " + color + " egg.";
    }
    @Override
    public boolean equals(Object other){//x.equals(y)}

        if (other instanceof Egg){
            Egg otherEgg = (Egg)other;
            return this.size.equals(otherEgg.size);
        }
        return false;
}
}

