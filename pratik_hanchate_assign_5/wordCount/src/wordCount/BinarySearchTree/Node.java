package wordCount.BinarySearchTree;

import java.util.ArrayList;

public class Node{

	public int bnumber;
	public ArrayList<String> courses;
	Node leftchild;
	Node rightchild;
	public ArrayList<ObserverI> observers;
	
	public Node(int b_in) {
		bnumber=b_in;
		courses=new ArrayList<String>();
		observers=new ArrayList<ObserverI>();
		leftchild=rightchild=null;
		
	}
	
	
	
	
	
	
	






	public int getNodeIndex() {
		return bnumber;
	}






	public void setNodeIndex(int bnumber) {
		this.bnumber = bnumber;
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
