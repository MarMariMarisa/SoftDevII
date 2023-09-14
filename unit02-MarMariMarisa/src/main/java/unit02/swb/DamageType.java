package unit02.swb;

public enum DamageType {
    HEAVY("Green"),
    NORMAL("Red"), //Red
    ION("Blue");  //Blue

    private String color;

    private DamageType(String color){
        this.color = color;
    }
    private DamageType getColor(){
        return color;
    }
}
