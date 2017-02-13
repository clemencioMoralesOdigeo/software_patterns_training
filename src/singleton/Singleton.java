package singleton;

/**
 * Created by Clemencio Morales Lucas.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        //Avoids instantiation directly
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



