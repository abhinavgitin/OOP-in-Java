package Part5.interfaces.NiceCar;

public class ElectricEngine implements Engine {
    @Override
    public void cc() {
        System.out.println("6,002CC");
    }

    @Override
    public void noOfPistons() {
        System.out.println("No Pistons| NULL");
    }

    @Override
    public void sparkPluge() {
        System.out.println("No Spark Plug used | NULL");
    }

    @Override
    public void torque() {
        System.out.println("18 Nm");
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
