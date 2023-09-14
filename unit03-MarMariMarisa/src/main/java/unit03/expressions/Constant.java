package unit03.expressions;

public class Constant implements Expression {
    private double value;
    public Constant(double value){
        super();
        this.value = value;
    }
    @Override
    public double evaluate(){
        return value;
    }

    public static void main(String[] args){
        Constant constant = new Constant(2);
        double result = constant.evaluate();
        System.out.println(result);

    }

}
