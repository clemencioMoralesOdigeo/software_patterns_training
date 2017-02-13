package decorator;

public class EDS extends Extra{
	
	public static final String DESCRIPTION = "Traction Control System - Standard EDS";
	public static final double PRICE = 300.00;
	
	public EDS(Component component) {
		super(component);
	}
	
	@Override
	public String getDescription() {
		return this.getComponent().getDescription()+" | "+EDS.DESCRIPTION;
	}
	@Override
	public double getPrice() {
		return this.getComponent().getPrice()+EDS.PRICE;
	}
}


