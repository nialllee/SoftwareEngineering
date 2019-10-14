public class lowestCommonAncestor{
	
	class Node{

	Node root;

	Node findLCA(int node1, int node2) {

		return findLCA(root, node1, node2);
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
