package Part5.interfaces.NiceCar;

public class MediaInstallation implements MediaPlayer {
    @Override
    public void start() {
        System.out.println("Music Stsrts");
    }

    @Override
    public void stop() {
        System.out.println("Music Stops");
    }

    @Override
    public void forword() {
        System.out.println("Music Moves Forward");
    }

    @Override
    public void reverse() {
        System.out.println("Music reverse");
    }

    @Override
    public void changePlayList() {
        System.out.println("Playlist Changed");
    }

    @Override
    public void changeArtist() {
        System.out.println("Artist Changed");
    }
}
