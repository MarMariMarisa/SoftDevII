package unit03.expressions;

public class Multiplication implements Expression {
    private Expression op1;
    private Expression op2;
    public Multiplication(Expression op1,Expression op2){
        super();
        this.op1 = op1;
        this.op2 = op2;
    }
    @Override
    public double evaluate(){
        return op1.evaluate() * op2.evaluate();
    }

    public static void main(String[] args){
        //2+3
        Constant op1 = new Constant(2);
        Constant op2 = new Constant(3);
        Expression addition = new Addition(op1,op2);
        double result = addition.evaluate();
        System.out.println(result);
        //(2+3)*4
        Expression multiplication = new Multiplication(addition,new Constant(4));
        System.out.println(multiplication.evaluate());
    }
}
