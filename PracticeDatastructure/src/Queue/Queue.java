package Queue;

public class Queue {

	private int[] items = new int[10];
	private int head = -1;
	private int tail = -1;

	public boolean isEmpty() {
		return head < 0;
	}

	public void enqueue(int a) {
		if (head == -1 && tail == -1) {
			items[++head] = a = items[++tail];
		} else if (tail == items.length - 1) {
			throw new RuntimeException("Queue is full");
		} else {
			if (isEmpty()) {
				head = head + 1;
			}
			items[++tail] = a;
		}
	}

	public int dequeue() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty!!");
		else {
			return items[head++];
		}
	}

	public int peek() {
		if (isEmpty()) {

		}
		return items[head];
	}

	public void printQueue() {
		while (items[head] != 0) {

			System.out.println(items[head] + " ");
			head++;
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(12);
		q.enqueue(17);
		q.enqueue(73);
		q.enqueue(12);
		q.enqueue(3);
		// System.out.println(q.dequeue());
		q.printQueue();

	}

}
