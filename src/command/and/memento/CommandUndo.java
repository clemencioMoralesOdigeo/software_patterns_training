package command.and.memento;

public class CommandUndo implements Command {

	private CalculatorMementable calculator;
	private MementoManager<MementoCalculator> manager;
	private MementoCalculator mementoCalculator;

	public CommandUndo(CalculatorMementable calculator, MementoManager<MementoCalculator> manager) {
		this.calculator = calculator;
		this.manager = manager;
		this.mementoCalculator = null;
	}

	public void setMementoCalculator(MementoCalculator mementoCalculator) {
		this.mementoCalculator = mementoCalculator;
	}

	@Override
	public void execute() {
		this.calculator.restoreMemento(this.mementoCalculator);
	}
	
	@Override
	public String toString(){
		return "Undo";
	}
}
