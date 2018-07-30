package wordCount.BinarySearchTree;

import java.util.ArrayList;

public class Node{

	public String word;
	public ArrayList<String> courses;
	Node leftchild;
	Node rightchild;
	int wordCount;
	int distinctwords;
	int charactercount;
	
	
	public Node(String word_in) {
		word=word_in;
		courses=new ArrayList<String>();
		
		leftchild=rightchild=null;
		
	}
	
	
	
	
	
	
	







	public String getNodeWord() {
		return word;
	}

	public  void setNodeWord(String w_in) {
		
		this.word=w_in;
	}



	public int getNodeLength() {
		
		
		return 0;
	}






	public ArrayList<String> getCourses() {
		return courses;
	}






	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
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




	public void addCourse(String in) {
		
		this.courses.add(in);
		
	}
	
	public void deleteCourse(String in) {
		
		if(courses.contains(in)) {
			courses.remove(in);
		}
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
