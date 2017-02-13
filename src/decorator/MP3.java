package decorator;

public class MP3 extends Extra {
	
	public static final String DESCRIPTION = "MP3 8 GB";
	public static final double PRICE = 100.00;
	
	public MP3(Component component) {
		super(component);
	}
	
	@Override
	public String getDescription() {
		return this.getComponent().getDescription()+" | "+MP3.DESCRIPTION;
	}
	@Override
	public double getPrice() {
		return this.getComponent().getPrice()+MP3.PRICE;
	}
}

