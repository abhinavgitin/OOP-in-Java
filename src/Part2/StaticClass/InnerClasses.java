package Part2.StaticClass;
/* we will make this very clear just read it correctly
* first -> we always need an object to accesss the property of the class right
* second -> we know that when something is ot dependent on any then why would it accept anything inside of it to dependent on anything
* third see that we when have a nested class which can be any like for eg take the main outermost class we know we see that the outer class is not dependent
* on any so why would it take anything ( nested classes ) inside of it which is dependent on anything other ( nested class )
* listen that even if it takes any classes inside of it you just cannot use the properties of that nested class cause it is itself dependent
* on the class it is into ...
* ... so to use the same what we do is we make it static meaning that it is now not dependent on anything not the outer class, nothing
* anywhere in the code ANYWHERE in the code just have the context that
* static demands anything static ,
* static demands any non-static with the call from an object
* nonstatic demands non-static, or it can be static dem
*
* like wise I can take the inner class out of the main class and now that same class is not dependent on any outer classes and
* can be easily accessible by any object IMPORTANT -> inside or outside the static method
*
* ONE MORE THING TO LEARN IMPORTANTLY IS -> When the object is called it passes it value to the constructor if made or not made and if the constructor is there
* -> as soon as the object is created and then the constructor what ever is there inside the constructor run irrespetive of what we just want*/


public class InnerClasses {

    static class staticInnerClass {
        static int age; // belongs to the class
        String name;
        public staticInnerClass(String name , int age ){
            this.name = name; // this belongs to the object not to the class
            staticInnerClass.age = age; // cause its static and belongs to the class
        }
    }

    static void main() {
        // so the main method is static SO we call properties from a static context which here is the static class!!
        // Question what if we have a method nonstatic, and we call a static class in the same way??
        // what if we have a nonstatic method, and we call a nonstatic class in the same way??
        /* solved into callOfTheClasses */
        staticInnerClass obj = new staticInnerClass("Abhinav", 19);
        System.out.println("1. First class name is "+ obj.name);
        System.out.println("1.5. when the instance variable belongs to the class"+ staticInnerClass.age);
        staticInnerClass obj2 = new staticInnerClass("Aakanksha", 17); // when this runs all data Aakanksha goes into the constructor, and we desire what we want to call
        // so when the new object is pass all data goes into the constructor """IMMEDIATELY""" and then values gets replaces and this is the answer to the just next question here 👇
        System.out.println("2. Second call when the name is "+obj2.name);
        System.out.println("2.5. when the instance variable belongs to the class"+ staticInnerClass.age); // how will it know that i pass 17 this time? I didn't mention pass obj2. or something like obj.staticInnerClass.age
        // VERY IMPORTANT -> we know that when the new object is created and the data is passed it allocates a new memory and every data is seperated but here in this context
        // READ THIS CONTINUATION CAREFULLY -> the age is a static instance variable so static is something constant and universal of the class it is into there by its value gets replaced each time for the new data is entered for the respective object created
        // now I call them all
        System.out.println("3. Third all called "+obj.name); // ig abhinav CAUSE THE DATA IS SEPERATED OR OBJECTS ACCESSING NONSTATIC INSTACE VARIABLES
        // called we do name = Abhinav when second call name = Aakanksha and stays Aakanksha till all the call here
        System.out.println("3.5 when all called "+ staticInnerClass.age); // ig 17 -> last change of the data was TO 17 so it got replaced to 17 from 19
        System.out.println("4. fourth all called "+obj2.name); // ig aakanksha CAUSE THE DATA IS SEPERATED OR OBJECTS ACCESSING NONSTATIC INSTACE VARIABLES
        System.out.println("4.5 when all called "+ staticInnerClass.age); // ig 17 -> same here final last data for the static inner class instance variable is 17;


        // now we do the same for the outer class nt dependent on any
        // we make the objects for the outer classes so that we dont use the data of the above objects just like this mistake
        // System.out.println("5  five when called from the outer class "+ obj.name);
        staticOuterClass obj3 = new staticOuterClass("Lenovo", 10000);
        System.out.println("5. Five when called from the outer class "+ obj3.name);
        System.out.println("5.5 when called from the outer class "+staticOuterClass.age);
        staticOuterClass obj4 = new staticOuterClass("HP", 1001);
        System.out.println("6  six when called from the outer class "+obj4.name);
        System.out.println("6.5 when called from the outer class "+staticOuterClass.age);

        // now calling all of them
        System.out.println("7. Five when called from the outer class "+ obj3.name);
        System.out.println("7.5 when called from the outer class "+staticOuterClass.age);
        System.out.println("8  six when called from the outer class "+obj4.name);
        System.out.println("8.5 when called from the outer class "+staticOuterClass.age);
    }
}
// I make an outer class not dependent on any so that i don't have to do static class staticInnerClass
class staticOuterClass {
    static int age;
    String name;
    public staticOuterClass(String name , int age ){
        staticOuterClass.age = age; // all because it belongs to the class;
        this.name = name; // this belongs to the object.
        System.out.println("just to see that will this be executed");
    }
}
