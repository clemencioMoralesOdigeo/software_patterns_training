package command.and.memento;

public class CommandPrint implements Command {

	private Calculator calculator;

	public CommandPrint(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		this.calculator.getTotal();
	}
	
	@Override
	public String toString(){
		return "Print";
	}
}
