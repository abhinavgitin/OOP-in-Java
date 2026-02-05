package Part5.abstraction;

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

    @Override
    void normal(boolean callFromParent) {
        super.normal(callFromParent);
        if ( callFromParent )
            System.out.println("It was called from the referencing parent class");
        // both for the overridden call from the referencing parent and the child class call this method will get executed first due
        // to dynamic method dispatch
    }

    public Son( int age ) {
        super(99);
        this.sAge = age;
    }
}
