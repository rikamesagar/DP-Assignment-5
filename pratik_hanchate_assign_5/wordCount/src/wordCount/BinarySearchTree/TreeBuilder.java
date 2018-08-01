package wordCount.BinarySearchTree;

import javax.management.RuntimeErrorException;


import wordCount.util.FileProcessor;

public class TreeBuilder {

	FileProcessor insertfile;
	FileProcessor deletefile;
	TreeI mastertree;
	BinarySearchTree bst;
	BinarySearchTree backup_tree_1;
	BinarySearchTree backup_tree_2;
	String line;
	int element;
	String course;

	public TreeBuilder(String insertfilex, String deletefilex) {

		mastertree = new BinarySearchTree();
		backup_tree_1=new BinarySearchTree();
		backup_tree_2=new BinarySearchTree();
		
		bst= new BinarySearchTree();
		insertfile = new FileProcessor(insertfilex);
		deletefile=new FileProcessor(deletefilex);

		try {
			line = insertfile.readLine();
			
			//for insert file operation
			while (line != null) {
				element=getBNumber(line);
				course=getCourse(line);
				//System.out.println("Number is :"+element);
				line=insertfile.readLine();
				fillTrees(element);
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
		case 2:
			finaloutput=backup_tree_1.printNodes();
			break;
		
		case 3:
			finaloutput=backup_tree_2.printNodes();
		
		default:
			break;
		}
		
		return finaloutput;
		
		
	
	}

	private int getBNumber(String sIn) {
		
		String []sin= sIn.split(":");
		int number=Integer.parseInt(sin[0]);
		
		if(number>9999) {
			System.out.println("BNUMBER invalid ");
			System.exit(1);
			
		}
			
		
		return number;

	}
	
	
	
	
	
	
	private void fillTrees(String index) {
		
		Node main_node=new Node(index);
		
		
		Node existing_node=bst.searchNode(index);
		
		if(existing_node==null) {
			main_node.addCourse(course);
		
			Node b_node1=main_node.clone();
			Node b_node2=main_node.clone();
			main_node.setObserver(b_node1);
			main_node.setObserver(b_node2);	
		
		bst.insertNode(main_node);
		backup_tree_1.insertNode(b_node1);
		backup_tree_2.insertNode(b_node2);
		
			
		
	}else {
		existing_node.addCourse(course);
		bst.insertNode(existing_node);
		
		
	}
	}

}
