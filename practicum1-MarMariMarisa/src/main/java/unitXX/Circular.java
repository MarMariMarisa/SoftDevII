package unitXX;

public abstract class Circular implements Shape {
    protected String name;
    protected int radius;
    public Circular(String name, int radius){
        this.radius = radius;
        this.name = name;
    }
    public int getRadius(){
        return radius;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name + ": " + anArea();
    }
    public abstract double anArea();
}


