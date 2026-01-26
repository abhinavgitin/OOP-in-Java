package Part3.properties.multipleinheritance;

public class Bmw extends Car{
    double distance;

    Bmw(String eng, double Price, String type, String color, double distance ){
        super(eng, Price, color, type);
        this.distance = distance;
    }
}
