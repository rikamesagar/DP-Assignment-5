package wordCount.treesForStrings;

import java.util.ArrayList;

public class BinarySearchTree implements TreeI {

	Node root;
	int[] output_array;
	String output="";
	
	ArrayList<Node> nodeArray=new ArrayList<Node>();
	ArrayList<String> st_array=new ArrayList<String>();
	

	public BinarySearchTree() {
		root = null;
	}

	public String inorder(Node node) {

		if (node == null)
			return null;

		try {
			inorder(node.getLeftchild());

			

			ArrayList<String> temp_ar = node.getWordArray();
			
			
			
			for (String string : temp_ar) {
			
				
				if(!nodeArray.contains(node.getNode())) {
					nodeArray.add(node.getNode());
					
				}
				
				output = output + "\n" +string;
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
			
			return "";
		}

		output = inorder(root);
		
		

		return output;
	}

	@Override
	public void insertNode(Node newNode) {
		
		
		if (searchNode(newNode.getNodeWord()) == null) {
			if (root == null) {
				root = newNode;
			} else {
				Node curr_node = root;
				Node parent_node;
				while (true) {
					parent_node = curr_node;
					if (newNode.getNodeWord().compareTo(curr_node.getNodeWord()) < 0) {
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
	public Node searchNode(String index) {
		// TODO Auto-generated method stub

		Node current_node = root;

		if (root == null)
			return null;

		while (current_node.getNodeLength() != index.length()) {

			if (index.compareTo(current_node.getNodeWord()) < 0) {
				current_node = current_node.getLeftchild();

			} else if (index.compareTo(current_node.getNodeWord()) > 0) {
				current_node = current_node.getRightchild();
			}

			if (current_node == null)
				return null;
		}

		return current_node;
	}

}