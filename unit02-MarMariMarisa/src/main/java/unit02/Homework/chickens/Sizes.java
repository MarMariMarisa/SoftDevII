package unit02.Homework.chickens;

public enum Sizes {
    PEEWEE(15),
    SMALL(18),
    MEDIUM(21),
    LARGE(24),
    EXTRA_LARGE(27),
    JUMBO(30);
    
    private int ounces;

    private Sizes(int ounces){
        this.ounces = ounces;
    }

    public int getOunces(){
        return ounces;
    }
    @Override
    public String toString(){
        return name();
    }
}
