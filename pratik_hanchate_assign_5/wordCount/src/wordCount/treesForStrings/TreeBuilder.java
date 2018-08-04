package wordCount.treesForStrings;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.util.MyLogger.DebugLevel;

public class TreeBuilder {

	FileProcessor insertfile;

	
	public BinarySearchTree bst;
	public ArrayList<Node> nodes;

	String word="";

	public TreeBuilder(String insertfilex) {

		MyLogger.writeMessage("Constructor TreeBuilder", DebugLevel.CONSTRUCTOR);

		bst = new BinarySearchTree();
		
		insertfile = new FileProcessor(insertfilex);
		nodes= new ArrayList<Node>();
		
		try {
		
			while (word != null) {

				
				word = insertfile.readLine();
			
				if(word!=null)
				fillTrees(word);
			}

		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
			
			main_node.addWord(word);
			bst.insertNode(main_node);

		} else {
			existing_node.addWord(word);
			bst.insertNode(existing_node);

		}


		
		
	}

}