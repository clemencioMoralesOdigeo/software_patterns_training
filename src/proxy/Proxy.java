package proxy;

/**
 * Created by Clemencio Morales Lucas.
 */
public class Proxy extends ComplexObject {

    private ComplexObjectImplementation complexObjectImplementation;

    public Proxy() {
        this.complexObjectImplementation = null;
    }

    @Override
    public void petition() {
        if (this.complexObjectImplementation == null) {
            this.complexObjectImplementation = new ComplexObjectImplementation();
        }
        this.complexObjectImplementation.petition();
    }

    @Override
    public void petition2() {
        if (this.complexObjectImplementation == null) {
            System.out.println("Petition 2: The proxy is responding, so we " +
                    "\ncan avoid to create the complex object in this case");
        } else {
            this.complexObjectImplementation.petition2();
        }
    }
}


