package unitXX;

public abstract class NonCircular implements Shape {
    protected String name;
    protected int width;
    protected int height;
    public NonCircular(String name, int width,int height){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
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