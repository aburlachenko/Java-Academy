package Task_6_1_2;

import java.util.ArrayList;

public class ArrayQueue {

    private ArrayList<Integer> storage = new ArrayList<Integer>();

    public ArrayQueue push(Integer element) {
        storage.add(element);
        return this;
    }

    public Integer pull() {
        Integer pullElement = storage.get(0);
        storage.remove(0);
        return pullElement;
    }

    public Boolean isEmpty() {
        return storage.size() == 0;
    }

    public Integer getSize() {
        return storage.size();
    }

    public void print() {
        for (int i = 0; i < storage.size(); i++) {
            System.out.print(storage.get(i) + "   ");
        }
    }

}
