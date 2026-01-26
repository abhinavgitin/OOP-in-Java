package Part3.properties.multipleinheritance;

public class Maruti extends Car {
    double size;
    double seats;

    Maruti(String engine, String type, double Price, String color, double size, double seats) {
        this.seats = seats;
        this.size = size;
        super(engine, Price, color, type);
    }
}
