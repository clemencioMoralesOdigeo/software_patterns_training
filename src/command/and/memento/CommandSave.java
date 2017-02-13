package command.and.memento;

public class CommandSave implements Command {

	private CalculatorMementable calculator;
	private MementoManager<MementoCalculator> manager;
	private MementoCalculator mementoCalculator;

	public CommandSave(CalculatorMementable calculator, MementoManager<MementoCalculator> manager) {
		this.calculator = calculator;
		this.manager = manager;
		this.mementoCalculator = null;
	}

	@Override
	public void execute() {
		MementoCalculator mementoCalculator = this.calculator.createMemento();
		this.manager.addMemento("Memento", mementoCalculator);
	}

	public void setMementoCalculator(MementoCalculator mementoCalculator) {
		this.mementoCalculator = mementoCalculator;
	}
	
	@Override
	public String toString(){
		return "sAVE";
	}
}
