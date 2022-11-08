package pairSumBST;

import java.util.ArrayList;

class BSTUtil {

	Node parentNode;

	BSTUtil() {
		parentNode = null;
	}

	void getInorder() {
		inorderTravel(this.parentNode);
	}

	Node insertNode(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insertNode(root.left, data);
		else if (data > root.data)
			root.right = insertNode(root.right, data);

		return root;
	}

	void insert(int key) {
		parentNode = insertNode(parentNode, key);
	}

	void inorderTravel(Node node) {
		if (node == null) {
			return;
		}
		inorderTravel(node.left);
		System.out.print(node.data + " ");
		inorderTravel(node.right);
	}

	void treeToInorderList(Node node) {

		if (node == null)
			return;

		treeToInorderList(node.left);
		pairList.add(node.data);
		treeToInorderList(node.right);
	}

	ArrayList<Integer> pairList = new ArrayList<>();

	public void findPairSum(Node node, int num) {

		treeToInorderList(node);

		int start = 0, end = pairList.size() - 1;
		while (start < end) {
			if (pairList.get(start) + pairList.get(end) == num) {
				System.out.println("Sum = " + num);
				System.out.println("Pair is (" + pairList.get(start) + "," + pairList.get(end) + ")");
				System.exit(0);
			}
			if (pairList.get(start) + pairList.get(end) > num) {
				end--;
			}
			if (pairList.get(start) + pairList.get(end) < num) {
				start++;
			}
		}
		System.out.println("No such pair of values are found.");
	}
}
