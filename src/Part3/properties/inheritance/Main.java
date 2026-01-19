package Part3.properties.inheritance;

public class Main {
    static void main() {
        Box object1 = new Box();
        System.out.println(object1.length+" "+object1.width+" "+object1.height);
        // changing the data of the object1
        object1.height = 50d;
        object1.width = 100d;
        object1.length = 120d;
        // giving the data of the object1 to the object2
        Box object2 = new Box(object1);
        System.out.println(object2.length+" "+object2.width+" "+object2.height);
        // next object3
        Box object3 = new Box(44d,44d,44d);
        System.out.println(object3.length+" "+object3.width+" "+object3.height);

        InheritOfBox object4 = new InheritOfBox(12,56,89,56);
        System.out.println(
                "Length from the inherited class is : "+object4.length+"\n"+
                        "width from the inherited class is : "+object4.width+"\n"+
                        "height from the inherited class is : "+object4.height+"\n"+
                        "weight form the inherited class is : "+object4.width+"\n"
        );
        // an important concept of referencing the parent and the child classes
        Box object5 = new InheritOfBox(12 ,78, 45,100);
        // here I am trying to reference a parent super class ( Box ) to a child ( InheritOfBox )
        // so it means that I will easily be accessible to the members or properties having in the super class as well as the child class cause
        // the InheritOfBox is having all the data ( I think it is like this )
        System.out.println(
                "Length : "+object5.length+"\n"+
                        "width : "+object5.width+"\n"+
                        "height : "+object5.height+"\n"+
                        "weight : "+object5.width+"\n"
        );
        // also when the child class( InheritOfBox object4 ) is referencing to itself ( new InheritOfBox(12,56,89,56); ) the members to itself and the super class is accessible
        // InheritOfBox object4 = new InheritOfBox(12,56,89,56);

        // when we try to reference the child class to the main class like this then : there is no problem in that too but the super class doesn't know anything about the member weight
        // which is declared in the child weight so how do we initialize ( the put of data in the () here ) that member which is not know to the super class anyway
        // why cany we initialize is because the reference class, the child class is calling the parent class constructor which does not have any idea of the member weight.
        // InheritOfBox object6 = new Box(45 ,2,4); // remove the comment and see;
        // but in case of the child class it was accessible cause the child class extends the super class so it had them!
        // so we cannot have a child reference variable to a parent object
    }
}
