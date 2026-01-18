package Part2;

public class Returner {
    static void main() {
        System.out.println("Message from the Returner class");
    }
    public static int calc ( int a , int b ){
        // ist so simple that the clac is static so it belongs to the class it is into so to use this method we do it simply the name of the class . the name of the
        //function / method
        return a+b;
    }
}
