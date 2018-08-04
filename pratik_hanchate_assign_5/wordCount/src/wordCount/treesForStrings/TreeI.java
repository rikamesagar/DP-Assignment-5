package wordCount.treesForStrings;

public interface TreeI {

	void insertNode(Node n);
	Node deleteNode(Node n);
	Node searchNode(String word);
}
