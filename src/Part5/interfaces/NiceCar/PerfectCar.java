package Part5.interfaces.NiceCar;

public class PerfectCar {
    private Engine engine;
    private final MediaPlayer md = new MediaInstallation();
    private final NumberPlate numberPlate = new NumberPlateInstallation();
    private final NoOfSeats seats = new SeatsInstallation(); // I do this cause we have overridden the methods or the templates for each of them
    public final Structure structure = new StructureInstallation();
    public final OilTypeUsage oil = new OilTypeUsage();
    // if I want to change the engine I can simply do it using a constructor of the same PerfectCar class;
    public PerfectCar (){}; //default constructor
    /*----------*/
    // we do this to access the methods of the Engine Interface;
    // here we install the engine first
    public void startEngine() {
        engine.start();
    }
    public void stopEngine() {
        engine.stop();
    }
    public void engineCC() {
        engine.cc();
    }
    public void torque() {
        engine.torque();
    }
    public void enginePistons() {
        engine.noOfPistons();
    }
    public void sparkPluge() {
        engine.sparkPluge();
    }
    /*----------*/
    // now we do install a media player;
    public void musicStarts() {
        md.start();
    }
    public void musicStops() {
        md.stop();
    }
    public void musicReverse() {
        md.reverse();
    }
    public void chnageArtist() {
        md.changeArtist();
    }
    public void changePlaylist() {
        md.changePlayList();
    }
    public void musicForward() {
        md.forword();
    }
    public void setNumberPlate() {
        numberPlate.govLisencePlate();
        // if i want to add a private i can change that here;
    }
    public void typeOfSeats() {
        seats.twoPerson();
    }
    public void bodyType() {
        structure.carbonBody();
    }
    public void aeroOrRegular() {
        structure.aeroDynamicBody();
    }
    public void nameOfOil() {
        oil.petrol();
    }
    public void upgradeToPowerEngine() {
        // if I want to upgrade the engine then I will call this method and then pass the engine that I want to upgrade with
        this.engine = new PowerEngine(); // so when i call this method then it upgrades to the power Engine
    }

    public void upgradeToElectricEngine() {
        this.engine = new ElectricEngine();
    }
}
