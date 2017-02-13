package factory.method;

/**
 * Created by Clemencio Morales Lucas.
 */
public class SkynetFactoryT800 extends SkynetFactory {

    @Override
    public Terminator createTerminator() {
        System.out.println(this.toString());
        return new T800();
    }

    @Override public String toString() { return "Skynet Factory of T800 spawned one"; }
}


