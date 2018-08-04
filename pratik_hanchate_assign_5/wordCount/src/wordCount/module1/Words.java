package wordCount.module1;

import java.util.ArrayList;

import wordCount.BinarySearchTree.BinarySearchTree;
import wordCount.BinarySearchTree.Node;

public class Words implements WordsI {

	public ArrayList<Node> nodesArray;
	public ArrayList<String> dup_array;
	public ArrayList<String> distincarray;
	int totalnumofWords;
	int totalnumberofCharacters;
	int uniqueWords;
	int duplicate_num = 0;

	public Words(ArrayList<Node> nodes_in) {
		// TODO Auto-generated constructor stub
		nodesArray = nodes_in;
		
		duplicates();

	}

	public void duplicates() {

		System.out.println("NodeLength"+nodesArray.size());
		
		for (Node node : nodesArray) {

			dup_array=node.duplicate_words;
			distincarray=node.word_array;
			
			for(String s : node.word_array) {
				System.out.println("KKH____________"+s);
			}
			
			
		}
		
		
		

	}

	@Override
	public int noOfWords() {

		for (Node node : nodesArray) {
		
		for(String s : node.word_array) {
			totalnumofWords++;
		}
		
		for(String s: node.duplicate_words) {
			totalnumofWords++;
		}

		}
		
		System.out.println("NUmber of words ="+totalnumofWords);
		
		
		return totalnumofWords;
	}

	@Override
	public int noOfCharacters() {

		
		for (Node node : nodesArray) {
		
		for(String s : node.word_array) {
			totalnumberofCharacters=totalnumberofCharacters+s.length();
		}
		
		for(String s: node.duplicate_words) {
			totalnumberofCharacters=totalnumberofCharacters+s.length();
		}
		
		}

		System.out.println("Number of Characters="+totalnumberofCharacters);
		
		return this.totalnumberofCharacters;
	}

	@Override
	public int noOfDistinctWords() {
		// TODO Auto-generated method stub

		for (Node node : nodesArray) {
		uniqueWords = uniqueWords+node.word_array.size();
		}
		System.out.println("Total no of Distinct Words =" + uniqueWords);

		return uniqueWords;

	}
}