package wordCount.driver;

import wordCount.BinarySearchTree.TreeBuilder;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class Driver {

	public static void main(String[] args) {
		
		String inputFile="input.txt" ;
		String outputFile="output.txt";
		
		
		TreeBuilder treeB=new TreeBuilder(inputFile);
		
		
		/**
		 *Code to check the files if/ if not passed through arguments
		 */
		
//		try {
//			inputFile = args[0];
//			if (!(inputFile.equals("input.txt"))) {
//				System.out.println("Input File not found, please check!");
//				System.exit(0);
//			}
//		} catch (Exception e) {
//			System.out.println("Output File not Found, please check!");
//			System.exit(0);
//		}


		

		
		//MyLogger logger =new MyLogger(1);
		
		
				
		
		
		
		
	}
	
public static boolean checkArguments(String arg[]) {
		
		if(arg.length<=2) {
			return false;
		}
		
		int var=Integer.parseInt(arg[2]);
		
		
		if(var>3|| var<0) {
			return  false;
		}
		
		return true ;
		
	}

	
	

	
}
