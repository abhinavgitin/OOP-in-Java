package Part4;

import java.util.ArrayList;

public class MainAccess {

    static void main() {
        // I want to access the instance variable member of the another class which is private as well as public b and a respectively
        Access obj = new Access(3,"Abhinav", new int[3] , 8); // so I make the object of the class and then call the method of that class via the object
        int num = obj.getB();
        // and print it easily
        // and in the same way we can access this into another package also just import the class there!
        System.out.println(num);
        // to access the public a same way and public states that it is always available to everyone everywhere
        System.out.println(obj.a);
        obj.setB(78); // set this first and then use it!
        System.out.println(obj.getB());
    }
}
