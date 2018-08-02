package wordCount.BinarySearchTree;

import javax.management.RuntimeErrorException;

import wordCount.util.FileProcessor;

public class TreeBuilder {

	FileProcessor insertfile;

	
	BinarySearchTree bst;
	

	String word;

	public TreeBuilder(String insertfilex) {

		

		bst = new BinarySearchTree();
		insertfile = new FileProcessor(insertfilex);

		try {
			word = insertfile.readLine();

			// for insert file operation
			while (word != null) {

				System.out.println("Word is :"+word);
				word = insertfile.readLine();
				fillTrees(word);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String testprint(int tree) {

		String finaloutput = "";
		switch (tree) {
		case 1:
			finaloutput = bst.printNodes();

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

	}

}
