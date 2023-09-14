package unitXX;

public class Sphere extends Circular {
    public Sphere(String name,int radius){
        super(name,radius);
    }
    @Override
    public double anArea(){
        return (4* 3.14 * (Math.pow(radius, 2)));
    }
    @Override
    public boolean equals(Object other){
    if (other instanceof Sphere){
        Sphere otherShape = (Sphere)other;
        return this.name == otherShape.getName() && this.radius == otherShape.getRadius();
    }
    return false;
    }

}
