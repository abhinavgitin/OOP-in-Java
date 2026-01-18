package Part2;

import Part2.Returner;

import static Part2.Returner.calc;

public class Output {
    static void main() {
        System.out.println("Message from the output class");
        System.out.println(Returner.calc(7,7));
        int ans = calc(7,5);
        // or when the import is already done we just do calc( 6,6 );
        System.out.println(ans);
        Returner.main();
    }
}
