package Part3.properties.polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }
    int area(int a ){ //method overloading
        return 0;
    }

    static void main() {
        Shapes object = new Shapes();
        object.area();
        Shapes object2 = new Circle();
        object2.area(); // the one in the circle gets printed why ?
        // we know that we access only the members which is getting referenced (Shapes) and the Object is the one giving the data
        // so why is that the area() in the Circle is called why not the one in the Shapes cause that is true that we can only access the one which is into the referencing class
        /* Very Important Answer
        * Here what method is being called depends upon the child class / the constructor / the one holding the data / the Cricle()
        *  This call of the overridden methods is called the upcasting in java
        * and this entire Shapes object2 = new Circle();   object2.area(); thing is called how overriding works
        * and thus the overridden method gets called of the super class (IMPORTANT) read this again
        * And this whole story happens during the runtime and is called DYNAMIC METHOD DISPATCH */
    }
}
