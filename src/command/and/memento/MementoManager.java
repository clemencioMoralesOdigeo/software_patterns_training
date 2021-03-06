package command.and.memento;

import java.util.SortedMap;
import java.util.TreeMap;

public class MementoManager<T> {

	private SortedMap<String, T> list = new TreeMap<String, T>();

	public void addMemento(String key, T memento) {
		this.list.put(this.list.size() + ":" + key, memento);
	}

	public T getMemento(String key) {
		return this.list.get(key);
	}

	public String[] keys() {
		return this.list.keySet().toArray(new String[0]);
	}
}