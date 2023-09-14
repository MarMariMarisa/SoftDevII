package unitXX;

public class Rectangle extends NonCircular{
    public Rectangle(String name, int width,int height){
        super(name,width,height);
    }
    @Override
    public double anArea(){
        return (width*height);
    }
    @Override
    public boolean equals(Object other){
        if (other instanceof Rectangle){
            Rectangle otherShape = (Rectangle)other;
            return this.name == otherShape.getName() && this.height == otherShape.getHeight() && this.width == otherShape.getWidth();
        }
        return false;
    }
}
