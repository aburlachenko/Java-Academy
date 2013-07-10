package Task_6_1_4;

public class Variable implements Expression {

    private String varName;

    public Variable(String varName) {
        this.varName = varName;
    }

    @Override
    public Integer evaluate(Integer variableValue) {
        return variableValue;
    }
}
