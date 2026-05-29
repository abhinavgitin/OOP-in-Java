package generics.objectcomparision;
import java.util.Comparator;

public class SpeedComparator implements Comparator<Airplane> {

    @Override
    public int compare(Airplane o1, Airplane o2) {
        return Integer.compare(o1.speed,o2.speed);
    }
}
