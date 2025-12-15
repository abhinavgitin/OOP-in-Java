package Part2.StaticClass;

public class Main {
    static void main() {
        System.out.println(Human.population);
        Human person1 = new Human("Abhinav", 19, "Male", false);
        System.out.println(Human.population);
        Human person2 = new Human("Aakanksha", 17, "Female", false);
        Human person3 = new Human("KK", 80, "Male", true);
        System.out.println(person1.name + " " + person1.age + " " + person1.marriedOrNot + " " + person1.gender);
        System.out.println(person2.name + " " + person2.age + " " + person2.marriedOrNot + " " + person2.gender);
        System.out.println(person3.name + " " + person3.age + " " + person3.marriedOrNot + " " + person3.gender);
        // we call the data and this is simple as we have already learnt!

        // now we call the main static Instance variable of the class Human and
        // for the same we use the name of the class and then . ( call ) then the name of the property we want respectively
        System.out.println(Human.population); // class ka property has so call ka naam se call Karo simple
        /* Because population++ is inside the constructor, it increments once for every new object created.
         * The static variable increments only when the constructor runs, which happens every time a new object is created.
         */
        System.out.println(
                Human.object.nonStatic1().concat(" call from the Main class") +"\n"+
                // or we can just import the object doing like this -> import static Part2.StaticClass.Human.object
                // or just use one of the object from the Main class to call it.
                person1.nonStatic1().concat(" from the object of the Main class")
        );
    }
}