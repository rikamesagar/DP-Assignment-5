package wordCount.module1;

import java.util.ArrayList;

import wordCount.treesForStrings.BinarySearchTree;
import wordCount.treesForStrings.Node;
import wordCount.util.MyLogger;
import wordCount.util.MyLogger.DebugLevel;

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
		MyLogger.writeMessage("Constructor of Words", DebugLevel.CONSTRUCTOR);

	}

	public void duplicates() {

		for (Node node : nodesArray) {

			dup_array = node.duplicate_words;
			distincarray = node.word_array;

		}

	}

	@Override
	public int noOfWords() {

		for (Node node : nodesArray) {

			for (String s : node.word_array) {
				totalnumofWords++;
			}

			for (String s : node.duplicate_words) {
				totalnumofWords++;
			}

		}

		return totalnumofWords;
	}

	@Override
	public int noOfCharacters() {

		for (Node node : nodesArray) {

			for (String s : node.word_array) {
				totalnumberofCharacters = totalnumberofCharacters + s.length();
			}

			for (String s : node.duplicate_words) {
				totalnumberofCharacters = totalnumberofCharacters + s.length();
			}

		}

		return this.totalnumberofCharacters;
	}

	@Override
	public int noOfDistinctWords() {
		// TODO Auto-generated method stub

		for (Node node : nodesArray) {
			uniqueWords = uniqueWords + node.word_array.size();
		}

		return uniqueWords;

	}
}