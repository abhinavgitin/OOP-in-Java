package Part3.properties.multipleinheritance;

public class Car {
    String engine;
    double price;
    String color;
    String type;

    Car() {
        this.color = "White";
        this.price = 48949;
        this.engine = "Rm400";
        this.type = "Racing";
    }

    Car(String engine, double price, String color, String type) {
        this.engine = engine;
        this.type = type;
        this.price = price;
        this.color = color;
    }
}
