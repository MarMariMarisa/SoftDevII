package unit02.swb;
import java.util.Arrays;

public enum DamageType2 {
    HEAVY("Green",200),
    NORMAL("Red",150), //Red
    ION("Blue",50);  //Blue


    private String color;
    private int amount;

    private DamageType2(String color,int amount){
        this.color = color;
        this.amount = amount;
    }
    private String getColor(){
        return color;
    }
    private int getAmount(){
        return amount;
    }
    @Override
    public String toString(){
        return name() + ", " + color + ", " + amount;
    }

    public static void main(String[] args){
        DamageType2 damage1,damage2;
        damage1 = DamageType2.HEAVY;
        damage2 = DamageType2.ION;
        System.out.println(damage1);
        String name1 = damage1.name();
        System.out.println("Damage 1 name is " + name1);
        DamageType2 damage = DamageType2.valueOf("NORMAL");
        System.out.println(damage == DamageType2.NORMAL);
        DamageType2[] damages = DamageType2.values();
        System.out.println(Arrays.toString(damages));
    }
}
