package wordCount.BinarySearchTree;

import javax.management.RuntimeErrorException;


import wordCount.util.FileProcessor;

public class TreeBuilder {

	FileProcessor insertfile;
	
	TreeI mastertree;
	BinarySearchTree bst;
	BinarySearchTree backup_tree_1;
	BinarySearchTree backup_tree_2;
	
	String word;
	

	public TreeBuilder(String insertfilex) {

		mastertree = new BinarySearchTree();
		
		
		bst= new BinarySearchTree();
		insertfile = new FileProcessor(insertfilex);
		

		try {
			word = insertfile.readLine();
			
			//for insert file operation
			while (word != null) {
				
				
				//System.out.println("Number is :"+element);
				word=insertfile.readLine();
				fillTrees(word);
			}
			
			
		
			
			
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public String testprint(int tree) {
		
		String finaloutput="";
		switch (tree) {
		case 1:
			finaloutput=bst.printNodes();
			
			break;
		
		default:
			break;
		}
		
		return finaloutput;
		
		
	
	}


	
	
	
	
	
	
	private void fillTrees(String index) {
		
		Node main_node=new Node(index);
		
		
		Node existing_node=bst.searchNode(index);
		
		if(existing_node==null) {
			main_node.addWord(word);
		
			
			
		
		bst.insertNode(main_node);
		
		
			
		
	}else {
		existing_node.addWord(word);
		bst.insertNode(existing_node);
		
		
	}
	}

}
