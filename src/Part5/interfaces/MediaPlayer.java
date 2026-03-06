package Part5.interfaces;

public interface MediaPlayer {
    void pause();
    void play(boolean playing); // here its void cause the overridden method is being called and that has to has a return type for the method to return!
}
