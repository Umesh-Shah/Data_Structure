package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertAtHead(5);
		list.insertAtHead(51);
		list.insertAtHead(20);
		list.insertAtHead(15);
		list.insertAtHead(10);
		list.insertAtHead(153);

		System.out.println(list);
		System.out.println(list.length());

		list.deleteAtHead();
		System.out.println(list);

		System.out.println(153);
	}

}
