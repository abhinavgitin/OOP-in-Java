package Part3.properties.multipleinheritance;

public class BoxPrice extends BoxWeight {
    double boxPrice;
    BoxPrice(){
        super();
        this.boxPrice = 500;
    }
    BoxPrice(double pLength, double pWidth, double pHeight, double pWeight, double pPrice){
        // here the BoxPrice calls its super class BoxWeight and then that class calls its super class Box then
        // the members of the class are inherited from the one to another
        super(pLength,pWidth,pHeight,pWeight);
        this.boxPrice = pPrice;
    }
}
