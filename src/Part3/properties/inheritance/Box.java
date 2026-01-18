package Part3.properties.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this.length = -1d;
        this.height = -1d;
        this.width = -1d;
    }
    Box ( double l, double w, double h){
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
