package Task_6_1_3;

public class LinkedQueue implements Queue {

    Node head;
    Node tail;
    Integer size = 0;

    @Override
    public void push(Integer element) {
        size++;
        Node node = new Node(element, tail);
        if (tail != null) {
            tail.nextElement = node;
        }
        tail = node;
        if (size == 1) {
            head = node;
        }
    }

    @Override
    public Integer pull() {
        int value = head.value;
        head = head.nextElement;
        if (head != null) {
            head.prevElement = null;
        }

        size--;
        if (size == 0) {
            tail = null;
        }
        return value;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.print("Queue from head to tail: ");
        Node element = head;
        for (int i = 0; i < size; i++) {
            System.out.print(element.value + "; ");
            element = element.nextElement;
        }
    }

}
