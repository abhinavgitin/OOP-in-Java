package generics.lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < 5 ; i++ ) {
            list.add(i);
        }
        list.forEach(num -> System.out.println(num*2));
        // #1 Lambda expression: parameters are on the left of -> and method body is on the right.
        System.out.println();


        // we know that consumer has a accept method so we can do it as and is equivalent to :
        list.forEach( new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                //so this      ^^^^^^^^^^^^^^^ becomes the parameter and
                System.out.println(integer*3);
                // ^^^^^^^^^^^^^^^^^^^^^^^^^ becomes the method BODY
                // see the #1 comment!
            }
        });
        // so it's just like this : list.forEach( integer -> System.out.println(integer*3); );
        // forEach expects a Consumer<Integer>
        // The lambda provides the implementation of Consumer's accept() method.


        // Operation sum = (a,b) -> a+b; // or we can use the integer sum method to add up them
        // Operation sum = (a, b) -> Integer.sum(a, b); // is the same
        Operation sum = Integer::sum; // and this is called a method reference!
        Operation sub = (a,b) -> a-b;
        Operation mul  = (a,b) -> a*b; // or write as :
        Operation div = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a/b;
            }
        };
        Operation show = new Operation() {
            @Override
            public int operation(int a, int b) {
                return 0;
            }

            @Override
            public void print() {
                Operation.super.print();
            }
        };

        System.out.println();
        // now we call the methods and do the operation
        Lambda calc = new Lambda();
        System.out.println(calc.operate(5,6,sum));
        System.out.println(calc.operate(8,8,sub));
        System.out.println(calc.operate(100,100,mul));
        System.out.println(calc.operate(56,7,div));
        calc.message(show);
        mul.print();
    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }
    private void message(Operation op) {
        op.print();
    }
}
