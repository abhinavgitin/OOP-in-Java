package Part3.properties.multipleinheritance;

import Part3.properties.singleinheritance.Box;
import Part3.properties.singleinheritance.InheritOfBox;

public class MainMI {
    static void main() {
        //now I want the values to be printed from the Box Price Class
        BoxPrice object1 = new BoxPrice(1,2,3,4,5);
        System.out.println(
                "---------------BoxPrice-------------------"+"\n"+
                "the length from the price class is : "+object1.boxLength+"\n"+
                "the width from the price class is : "+object1.boxWidth+"\n"+
                "the height from the price class is : "+object1.boxHeight+"\n"+
                "the weight from the price class is : "+object1.boxWeight+"\n"+
                "the price from the price class is : "+object1.boxPrice
        );
        System.out.println();
        BoxPrice object2 = new BoxPrice();
        System.out.println(
                "---------------BoxPrice-------------------"+"\n"+
                "the length from the price class is : "+ object2.boxLength+"\n"+
                "the width from the price class is : "+ object2.boxWidth+"\n"+
                "the height from the price class is : "+ object2.boxHeight+"\n"+
                "the weight from the price class is : "+ object2.boxWeight+"\n"+
                "the price from the price class is : "+ object2.boxPrice+"\n"
        );

        // now I want some values from the Main class to be used or printed
        Box object3 = new Box(67,78,90);
        System.out.println(
                "---------------Box from single inheritance-------------------"+"\n"+
                object3.length+" "+object3.width+" "+object3.height+"\n"
        ); // I got the data from the Box class via the Main class of the singleinheritance

        // now lets take this to another level what we do is that we call the InheritOfBox(InheritOfBox object) and then pass the object3 inside that to see what happens
        // InheritOfBox object4 = new InheritOfBox(object3); this wont work cause the object3 is the type of box reference and the InheritOfBox(object3) wants the object of ist own kind

        // just call the inherit of box this time
        InheritOfBox object4 = new InheritOfBox(78,34,5,89);
        System.out.println(
                "---------------InheritOfBox-------------------"+"\n"+
                "Length from the inherited class is : "+object4.length+"\n"+
                        "width from the inherited class is : "+object4.width+"\n"+
                        "height from the inherited class is : "+object4.height+"\n"+
                        "weight form the inherited class is : "+object4.weight+"\n"
        );

        // now lets use the same package objects
        BoxWeight object5 = new BoxWeight(11,22,33,44);
        System.out.println(
                "---------------BoxWeight-------------------"+"\n"+
                        "the length from the weight class is : "+ object5.boxLength+"\n"+
                        "the width from the weight class is : "+ object5.boxWidth+"\n"+
                        "the height from the weight class is : "+ object5.boxHeight+"\n"+
                        "the weight from the weight class is : "+ object5.boxWeight+"\n"
                        //"the price from the weight class is : "+ object5.boxPrice // error cause the BoxWeight doesn't know what in the world is the member
                // boxPrice now lets try this one :
        );
        // BoxPrice object6 = new BoxWeight(12,13,14,15);
        // when we try to reference the child class to the main class like this then : there is no problem in that too but the super class doesn't know anything about the member weight
        BoxWeight object6 = new BoxPrice(12,13,14,15,16);
        System.out.println(
                "---------------BoxWeight referencing BoxPrice-------------------"+"\n"+
                        "the length from the price class is : "+ object6.boxLength+"\n"+
                        "the width from the price class is : "+ object6.boxWidth+"\n"+
                        "the height from the price class is : "+ object6.boxHeight+"\n"+
                        "the weight from the price class is : "+ object6.boxWeight+"\n"
//                        "the price from the price class is : "+ object6.boxPrice won't work cause the BoxWeight doesn't know about the member price cause it's not declared into it
        );

        // all to check that how does two class extends the same one super class and results
        Bmw objcet7 = new Bmw("Er67TT400", 560000, "Super car", "Dark Red", 5600);
        System.out.println(
                "---------------Bmw extends Car-------------------"+"\n"+
                "Bmw color is : "+objcet7.color+"\n"+
                        "Bmw distance travelled is : "+objcet7.distance+"\n"+
                        "Bmw price is : "+objcet7.price+"\n"+
                        "Bmw engine is : "+objcet7.engine+"\n"+
                        "Bmw type is : "+objcet7.type+"\n"
        );
        // to call the another class that also extends the same super class
        Maruti object8 = new Maruti("TTfz345R5", "Luxary", 78900, "Yellow", 567, 7);
        System.out.println(
                "---------------Maruti extends Car-------------------"+"\n"+
                "Maruti color is : "+object8.color+"\n"+
                        "Maruti size travelled is : "+object8.size+"\n"+
                        "Maruti price is : "+object8.price+"\n"+
                        "Maruti engine is : "+object8.engine+"\n"+
                        "Maruti type is : "+object8.type+"\n"+
                        "Maruti car seats is : "+object8.seats
        );
    }
}