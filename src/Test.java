import Task_6_1_2.ArrayQueueSingleton;

public class Test {

    public static void main(String args[]) {
        ArrayQueueSingleton queue = ArrayQueueSingleton.getInstance();
        ArrayQueueSingleton queue2 = ArrayQueueSingleton.getInstance();
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue2.push(23);
        System.out.println("Pulled: " + queue.pull());
        queue.print();
        queue2.print();
    }

}
