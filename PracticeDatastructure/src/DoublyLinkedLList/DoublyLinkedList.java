package DoublyLinkedLList;

import DoublyLinkedLList.Node;

public class DoublyLinkedList {

	private Node head;

	public void insert(int data) {

		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}

		this.head = newNode;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		Node n = this.head;
		while (n != null) {

			sb.append("Node Data: ");
			sb.append(n);
			sb.append("\n");

			n = n.getNextNode();
		}

		return sb.toString();

	}

}
