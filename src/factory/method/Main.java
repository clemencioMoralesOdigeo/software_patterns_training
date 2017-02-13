package factory.method;

/**
 * Created by Clemencio Morales Lucas.
 */
public class Main {

    public static void main(String[] args) {
        SkynetFactory[] skynetFactories = {new SkynetFactoryT800(),
                new SkynetFactoryT1000()};
        skynetFactories[0].createTerminator().view();
        System.out.println("=======================");
        skynetFactories[1].createTerminator().view();
    }
}




