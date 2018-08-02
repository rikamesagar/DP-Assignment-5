package wordCount.BinarySearchTree;

import java.util.ArrayList;

public class Node{

	public String word;
	public ArrayList<String> word_array;
	Node leftchild;
	Node rightchild;
	int wordCount;
	int distinctwords;
	int charactercount;
	
	
	public Node(String word_in) {
		word=word_in;
		word_array=new ArrayList<String>();
		
		leftchild=rightchild=null;
		
	}
	
	public ArrayList<String> getWordArray() {
		
		for (String string : word_array) {
		
			System.out.println("A:"+string);
			
		}
		
		return word_array;
	}
	
	
	public void addWord(String s) {
		
		this.word_array.add(s);
	}
	
	
	
	public void deleteWord(String s) {
		
		if(word_array.contains(s))
		this.word_array.remove(s);
		
	}
	
	

	public String getNodeWord() {
		return word;
	}

	
	public  void setNodeWord(String w_in) {
		
		this.word=w_in;
	}



	public int getNodeLength() {
		
		
		return this.word.length();
	}



	public Node getLeftchild() {
		return leftchild;
	}






	public void setLeftchild(Node leftchild) {
		this.leftchild = leftchild;
	}






	public Node getRightchild() {
		return rightchild;
	}






	public void setRightchild(Node rightchild) {
		this.rightchild = rightchild;
	}


		
		
	public Node clone() {
		
		Node temp = null;
		  try{
		  temp = (Node) super.clone();
		  } catch (Exception e){
		  e.printStackTrace();
		  System.exit(1);
		  }
		  return temp;
		
	}


	
	
	
}
