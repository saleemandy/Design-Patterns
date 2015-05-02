package Adapterr;

public class Adapter implements Target, QueueTarget {
	private Adaptee adaptee;
	@Override
	public void push(String str) {
		adaptee.add(str);
	}
	@Override
	public String pop() {
		int end = adaptee.getEnd();
	String str = adaptee.get(end); 
	adaptee.remove(end);
	return str;
	}
	@Override
	public boolean isEmpty() { 
		return adaptee.empty();
	}
	@Override
	public void enqueue(String str) {
		adaptee.add(str);
	}
	@Override
	public String dequeue() {
		int pos = adaptee.getStart();
	String str = adaptee.get(pos);
	adaptee.remove(pos);
	return str;
		
	}
	public String peek() {
		int pos = adaptee.getStart();
		String str = adaptee.get(pos);
		return str;
	}
}
