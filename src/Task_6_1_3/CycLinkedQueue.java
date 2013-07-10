package Task_6_1_3;

public class CycLinkedQueue extends LinkedQueue {

    private Integer maxSize;

    public CycLinkedQueue(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public void push(Integer element) {
        super.push(element);
        if (size > maxSize) {
            pull();
        }
    }
}
