package Part3.properties.multipleinheritance;

public class Box {
    double boxLength;
    double boxWidth;
    double boxHeight;

    Box() {
        this.boxHeight = 33;
        this.boxLength = 66;
        this.boxWidth = 99;
    }

    // constructor with the parameters
    Box( double length, double width, double height) {
        this.boxLength = length;
        this.boxWidth = width;
        this.boxHeight = height;
    }
    static void thisIsAPrintStatement(){
        System.out.println("I am in a Box class ");
    }

}
