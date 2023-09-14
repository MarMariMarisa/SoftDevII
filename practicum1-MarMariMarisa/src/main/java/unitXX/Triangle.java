package unitXX;

public class Triangle extends NonCircular {
    public Triangle(String name, int width,int height){
        super(name,width,height);
    }
    @Override
    public double anArea(){
        return (0.5 * (width * height));
    }
    @Override
    public boolean equals(Object other){
    if (other instanceof Triangle){
        Triangle otherShape = (Triangle)other;
        return this.name == otherShape.getName() && this.height == otherShape.getHeight() && this.width == otherShape.getWidth();
    }
    return false;
    }
}
