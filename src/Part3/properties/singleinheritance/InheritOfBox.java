package Part3.properties.singleinheritance;

public class InheritOfBox extends Box {
    // extends to use the properties of the parent class
    public double weight;
    InheritOfBox(){
        this.weight = 10d;
        // now here we can easily access the properties of the Box
        super.length = 222d;
        this.width = 666d;
    }
    public InheritOfBox(double length, double width, double height, double weight){
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

        // we can also access the super class members like this
        System.out.println("Use of super to access the super class members "+super.height);
        // so to access anything from the super class we do the super . variable name not this . variable name
    }
    // we make a normal constructor taking another object into it
    public InheritOfBox(InheritOfBox object){
        super(object);
        this.weight = object.weight;
    }
}
