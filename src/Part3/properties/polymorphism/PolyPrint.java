package Part3.properties.polymorphism;

public class PolyPrint {
    int a;

    public PolyPrint(int a) {
        this.a = a;
    }

    // what if we also make the toString method the same as that of the Object class then we are the child class and
    // then its 100% sure that the method toString method will be overridden cause we extend also and we the child class also and having the same method

    @Override
    public String toString() { // so this method gets executed at runtime called as DYNAMIC METHOD DISPATCH
        return "PolyPrint{" + "a=" + a + '}';
    }

    static void main() {
        PolyPrint obj = new PolyPrint(67);
        System.out.println(obj);
        // here what happens is that I have not told java that I want the value of the obj.a to be printed and just given the name of the object I have created here
        // so what happens is that the println function calls the string value of and the toString function that in return prints the
        // name of the class concatenating the Hexcode.
        // we know that each class in java extends to the Object class fine!
        // also then when the toString method is called then we in return get the  name of the class concatenating the Hexcode.
        // IMPORTANT -> so on that basis we are the child class right cause we extend the super class Object
        // now it is important to understand that
        // when an overridden method in the child class is the Object into the referencing super class then the method of the object class the child class gets executed
        // just like we did into the answer statement of the Shapes class where The Circle was extending the Shapes class
        // now read above

    }
}
