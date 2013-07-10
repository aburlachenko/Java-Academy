package Task_6_1_4;

public class Main {

    public static void main(String args[]) {
        Integer result = new Plus(
                new Minus(
                    new Times(
                        new Variable("X"),
                        new Variable("X")
                    ),
                    new Times(
                        new Const(2),
                        new Variable("X")
                    )
                ),
                new Const(1)).evaluate(3);
    }
}
