package wordCount.treesForStrings;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import wordCount.util.FileProcessor;

public class TreeBuilder {

	FileProcessor insertfile;

	
	public BinarySearchTree bst;
	public ArrayList<Node> nodes;

	String word="";

	public TreeBuilder(String insertfilex) {

		

		bst = new BinarySearchTree();
		
		insertfile = new FileProcessor(insertfilex);
		nodes= new ArrayList<Node>();
		
		try {
		//	word = insertfile.readLine();
			

			// for insert file operation
			while (word != null) {

				
				word = insertfile.readLine();
				System.out.println("Word is :"+word);
				fillTrees(word);
			}

		
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public ArrayList<Node> getTreeNodes() {
		return this.nodes;
	}

	public String testprint(int tree) {

		String finaloutput = "";
		switch (tree) {
		case 1:
			finaloutput = bst.printNodes();
			System.out.println("ZZ"+bst.nodeArray.size());
			
			this.nodes=bst.nodeArray;
			break;

		default:
			break;
		}

		return finaloutput;

	}

	private void fillTrees(String index) {

		Node main_node = new Node(index);

		Node existing_node = bst.searchNode(index);

		if (existing_node == null) {
			System.out.println("v");
			main_node.addWord(word);
			bst.insertNode(main_node);

		} else {
			existing_node.addWord(word);
			bst.insertNode(existing_node);

		}

	//*	System.out.println("Unique words is :"+existing_node.getUniqueWords());
		
		
	}

}