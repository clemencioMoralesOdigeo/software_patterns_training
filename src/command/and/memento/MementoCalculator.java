package command.and.memento;

public class MementoCalculator {

	private int total;
	
	public MementoCalculator(int total){
		this.total = total;
	}
	
	public int getStatus(){
		return this.total;
	}
}