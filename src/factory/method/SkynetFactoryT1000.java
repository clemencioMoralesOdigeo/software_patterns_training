package factory.method;

/**
 * Created by Clemencio Morales Lucas.
 */
public class SkynetFactoryT1000 extends SkynetFactory {

    @Override
    public Terminator createTerminator() {
        System.out.println(this.toString());
        return new T1000();
    }

    @Override public String toString() { return "Skynet Factory of T1000 spawned one"; }
}
