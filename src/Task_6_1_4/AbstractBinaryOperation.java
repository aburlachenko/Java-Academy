package Task_6_1_4;

public abstract class AbstractBinaryOperation implements Expression {

    Expression firstExpression;
    Expression secondExpression;

    public AbstractBinaryOperation(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
}
