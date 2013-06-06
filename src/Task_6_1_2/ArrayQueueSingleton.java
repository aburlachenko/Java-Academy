package Task_6_1_2;

final public class ArrayQueueSingleton extends ArrayQueue {

    static ArrayQueueSingleton instance;

    private ArrayQueueSingleton() {}

    public static ArrayQueueSingleton getInstance() {
        if (instance == null) {
            instance = new ArrayQueueSingleton();
        }
        return instance;
    }
}
