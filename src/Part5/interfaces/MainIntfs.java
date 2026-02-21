package Part5.interfaces;

public class MainIntfs {
    static void main() {
        Car car = new Car();
        /* Here is a very Important recap. That when we talk about the referencing class and the object of that referencing class
        * the can only access the one which is there into the referencing class and
        * when there are the methods that are overridden then we access the one that is there into the object class made
        * True? thus it works like this
        * Car is the one telling that I have the specific methods and that are only available to you
        * so when we need to access that methods that are there into the car() we call it by the object name . the METHODS THAT ARE AVAILABLE INTO THE OBJECT CLASS THE Car Here*/
        car.cc();
        car.bodyType();
        car.material();
        car.play();
        car.pause();
        car.noOfPistons();
        car.mileage();
        System.out.println("------------Next Part------------");
        /*But when I need to refer from a specific class Like Engine then I will do*/
        Engine engine = new Car();
        engine.cc();
        engine.noOfPistons();
        engine.mileage();
        /*Very Important -> Here te reference class is the Engine and the Object class is the Car()
        * so what happens is the Engine Interface class tells that I have only the cc noOfPistons and mileage that are known to me
        * so when you call the engine.cc or such engine. name of the method that you want from the overridden method then ( ctrl + click names )
        * the methods that are there into the Car gets called cause they are overridden, and thus they gets used
        * Engine does not know what is play and pause from any class so we cannot use that methods by doing something like this : */
//        engine.paly();
//        engine.pause();
    }
}
