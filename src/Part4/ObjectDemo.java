package Part4;

public class ObjectDemo {
    // a class always extends the Object class in java
    int num;
    int val;

    public ObjectDemo(int val, int num) {
        this.val = val;
        this.num = num;
    }
    // this shows that we just made the constructor for the super class Object
    public ObjectDemo() {
        super(); // click this and refer
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize(); // they say this is deprecated somewhat
//    }

    @Override
    public String toString() {
        return super.toString(); // it is clear that to access the Object class we do it using the super.the name of the method we want to use
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    static void main() {
        ObjectDemo obj1 = new ObjectDemo(89,78);
        ObjectDemo obj2 = new ObjectDemo(8,272);
        // is it that the obj is equal to the obj2?
        if ( obj1.equals(obj2)) {
            System.out.println("they are same");
        } else {
            System.out.println("they are not same");
        }
        System.out.println(obj1 instanceof Object);
        System.out.println(obj2.getClass());
    }
}
