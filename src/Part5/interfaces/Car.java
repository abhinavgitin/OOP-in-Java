package Part5.interfaces;
// @SuppressWarnings("unused")
public class Car implements Engine, Structure, MediaPlayer {
    // It was clearly seen that the abstract classes cannot extend or inherit many classes from above such that only one was possible
    // so to solve that where we need to inherit many classes there we use the interfaces
    // which is same as that of the inheritance but multiple inheritance for the abstract classes!! VERY IMPORTANT!
    // -> Thus to extend or inherit that interface classes we can do it like : Class we want the interfaces classes to come + "implements" + name of all the interface classes we want!

    @Override
    public void cc() {
        System.out.println("A 5998cc Engine");
    }

    @Override
    public void mileage() {
        System.out.println("A 5998cc Engine Giving 12.9km/l");
    }

    @Override
    public void noOfPistons() {
        System.out.println("Its a V8 engine");
    }

    @Override
    public void pause() {
        System.out.println("Music starts in Bentley Continental Gt");
    }

    @Override
    public void play(boolean playing) {
        if ( playing ) {
            System.out.println("Music is playing enjoy =)");
        } else {
            System.out.println("Music is not playing");
        }
    }

    @Override
    public void bodyType() {
        System.out.println("Aero Dynamic");
    }

    @Override
    public void material() {
        System.out.println("Carbon Fiber + Aluminium");
    }
    // Now it's same like the abstract classes, and thus we can override the methods of the interface classes and thus make our CUSTOM CAR!!!
    // this line ^

    @Override
    public void typeOfOil() {
        System.out.println("Twin power Turbo Oil");
        // since both the classes are having the same signature so java only considers one to override
    }

    // one more we can do -> what if there is a method in the parent class and the same method in the child class then what happens??
//    void noOfSets(){
//        System.out.println("4");
//    }
    // If a parent class has a method and the child class defines the same
    // method with the same signature, the child method overrides the parent method.
    // But we cannot define two identical methods inside the same class,
    // otherwise Java throws a duplicate method error.
    @Override
    public void noOfSets() {
        System.out.println("5");
    }
}
