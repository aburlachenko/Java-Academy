package Task_6_1_3;

public class Sum {

    public static void main(String args[]) {
        CycLinkedQueue queue = new CycLinkedQueue(2);
        int sum = 0;
        queue.push(1);
        queue.push(3);
        queue.push(5);
        System.out.println("Queue size: " + queue.getSize());
        System.out.println("Queue is empty: " + queue.isEmpty());
        queue.print();
        for (int i = 1, size = queue.size; i <= size; i++) {
            Integer value = queue.pull();
            sum += value;
        }
    }
}
