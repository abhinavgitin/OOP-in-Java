package Part2.StaticClass;

public class StaticInz {
    static int a;
    static int b;
    static int c;
    // we create a static block to initialize the variables or as per our need and this block only runs oce when the code is run!
    // we do it like this!
    static {
        a = 56;
        b = 2*a;
        System.out.println("first static block");
        c = whichIsCallFirst();
        System.out.println(c);
    }
    static void main() {
        System.out.println("This was a call of the static variables");
        System.out.println(a+b);
        // now I call the same method to see what i called first the main block or the static block;
        //if main will be called then the first main will be printed
        System.out.println("main first");
        c = whichIsCallFirst();
        System.out.println(c);
    }
    public static int whichIsCallFirst(){
        return a+b;
    }
}
