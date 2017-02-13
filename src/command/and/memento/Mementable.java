package command.and.memento;

public interface Mementable<T> {
	
	T createMemento();

	void restoreMemento(T memento);
}