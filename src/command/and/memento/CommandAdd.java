package command.and.memento;

public class CommandAdd implements Command {
	
		private Calculator calculator;

		public CommandAdd(Calculator calculator) {
			this.calculator = calculator;
		}

		@Override
		public void execute() {
			this.calculator.add(1);
		}
		
		@Override
		public String toString(){
			return "Add";
		}
}
