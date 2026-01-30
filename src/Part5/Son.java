package Part5;

public class Son extends Parent {
    int sAge;
    @Override
    void friendsCarrier() {
        System.out.println("His friend wants to be an astronaut");
    }

    @Override
    void carrier() {
        System.out.println("Son wants to be a Senior Java Developer and a tech Guy");
    }
    public Son( int age ) {
        super(99);
        this.sAge = age;
    }
}
