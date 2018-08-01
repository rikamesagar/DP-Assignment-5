package wordCount.driver;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class Driver {

	public static void main(String[] args) {
		String inputFile = null;
		String outputFile = null;
		int noOfIterations;
		/**
		 *Code to check the files if/ if not passed through arguments
		 */
		try {
			inputFile = args[0];
			if (!(inputFile.equals("input.txt"))) {
				System.out.println("Input File not found, please check!");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Output File not Found, please check!");
			System.exit(0);
		}
<<<<<<< HEAD
		try {
			outputFile = args[1];
			if (!(outputFile.equals("delete.txt"))) {
				System.out.println("Delete File not found, please check!");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("No file present to delete values from Nodes");
			System.exit(0);
=======
		
		MyLogger logger =new MyLogger(1);
		
		
		FileProcessor fileprocessor =new FileProcessor(inputfile);
		
		
		
		
		
	}
	
	
	
public static boolean checkArguments(String arg[]) {
		
		if(arg.length<=2) {
			return false;
>>>>>>> 85a0553876bf4736b6f42381f2a7cd78166e907c
		}
		try {
			noOfIterations = Integer.parseInt(args[2]);
		}
		} catch(NumberFormatException e) {

			System.out.println("No. Of Iterations is not a number.");
            System.exit(0);
		}

		MyLogger logger = new MyLogger(1);


			FileProcessor fileprocessor = new FileProcessor(inputfile);


		}

	}
}
