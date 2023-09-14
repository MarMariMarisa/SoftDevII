package unitXX;

public class Circle extends Circular {
    public Circle(String name, int radius){
        super(name,radius);
    }
    @Override
    public double anArea(){
        return (3.14 * (Math.pow(radius, 2)));
    }
    
    @Override
    public boolean equals(Object other){
    if (other instanceof Circle){
        Circle otherShape = (Circle)other;
        return this.name == otherShape.getName() && this.radius == otherShape.getRadius();
    }
    return false;
    }

}

