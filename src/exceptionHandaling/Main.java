package exceptionHandaling;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
//            int c = a / b;
            System.out.println(divide(a,b));
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        } finally {
            System.out.print("This always runs");
            // like in IO if the file opens, and we did something over that file, but it is not getting saved and we need to close it or cache it then
            // this comes in use
        }
    }

    static int divide (int a, int b) throws ArithmeticException {
        if ( b == 0 ) {
            throw new ArithmeticException("There is something wrong with you go get some sleep bruh");
        }
        return a / b;
    }
}
