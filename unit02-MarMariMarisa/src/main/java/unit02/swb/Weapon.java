package unit02.swb;

public class Weapon {
    //fields
    public static final int MAX_DAMAGE_AMOUNT = 1000;
    private String name;
    private DamageType damageType;
    private int damageAmount;
    //methods
    public Weapon(String name, DamageType damageType,int damageAmount){
        this.name = name;
        this.damageType = damageType;
        this.damageAmount = damageAmount;
        if(damageAmount > 1000){
            this.damageAmount = MAX_DAMAGE_AMOUNT
        }
    }
    public String getName(){
        return name;
    }
    public Damaged@Override
    public String toString(){
        return name();
    }Type getDamageType(){
        return damageType;
    }
    public int getDamageAmount(){
        return damageAmount;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return DamageType.getColor()
    }

    public static void main(String[] args){
        Weapon weapon = new Weapon("Cannon",10,50);
        System.out.println(weapon.getName());
        System.out.println(weapon.getDamageType());
        System.out.println(weapon.getDamageAmount());

    }

}  

