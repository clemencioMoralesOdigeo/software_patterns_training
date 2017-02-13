package decorator;

public class Vehicle extends Component {

	private String description;
	private double price;
	
	public Vehicle(String description, double price) {
		this.description = description;
		this.price = price;
	}

	@Override
	public String getDescription() {
		return "Vehicle's Description: "+this.description;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
}


