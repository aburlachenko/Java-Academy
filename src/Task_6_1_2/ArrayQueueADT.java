package Task_6_1_2;

import java.util.ArrayList;

public class ArrayQueueADT {

    private ArrayList<Integer> storage = new ArrayList<Integer>();

    public void push(ArrayQueueADT instance, Integer element) {
        instance.storage.add(element);
    }

    public static Integer pull(ArrayQueueADT instance) {
        Integer pullElement = instance.storage.get(0);
        instance.storage.remove(0);
        return pullElement;
    }

    public static Boolean isEmpty(ArrayQueueADT instance) {
        return instance.storage.size() == 0;
    }

    public static Integer getSize(ArrayQueueADT instance) {
        return instance.storage.size();
    }

    public static void print(ArrayQueueADT instance) {
        for (int i = 0; i < instance.storage.size(); i++) {
            System.out.print(instance.storage.get(i) + "   ");
        }
    }

}
