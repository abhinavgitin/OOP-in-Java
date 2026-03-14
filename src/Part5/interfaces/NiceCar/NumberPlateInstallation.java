package Part5.interfaces.NiceCar;

public class NumberPlateInstallation implements NumberPlate{
    @Override
    public void govLisencePlate() {
        System.out.println("Ist a govt licence Number Plate");
    }

    @Override
    public void premiumDriver() {
        System.out.println("Upper class Premium Number Plate");
    }

    @Override
    public void Learning() {
        System.out.println("The driver is just Learning to drive");
    }

    public NumberPlateInstallation() {
        // default constructor
    }
}
