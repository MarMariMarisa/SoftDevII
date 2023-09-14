package unit03.expressions;

public class Increment implements Expression{
    //++5,++
    private Expression operand;
    public Increment(Expression operand){
        this.operand = operand;
    }
    @Override
    public double evaluate(){
        return operand.evaluate() + 1;
    }
    public static void main(String[] args){
        //2+3
        Constant op1 = new Constant(2);
        Constant op2 = new Constant(3);
        Expr_ession addition = new Addition(op1,op2);
        double result = addition.evaluate();
        System.out.println(result);
        //(2+3)*4
        Expression multiplication = new Multiplication(addition,new Constant(4));
        System.out.println(multiplication.evaluate());

        //++((2+3) *4)
        Expression increment = new Increment(multiplication);
        System.out.println(increment.evaluate());
    }
}
