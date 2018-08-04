package wordCount.Singleton;

import wordCount.module1.Words;
import wordCount.treesForStrings.TreeBuilder;
import wordCount.util.Results;

public class Singleton {

	 private static Singleton instance = new Singleton();
	 TreeBuilder treeB;
	 int numofCharacters=0;
	 int numOfDistinctWords=0;
	 int numofWords=0;
	 Results results;
	 
	  
	   private Singleton(){}

	   
	   public static Singleton getInstance(){
	      return instance;
	   }

	   public void buildTree(String in) {
		   treeB=new TreeBuilder(in);
		   treeB.testprint(1);
	   }
	   
	   public void doWordOperations() {
		   Words wordoperations=new Words(treeB.getTreeNodes());
			numofCharacters = wordoperations.noOfCharacters();
			numOfDistinctWords=wordoperations.noOfDistinctWords();
			numofWords=wordoperations.noOfWords();
	   }
	   
	   
	   public void writeToStdout(long s) {
		   results.writeToStdout("Total Time :"+s);
	   }
	   
	   public void writeToStdout(String o_in) {
		   String finaloutput="Number of Words:"+numofWords+"\n"+"Number of Distinct Words:"+numOfDistinctWords+"\n"+"Number Of Characters:"+numofCharacters+"\n";
		   results=new Results(o_in, finaloutput);
		   results.writeToStdout(finaloutput);
	   }
	   
	   public void printOutputFile(String o_in) {
		   String finaloutput="Number of Words:"+numofWords+"\n"+"Number of Distinct Words:"+numOfDistinctWords+"\n"+"Number Of Characters:"+numofCharacters+"\n";
		   results=new Results(o_in, finaloutput);
		   results.writeToFile(finaloutput);
	   }
	   
}
