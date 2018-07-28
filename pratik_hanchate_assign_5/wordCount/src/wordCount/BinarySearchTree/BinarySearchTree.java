package wordCount.BinarySearchTree;

import java.util.ArrayList;

public class BinarySearchTree implements TreeI {

	Node root;
	String course = "";
	String output = "";

	public BinarySearchTree() {
		root = null;
	}

	public String inorder(Node node) {

		if (node == null)
			return null;

		try {
			inorder(node.getLeftchild());

			

			ArrayList<String> temp_ar = node.getCourses();
			
			for (String string : temp_ar) {
				
				output = output + "\n" + node.getNodeIndex() + ":" + string;
			}

			inorder(node.getRightchild());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(1);
		}

		return output;
	}

	public String printNodes() {

		String output = "";

		if (root == null) {
			System.out.println("Tree is empty");
			return "";
		}

		output = inorder(root);

		return output;
	}

	@Override
	public void insertNode(Node newNode) {
		int index = newNode.getNodeIndex();
		if (searchNode(index) == null) {
			if (root == null) {
				root = newNode;
			} else {
				Node curr_node = root;
				Node parent_node;
				while (true) {
					parent_node = curr_node;
					if (index < curr_node.getNodeIndex()) {
						curr_node = curr_node.getLeftchild();
						if (curr_node == null) {
							parent_node.setLeftchild(newNode);
							break;
						}
					} else {
						curr_node = curr_node.getRightchild();
						if (curr_node == null) {
							parent_node.setRightchild(newNode);
							break;
						}
					}
				}
			}
		}

	}

	@Override
	public Node deleteNode(Node n) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Node searchNode(int index) {
		// TODO Auto-generated method stub

		Node current_node = root;

		if (root == null)
			return null;

		while (current_node.getNodeIndex() != index) {

			if (index < current_node.getNodeIndex()) {
				current_node = current_node.getLeftchild();

			} else if (index > current_node.getNodeIndex()) {
				current_node = current_node.getRightchild();
			}

			if (current_node == null)
				return null;
		}

		return current_node;
	}

}
