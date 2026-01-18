package Part2.StaticClass;

public class Human {
    int age;
    boolean marriedOrNot;
    String name;
    String gender;
    static long population; // made this instance variable static and universal
    public Human(String name, int age, String gender, boolean marriedOrNot){
        this.name = name;
        this.age = age;
        this.marriedOrNot = marriedOrNot;
        this.gender = gender;
        // now to access a static variable which is constant and same for all the objects created or not we do
        // class name . ( call ) the static property we want;
        //it simply means that we use something that is universal and that is constant for each or the object or method or class created or not!
        Human.population++;
    }
    public Human() {
        Human.population++;
    }
    static Human object = new Human();
    String nonStatic1() {
        System.out.println(static1().concat(" call from a nonstatic to a static"));
        return "This is from a nonstatic method";
    }
    // also to experiment a static method
    static String static1() {
        return "This is from the static method";
    }
    static void main() {
        // to use any property of the class like the method I need an object and so using an object I call the method which is not static
        // method is not universal to all it needs to be called
        System.out.println(object.nonStatic1().concat(" in Human class"));
        System.out.println(static1().concat(" from the Human class")); // requires no call from an object
        /*
        * it's like this -> so if I have something static and universal that is not dependent on any
        * then why should I give it a nonstatic function or veritable or anything inside of it, huh?
        * so static -> static okay
        * nonstatic -> nonstatic okay
        * static -> nonstatic -> call from an object required
        * one line explanation ( IMPORTANT - we need to show that something which is ideal is being used by a real world entity dyam important )
        * nonstatic -> static okay
        */
    }
}
 