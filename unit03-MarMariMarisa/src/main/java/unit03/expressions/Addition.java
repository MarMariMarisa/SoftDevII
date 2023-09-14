package unit03.expressions;

public class Addition implements Expression {
    private Expression op1;
    private Expression op2;
    public Addition(Expression op1,Expression op2){
        super();
        this.op1 = op1;
        this.op2 = op2;
    }
    @Override
    public double evaluate(){
        return op1.evaluate() + op2.evaluate();
    }

    public static void main(String[] args){
        Constant op1 = new Constant(2);
        Constant op2 = new Constant(3);
        Expression addition = new Addition(op1,op2);
        double result = addition.evaluate();
        System.out.println(result);

        Expression addition2 = new Addition(addition,new Constant(4));
        result = addition2.evaluate();
        System.out.println(result);


    }
}
