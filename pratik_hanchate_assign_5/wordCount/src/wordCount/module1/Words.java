package wordCount.module1;

import java.util.ArrayList;

import wordCount.BinarySearchTree.BinarySearchTree;
import wordCount.BinarySearchTree.Node;

public class Words implements WordsI {

	public ArrayList<Node> nodesArray;
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

		for (Node node : nodesArray) {

			if (node.isNodeDuplicate) {
				System.out.println("This node is duplicate" + node.getNodeWord() + "D Count is " + node.duplicatecount);
				duplicate_num = node.duplicatecount;

			}
		}

	}

	@Override
	public int noOfWords() {

		for (Node node : nodesArray) {

			totalnumofWords++;

			if (node.isNodeDuplicate) {

				totalnumofWords = totalnumofWords + node.duplicatecount;

			}
		}

		System.out.println("NUmber of words ="+totalnumofWords);
		
		return totalnumofWords;
	}

	@Override
	public int noOfCharacters() {

		for (Node node : nodesArray) {

			totalnumberofCharacters = totalnumberofCharacters + node.getNodeWord().length();

			if (node.isNodeDuplicate) {
				
				duplicate_num = node.duplicatecount;
				totalnumberofCharacters = duplicate_num * node.getNodeWord().length();

			}
		}

		System.out.println("Number of Characters="+totalnumberofCharacters);
		
		return this.totalnumberofCharacters;
	}

	@Override
	public int noOfDistinctWords() {
		// TODO Auto-generated method stub

		uniqueWords = this.nodesArray.size();
		System.out.println("Total no of Unique Words =" + uniqueWords);

		return uniqueWords;

	}
}
