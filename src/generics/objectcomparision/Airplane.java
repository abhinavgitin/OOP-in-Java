package generics.objectcomparision;

public class Airplane implements Comparable<Airplane> {
    int speed;
    int capacity;

    public Airplane(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Airplane o) {
        // return ( (int)(this.capacity - o.capacity) >= 0 )? ( (int)(this.capacity - o.capacity) > 0 )? 1 : 0 : -1;
        // or just do
        return Integer.compare(this.capacity,o.capacity);
    }
}
