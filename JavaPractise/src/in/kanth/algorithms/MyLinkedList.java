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

			Node travnode = head;
			while (travnode.next != null) {

				travnode = travnode.next;

			}
			travnode.next = node;

		}
	}

	public void showList() {

		Node travnode = head;
		while (travnode.next != null) {

			System.out.println(travnode.data);
			travnode = travnode.next;

		}
		System.out.println(travnode.data);

	}

}

class Node {
	Node next;
	int data;

}