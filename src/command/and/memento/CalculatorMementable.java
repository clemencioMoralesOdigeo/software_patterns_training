package command.and.memento;

public class CalculatorMementable extends Calculator implements Mementable <MementoCalculator>{
	
	@Override
	public MementoCalculator createMemento(){
		return new MementoCalculator(this.getTotal());
	}
	
	@Override
	public void restoreMemento(MementoCalculator memento){
		this.setTotal(memento.getStatus());
		System.out.println("Restoring"+"-->"+this.getTotal());
	}
}
