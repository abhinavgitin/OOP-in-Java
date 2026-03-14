package Part5.interfaces.NiceCar;

public class StructureInstallation implements Structure {
    @Override
    public void carbonBody() {
        System.out.println("The car body is made of Carbon Fiber");
    }

    @Override
    public void aluminiumBody() {
        System.out.println("The car body is made of Aluminium body");
    }

    @Override
    public void metalBody() {
        System.out.println("The car body is made of metal");
    }

    @Override
    public void aeroDynamicBody() {
        System.out.println("The body of the car is aero Dynamic");
    }

    @Override
    public void regular() {
        System.out.println("The car body is a regular Body type");
    }
}
