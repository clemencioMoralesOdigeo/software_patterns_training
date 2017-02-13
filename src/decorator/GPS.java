package decorator;

public class GPS extends Extra{

	public static final String DESCRIPTION = "GPS Model 16F886";
	public static final double PRICE = 200.00;
	
	public GPS(Component component) {
		super(component);
	}
	
	@Override
	public String getDescription() {
		return this.getComponent().getDescription()+" | "+GPS.DESCRIPTION;
	}
	
	@Override
	public double getPrice() {
		return this.getComponent().getPrice()+GPS.PRICE;
	}
}


