//Niall Lee
//17336146
//leen1@tcd.ie

class Node {

	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}

public class LowestCommonAncestor {
	
	Node root;

	Node findLowestCommonAncestor(int node1, int node2) {

		return findLowestCommonAncestor(root, node1, node2);
	}

	Node findLowestCommonAncestor(Node node, int node1, int node2) {

		if (node == null) {
			return null;
		}

		if (node.data == node1 || node.data == node2) {
			return node;
		}

		Node left = findLowestCommonAncestor(node.left, node1, node2);
		Node right = findLowestCommonAncestor(node.right, node1, node2);

		if (left != null && right != null) {
			return node;
		}

		if (left != null) {
			return left;
		} else {
			return right;
		}
	}	
}
