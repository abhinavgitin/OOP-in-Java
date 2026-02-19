package Part5.abstraction;

public abstract class Parent {
    // This is about the abstract classes and what is the meaning of the abstract classes?
    /* an abstract classes are the parent classes that have some of the abstract methods like the template or rules that the subclass must inherit
    * therefore we make the abstract methods that can be overridden to the child classes
    * and, it is very well known that when the child class is the objcet having the overridden methods and the super class as the referenceing class then
    * the methods or the funtions in the child class will be run apprently
    * the implementation to make the abstract classes is to use the keywork *abstract* and then the name of the methods as required
    * it can be stated as per the accces modifier used
    * and the parameters are the rules or the templates in case required
    * the only way to change the same to same methods of the super class is via the overridden methods in the subclass so we do the same here*/
    abstract void carrier();
    abstract void friendsCarrier();
    // when any class is inheriting an abstract class then teh class should also be stated as abstract class
    int checkTheFirstCall = 0;
    int age;
    public Parent( int ageDate ) {
        this.age = ageDate;
    }
    // we can create static methods into the abstract class itself and that is allowed into java
    static void itsAHello() {
        System.out.println("Hello from Abhinav");
    }

    // and same goes for the normal methods non-static ones
    void normal( boolean callFromChildObject) {
        System.out.println("A normal method from the abstract class");
        if (callFromChildObject){
            System.out.println("It was called from the referencing object child class" + checkTheFirstCall); // cause the object of the abstract classes cannot be made
            checkTheFirstCall++;
        }
    }

    static void main() {
//        Parent obj = new Parent(88); cannot cause we cannot make the object of the abstract classes
    }
}
/* Some thinsg to remember :
* 🔥 Why Do We Need Abstract Classes?

They are used when:

✅ You want common structure
✅ You want shared code
✅ But some behavior must be decided by child
🏗 Real Use Case Thinking

If you build:

Payment system
Game engine
Machine simulation
Shape system

You want:
A general parent
Enforced rules
Controlled design
Very IMPORTANT! ALL IN ONE
ABSTRACT CLASSES HELP YOU FORCE THE SUBCLASSES TO FOLLOW CERTAIN RULES AND IMPLEMENT THINGS TO THE CHILD CLASSES AS PER THE RULES, BLUEPRINTS, TEMPLATES MADE!!!*/