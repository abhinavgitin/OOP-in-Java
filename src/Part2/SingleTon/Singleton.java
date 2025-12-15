package Part2.SingleTon;

public class Singleton {
    // i make a constructor private
    private Singleton(){

    }
    // our aim is to provide only and only one single object and no moe objects are allowed for the class when one is already created
    // make that object private to so we do
    private static Singleton instance; // its from this part >>Singleton instance<< = new Singleton();
    public static Singleton getInstance(){
        // we check that is that the object is already created or not
        // if not then make one
        // if created then return the same object or make all the call reference to the same object that is already created
        if (instance == null ){
            instance = new Singleton();
        }
        return instance;
    }
}
