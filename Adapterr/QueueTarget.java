package Adapterr;

public interface QueueTarget {
	public boolean isEmpty();
	public void enqueue(String str);
	public String dequeue();
	public String peek();

}
