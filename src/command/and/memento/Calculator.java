package command.and.memento;

public class Calculator {
	private int total;

	public Calculator() {
		this.total = 0;
	}

	public int getTotal() {
		System.out.println("getTotal..." + this.total);
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void add(int value) {
		this.total += value;
		System.out.println("add..." + value + "-->" + this.total);
	}

	public void substract(int value) {
		this.total -= value;
		System.out.println("substract..." + value + "-->" + this.total);
	}

	public void reset() {
		this.total = 0;
		System.out.println("reset..." + this.total);
	}
}
