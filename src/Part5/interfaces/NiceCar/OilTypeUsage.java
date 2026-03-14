package Part5.interfaces.NiceCar;

public class OilTypeUsage implements OilType {
    @Override
    public void petrol() {
        System.out.println("The car uses Petrol to run");
    }

    @Override
    public void cng() {
        System.out.println("The car uses CNG to run");
    }

    @Override
    public void electric() {
        System.out.println("The car is an electric engine");
    }

    @Override
    public void desiel() {
        System.out.println("The car is an diesel engine");
    }
}