package Part3.properties.polymorphism;

public class Circle extends Shapes {
    @Override // what is this doing here is just to check that does the super class my parent class is having a same method as that of me ( Circle )
    void area(){
        System.out.println("I am in circle and the formula is 3.14*radius*radius");
    }
}
