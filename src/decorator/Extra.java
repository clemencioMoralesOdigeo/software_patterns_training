package decorator;

public abstract class Extra extends Component {

	private Component component;
	
	public Extra(Component component){
		this.component = component;
	}
	
	public Component getComponent() {
		return this.component;
	}
}


