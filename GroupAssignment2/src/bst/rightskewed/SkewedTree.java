package bst.rightskewed;

public class SkewedTree {
	Node node = null;

	private Node rightRotate(Node root) {
		if (root == null || root.left == null) {
			return root;
		}

		Node newRoot = root.left;
		root.left = newRoot.right;
		newRoot.right = root;
		return newRoot;
	}

	Node convertToRightSkewedTree(Node root) {
		if (root == null) {
			return null;
		}

		root.left = convertToRightSkewedTree(root.left);

		while (root.left != null) {
			root = rightRotate(root);
		}

		root.right = convertToRightSkewedTree(root.right);

		return root;
	}

	void displayRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.key + " ");
		displayRightSkewedTree(root.right);
	}
}
