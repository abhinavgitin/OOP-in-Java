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
    }
}
