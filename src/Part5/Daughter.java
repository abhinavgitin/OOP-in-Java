package Part5;

public class Daughter extends Parent {
    int age;
    @Override
    void friendsCarrier() {
        System.out.println("Her friend wants to be a painter");
    }

    @Override
    void carrier() {
        System.out.println("She wants to be a Doctor");
    }
    public Daughter(int age) {
        super(99);
        this.age = age;
    }
}
