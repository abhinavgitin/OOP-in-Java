package Part3.properties.polymorphism;

public class PolyMain {
    // polymorphism is the way of representing many ways to represent things code and substances
    // this is the main property of Object oriented programming language
    // so polymorphism is the act of representing the same thing( void area ) in multiple ways ( the different formulas for different shapes classes )
    static void main() {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
    }
    /*int java there are types of polymorphism and one of them is
    * static / compile time polymorphism and this is achieved by the use of the method overloading
    * meaning that the method having the same name but different parameters return type arguments etc.
    * example of them is multiple constructors like the way we did into the Box and the main class of single inheritance
    *
    * the next type of the polymorphism is called the runtime or the dynamic polymorphism
    * so what is this basically is that when the super class and the child class is having the same method and all the properties same then there is a way to
    * determine that does the patent and the child are having the same method ( do check the shapes and the circle class and the use of the Override) */
}
