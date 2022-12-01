package expression;

public class Divide extends BinaryOperation {
    public Divide(GigachadExpression e1, GigachadExpression e2) {
        super(e1, e2);
    }

    public String getSign() {
        return "/";
    }

    @Override
    public int evaluate(int x) {
        return getLeftOperand().evaluate(x) / getRightOperand().evaluate(x);
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return getLeftOperand().evaluate(x, y, z) / getRightOperand().evaluate(x, y, z) ;
    }
}