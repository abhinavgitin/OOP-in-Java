package Part3.properties.inheritance;

public class InheritOfBox extends Box {
    // extends to use the properties of the parent class
    double weight;
    InheritOfBox(){
        this.weight = 10d;
        // now here we can easily access the properties of the Box
        this.length = 222d;
    }
    InheritOfBox(double height, double length, double width, double weight){
        this.weight = weight;
        super( length, width, height ); // this like is basically replacing the one constructor elements having the length the width and the height
        //  it's the parent class constructor and the super is used to initialize the parent class constructor
        // its like replacing the "PARENT CLASS PROPERTIES INITIALIZATION" for example:
        /*we wanted that we could use the length the width and the height but that properties were in the parent class so
        * instead of doing like
        * box class ka .length = length
        * this.width = width
        * this.height = height here we simply did this part of the initialization by using the super and then what we wanted to use and initialize*/
        // also the format for the ( here , here and , here ) should be the way it is there in the object constructor made
    }
}
