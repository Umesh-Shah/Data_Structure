package LinkedList;

public class LinkedList {
	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}

	public Node find(int value) {

		Node current = this.head;
		while (current != null) {
			if (current.getData() == value) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	public int length() {
		int counter = 0;
		Node current = this.head;
		while (current != null) {
			counter++;
			current = current.getNextNode();
		}
		return counter;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		return result + "}";
	}
}
