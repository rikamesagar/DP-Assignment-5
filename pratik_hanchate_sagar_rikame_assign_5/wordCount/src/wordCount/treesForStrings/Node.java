package wordCount.treesForStrings;

import java.util.ArrayList;

import wordCount.util.MyLogger;
import wordCount.util.MyLogger.DebugLevel;

public class Node{

	public String word;
	public ArrayList<String> word_array;
	public ArrayList<String> duplicate_words;
	Node leftchild;
	Node rightchild;
	int wordCount;
	int uniquewords;
	
	public boolean isNodeDuplicate=false;
	public int duplicatecount=0;
	
	public Node(String word_in) {
		word=word_in;
		word_array=new ArrayList<String>();
		duplicate_words=new ArrayList<String>();
		
		leftchild=rightchild=null;
		MyLogger.writeMessage("Constructor of Node", DebugLevel.CONSTRUCTOR);
		
	}
	
	public ArrayList<String> getWordArray() {
		
		return this.word_array;
	}
	
	public Node getNode() {
		
		return this;
		
	}
	
	public void addWord(String s) {
		
		
		
		if(word_array.contains(s)) {
			this.uniquewords=this.uniquewords-1;
			this.isNodeDuplicate=true;
			this.duplicatecount++;
			duplicate_words.add(s);
		}else {
			this.word_array.add(s);
		}
		
	}
	
	
	
	
	public int getUniqueWords() {
		
		int unique=getWordArray().size()+this.uniquewords;
		
		return unique;
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


		
		
	


	
	
	
}