package Part5.interfaces.NiceCar;

public class PowerEngine implements  Engine{
    @Override
    public void cc() {
        System.out.println("6,592CC");
    }

    @Override
    public void noOfPistons() {
        System.out.println("12 pistons");
    }

    @Override
    public void sparkPluge() {
        System.out.println("Platinum or Iridium spark plugs");
    }

    @Override
    public void torque() {
        System.out.println("23 Nm");
    }

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }
}
