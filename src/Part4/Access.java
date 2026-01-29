package Part4;

public class Access {
    public int a; // this is public
    private int b; // this is private
    String str;
    int[] arr;

    public Access(int a, String str, int[] arr, int b) {
        this.a = a;
        this.str = str;
        this.arr = arr;
        this.b = b;
    }

    public int getB() {
        return b; // even though the b is private and not reachable to other classes and methods we can make a method which is into the same class and is public to be accessed
        // thus calling this getter we can access the private member b
    }

    public void setB(int b) {
        this.b = b; // and same goes for the setting of the data ito b
    }
}
