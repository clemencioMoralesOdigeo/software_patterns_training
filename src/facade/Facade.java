package facade;

/**
 * Created by Clemencio Morales Lucas.
 */
public class Facade {

    private CarDealership carDealership;
    private CarDealership carDealershipOther;

    public Facade(){
        carDealership = new Ferrari();
        carDealershipOther = new Maserati();
    }

    public void createFerrari(){
        carDealership.create();
    }

    public void createMaserati(){
        carDealershipOther.create();
    }
}


