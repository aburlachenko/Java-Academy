package Task_6_1_4;

public class Const implements Expression {

    private Integer constant;

    public Const(Integer constant) {
        this.constant = constant;
    }

    @Override
    public Integer evaluate(Integer variableValue) {
        return constant;
    }
}
