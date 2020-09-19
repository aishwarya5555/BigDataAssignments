package assignment1.question9;


public class LinkedList {
	private Node head = null;
	private Node tail = null;
	private Node previous = null;

	public void insert(String value) {
		if (head == null) {
			head = new Node(value);
			tail = head;
			previous = head;
		} else {
			Node current = new Node(value);
			tail.next = current;
			tail = current;
		}
	}

	public void removeDuplicate() {
		Node node = head;
		while (node != null) {
			previous = node;
			String serachStr = node.data;
			removeDuplicate(serachStr, node.next);
			node = node.next;
		}
	}

	private void removeDuplicate(String str, Node node) {
		while (node != null) {
			if (str.equals(node.data)) {
				previous.next = node.next;
				node = null;
				node = previous.next;
			} else {
				previous = node;
				node = node.next;
			}
		}
	}
	
	public void traverse() {
		Node node = head;
		System.out.println("Display all elements ::");
		while (node != null) {
			System.out.println(node.data + "  ");
			node = node.next;
		}
	}
}
