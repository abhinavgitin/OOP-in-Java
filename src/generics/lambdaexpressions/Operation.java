package generics.lambdaexpressions;
@FunctionalInterface
public interface Operation {
    int operation ( int a, int b);
    // I have written @FunctionalInterface because that prohibits to not have more than one abstract methods!

    //but these are not a abstract methods
    default void print() {
        System.out.println("Hello");
    }
}
