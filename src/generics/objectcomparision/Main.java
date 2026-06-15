package generics.objectcomparision;

import java.util.Comparator;

public class Main {
    static void main() {
        Airplane airbus = new Airplane(900, 2000);
        Airplane fighterJet = new Airplane(1800, 2);

        if (airbus.compareTo(fighterJet) > 0 ) {
            System.out.println("The airbus capacity if more");
        } else if ( airbus.compareTo(fighterJet) < 0 ) {
            System.out.println("The fighter JET capacity is more");
        } else {
            System.out.println("Bout has the same capacity");
        }

        // The above shows how we make a specific compareTo method for the specific data
        // here Using the comparator generics I can pass the type of data that I want to compare directly and compare them

        Airplane militaryAirlines = new Airplane(800, 500);
        Airplane commercialPlane = new Airplane(500, 800);
        // new planes made, and now we make the generics' comparator :
        Comparator<Airplane> speed = new SpeedComparator();
        Comparator<Airplane> capacity = new CapacityComparator();


        int resultSpeed = speed.compare(militaryAirlines, commercialPlane);

        if (resultSpeed > 0) {
            System.out.println("Military airplane is faster");
        } else if (resultSpeed < 0) {
            System.out.println("Commercial airplane is faster");
        } else {
            System.out.println("Both have same speed");
        }

        int resultCap = capacity.compare(militaryAirlines,commercialPlane);
        if (resultCap > 0) {
            System.out.println("Military airplane has more capacity");
        } else if (resultCap < 0) {
            System.out.println("Commercial airplane has more capacity");
        } else {
            System.out.println("Both have same capacity");
        }
    }
}
