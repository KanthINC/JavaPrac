package in.kanth.algorithms;

public class MyLinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {

			
		}
	}

}

class Node {
	Node next;
	int data;

}