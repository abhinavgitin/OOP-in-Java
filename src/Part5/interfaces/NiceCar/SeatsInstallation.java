package Part5.interfaces.NiceCar;

public class SeatsInstallation implements NoOfSeats {
    @Override
    public void fourPerson() {
        System.out.println("Its a 4 person seater");
    }

    @Override
    public void twoPerson() {
        System.out.println("Its a 2 person seater");
    }

    @Override
    public void onePerson() {
        System.out.println("Its 1 person seater");
    }

    @Override
    public void famiySeatter() {
        System.out.println("Its a family | 6 person seater");
    }
}
