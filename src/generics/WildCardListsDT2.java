package generics;

import java.util.Arrays;

public class WildCardListsDT2<T extends Number> {

    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private Object[] data;

    public WildCardListsDT2() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {

        WildCardListsDT2<Integer> list = new WildCardListsDT2<>();
        list.add(10);
        list.add(20);

        WildCardListsDT2<Double> list2 = new WildCardListsDT2<>();
        list2.add(5.5);
        list2.add(6.5);

        printList(list);   // using ?
        printList(list2);

        System.out.println("Sum: " + sum(list));
        System.out.println("Sum: " + sum(list2));
    }

    // ---------------- CORE METHODS ----------------

    public void add(T num) {
        if (isFull()) resize();
        data[size++] = num;
    }

    public T remove() {
        return (T) data[--size];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(T value, int index) {
        data[index] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    //  WILDCARD METHODS

    // 1. Unbounded wildcard (read-only use)
    public static void printList(WildCardListsDT2<?> list) {
        // here we don't know the type we are using so we do the wildcard operation such that we perform the operation for whatever the objcet is
        // can be an integer a double etc but A NUMBER!
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }
    }

    // 2. Upper bound wildcard (Number family)
    public static double sum(WildCardListsDT2<? extends Number> list) {
        double total = 0;
        for (int i = 0; i < list.size; i++) {
            total += list.get(i).doubleValue();
        }
        return total;
    }
}