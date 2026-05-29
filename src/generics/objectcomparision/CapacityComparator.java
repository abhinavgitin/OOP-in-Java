package generics.objectcomparision;
import java.util.Comparator;

public class CapacityComparator implements Comparator<Airplane> {

    @Override
    public int compare(Airplane o1, Airplane o2) {
        return Integer.compare(o1.capacity,o2.capacity);
    }
}
