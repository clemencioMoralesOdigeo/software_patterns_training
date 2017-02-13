package command.and.memento;

public class CommandReset implements Command {
	
	private Calculator calculator;

	public CommandReset(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		this.calculator.reset();
	}
	
	@Override
	public String toString(){
		return "Reset";
	}
}
