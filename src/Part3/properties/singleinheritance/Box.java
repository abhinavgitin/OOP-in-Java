package Part3.properties.singleinheritance;

public class Box {
    public double length;
    public double width;
    public double height;

    Box() {
        super(); //  also shows that the main class the super class is also being referenced to a super class which is an object class ctrl + click
        // super means directly above it so sii it like this object class <- Box class ( super class ) <- Inherited classes (InheritOfBox) any other.....
        // who wants to inherit the InheritOfBox will make the InheritOfBox class a super class for them.
        this.length = -1d;
        this.height = -1d;
        this.width = -1d;
    }
    public Box ( double l, double w, double h){ // because i want to access this one from the MainMI class
        this.length = l;
        this.width = w;
        this.height = h;
    }
    Box( Box object ){
        this.length = object.length;
        this.height = object.height;
        this.width = object.width;
    }
}
