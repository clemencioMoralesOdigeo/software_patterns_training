package command.and.memento;

public class CommandSubstract implements Command {
	private Calculator calculator;

	public CommandSubstract(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		this.calculator.substract(1);
	}
	
	@Override
	public String toString(){
		return "Substract";
	}
}
