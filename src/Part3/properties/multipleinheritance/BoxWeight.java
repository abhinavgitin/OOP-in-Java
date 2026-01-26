package Part3.properties.multipleinheritance;

public class BoxWeight extends Box {
    double boxWeight;
    BoxWeight() {
        this.boxHeight = 400;
        super.boxWidth = 300;
        boxLength = 200;
        this.boxWeight = 100;
        // so what happens here is that the BoxWeight extends the Box so the members are here, and they have been given the values
        // the final values are given here to them not the one that is there into this class super class the Box class
        // if I did not initialize or give the values to the length width and the height then the values of the super class was to be printed
        // it is to be noted that the values of the member that gets printed will be the final initialize or given values to them respectively to what classes that are
    }
    BoxWeight( double wLength, double wWidth, double wHeight, double wWeight) {
        // so this is a constructor inheriting the instance variables or members of the super class Box
        super(wLength,wWidth,wHeight);
        this.boxWeight = wWeight;
    }
//    static void thisIsAPrintStatement(){
//        System.out.println("I am in a BoxWeight class ");
//    }
}
