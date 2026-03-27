package generics;
import java.util.Arrays;

public class CustomGenericsArrayList<T> { // the T here is the type we want for the data structure!
    // this is where we creat an arraylist of our own!
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private Object[] data;

    // default constructor
    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "size=" + size + ", data=" + Arrays.toString(data) + '}';
    }

    static void main() {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();
        list.add(56574);
        System.out.println(list);
        CustomGenericsArrayList<String> list2 = new CustomGenericsArrayList<>();
        list2.add("This is a string");
        System.out.println(list2);
    }

    // to add to the arraylist
    public void add(T num) {
        if (isFull()){
            resize();
        }
        data[size++] = num; // the problem I was facing all in this code was that I was not able to convert
        // the T into the object that was asked for
    }

    // last element is now removed when the remove is called;
    public T remove() {
        return (T)data[--size]; // here the type of the data is already object, and we just need to pass the data type of the T type
        // so we just type cast the object to The type we desire!
    }

    // get the data element!
    public T get(int index) {
        return (T) data[index];
    }

    // to set the value at the given index!
    public void set(T value, int index) {
        data[index] = value;
    }

    // to resize the arraylist if the size is equals to the data.length meaning wr need more space
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp; // the data now points to temp!
    }

    // to know that the data is full? or not full?
    private boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        for ( int i = 0 ; i < size ; i++ ) {
            data[i] = null;
        }
        size = 0;
    }
}