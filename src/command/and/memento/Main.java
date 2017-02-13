package command.and.memento;

import java.util.HashSet;
import java.util.Set;

public class Main {
	private Set<Command> commands = new HashSet<Command>();

	public void add(Command command) {
		this.commands.add(command);
	}

	public void executeAdd(Calculator calculator) {
		Command command = new CommandAdd(calculator);
		command.execute();
	}

	public static void main(String[] args) {
		CalculatorMementable calc = new CalculatorMementable();
		Main manager = new Main();
		MementoManager<MementoCalculator> mementoManager = new MementoManager<MementoCalculator>();
		manager.add(new CommandAdd(calc));
		manager.add(new CommandSubstract(calc));
		manager.add(new CommandReset(calc));
		manager.add(new CommandPrint(calc));
		manager.add(new CommandSave(calc, mementoManager));
		manager.add(new CommandUndo(calc, mementoManager));
		manager.executeAdd(calc);
		manager.executeAdd(calc);
		Command commandSave = new CommandSave(calc, mementoManager);
		commandSave.execute();

	}
}
