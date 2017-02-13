package facade;

/**
 * Created by Clemencio Morales Lucas.
 */
public class Ferrari implements CarDealership {

    @Override
    public void create() {
        //Everything related with the complex object creation goes here
        System.out.println("Ferrari created.");
    }
}


