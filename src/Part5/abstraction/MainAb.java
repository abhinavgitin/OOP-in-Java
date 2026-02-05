package Part5.abstraction;

public class MainAb {
    static void main() {
        // I will try calling by both referencing the super class and the child class
        Parent object1 = new Son(88);
        Parent object2 = new Daughter(89);
        Son object3 = new Son(90);
        Daughter object4 = new Daughter(98);
        object1.carrier();
        object1.friendsCarrier();
        object2.carrier();
        object2.friendsCarrier();
        object3.carrier();
        object3.friendsCarrier();
        object4.carrier();
        object4.friendsCarrier();
        // hence it is stated that the object class or the child class overridden methods are called even tough the referencing class is the super class of its own
        // STATED that the object of the abstract classes cannot be made
        // You can’t create an object of an abstract class because objects represent reality, and abstract classes represent ideas and the templates or blueprints for the child classes
        System.out.println(object1.age);
        // when I do objcet1.sAge it will throw an error cause this is a simple referencing object error not the overridden one so the parent doesn't know what is there into the child class so we cannot print the value of the sAge
        System.out.println(object3.sAge);

        // static method is there into the abstract class and can be called easily here
        Parent.itsAHello();
        // Thus we can call the normal methods from the abstract classes like this
        //object3.normal(true); // here the referencing class is son and the object is also son thus we do it like this
        object3.normal(false);
        // or we can call it from the overridden methods
        object1.normal(true);
        //object1.normal(true);
    }
}
