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
    public void play() {
        System.out.println("Music starts in Bentley Continental Gt");
    }

    @Override
    public void pause() {
        System.out.println("Music stops in Bentley Continental Gt");
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
}
