package assignment1.question10;

public class LinkedList {
	private Node head = null;
	private Node tail = null;
	private Node previous = null;

	public void insert(int value) {
		if (head == null) {
			head = new Node(value);
			tail = head;
			previous = head;
		} else {
			Node current = new Node(value);
			tail.next = current;
			previous = tail;
			tail = current;
		}
	}

	public void replaceLastNode() {
		if(head == previous) {
			head = null;
			previous = null;
			head = tail;
			previous = tail;
		} else if(head.next != null) {
			tail.next = head.next;
			head = null;
			previous.next = null;
			head = tail;
			tail = previous;
		}
	}

	public void traverse() {
		Node node = head;
		System.out.println("Display all elements ::");
		while (node != null) {
			System.out.print(node.data + "  ");
			node = node.next;
		}
	}
}
