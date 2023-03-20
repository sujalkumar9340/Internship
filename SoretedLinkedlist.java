public class SortedLinkedList {
	Node head;

	// Node class for linked list
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Method to insert a new node in sorted linked list
	void sortedInsert(int newData) {
		Node newNode = new Node(newData);
		Node current;
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			current = head;
			while (current.next != null && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	// Method to print the linked list
	void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	// Main method to test sortedInsert method
	public static void main(String[] args) {
		SortedLinkedList list = new SortedLinkedList();
		list.sortedInsert(3);
		list.sortedInsert(1);
		list.sortedInsert(7);
		list.sortedInsert(4);
		list.sortedInsert(2);
		System.out.println("Sorted Linked List:");
		list.printList();
	}
}
