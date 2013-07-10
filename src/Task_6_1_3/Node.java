package Task_6_1_3;

public class Node {

    public Integer value;
    public Node nextElement;
    public Node prevElement;

    public Node(Integer value, Node prevElement) {
        this.value = value;
        this.prevElement = prevElement;
    }
}
