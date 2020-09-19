package assignment1.question2;

public class Tree {
	private Node root = null;

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		}
		insert(root, value);
	}

	private void insert(Node node, int value) {
		if (value < node.data) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.data);
				node.left = new Node(value);
			}
		} else if (value > node.data) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.data);
				node.right = new Node(value);
			}
		}
	}

	public Node search(int key) {
		return search(root, root, key);
	}

	// recursive search function
	public Node search(Node node, Node parent, int key) {
		// Base Cases: root is null or key is present at root
		if (node == null)
			return node;
		if (node.data == key)
			return parent;
		// val is greater than root's key
		if (node.data > key) {
			return search(node.left, node, key);
		} else {
			// val is less than root's key
			return search(node.right, node, key);
		}
	}

}
