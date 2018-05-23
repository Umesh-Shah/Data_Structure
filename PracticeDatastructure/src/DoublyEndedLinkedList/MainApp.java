package DoublyEndedLinkedList;

public class MainApp {

	public static void main(String[] args) {

		DoublyEndedList dList = new DoublyEndedList();
		dList.insertAtTail(5);
		dList.insertAtHead(100);
		dList.insertAtTail(29);
		dList.insertAtTail(2);
		dList.insertAtTail(9);

		System.out.println(dList);
	}
}
