package Task_6_1_4;

public class Division extends AbstractBinaryOperation {

    public Division(Expression firstExpression, Expression secondExpression) {
        super(firstExpression, secondExpression);
    }

    @Override
    public Integer evaluate(Integer variableValue) {
        return (firstExpression.evaluate(variableValue) / secondExpression.evaluate(variableValue));
    }
}
