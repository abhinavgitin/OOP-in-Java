package Part5;

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

    int age;
    public Parent( int ageDate ) {
        this.age = ageDate;
    }

    static void main() {
//        Parent obj = new Parent(88); cannot cause we cannot make the object of the abstract classes
    }
}
