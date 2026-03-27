package generics;

import java.util.Arrays;
import static java.sql.Types.NULL;

public class CustomArrayList {
    // this is where we creat an arraylist of our own!
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private int[] data;

    // default constructor
    public CustomArrayList() {
        super();
        this.data = new int[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "size=" + size + ", data=" + Arrays.toString(data) + '}';
    }

    static void main() {

        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 10 ; i++) {
            list.add(2 * i);
        }

        System.out.println(list); // this will just print some hashcode so we need to override the toString such that the data gets printed!
        list.clear();
        System.out.println(list);

        // so what is generics ???
        // ArrayList<String> list2 = new ArrayList<>();
        // this is  ^^^ called generics tell the parameterized type of what the object is going to be about!!!
    }

    // to add to the arraylist
    public void add(int num) {
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    // last element is now removed when the remove is called;
    public int remove() {
        return data[--size];
    }

    // get the data element!
    public int get(int index) {
        return data[index];
    }

    // to set the value at the given index!
    public void set(int value, int index) {
        data[index] = value;
    }

    // to resize the arraylist if the size is equals to the data.length meaning wr need more space
    private void resize() {
        int[] temp = new int[data.length * 2];
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
            data[i] = NULL;
        }
        size = 0;
    }
}