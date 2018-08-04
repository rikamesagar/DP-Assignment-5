package wordCount.driver;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.Singleton.Singleton;
import wordCount.module1.Words;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.util.Results;

public class Driver {

	public static void main(String[] args) {
		
		
		if(!checkArguments(args)) {
			System.out.println("Invalid Arguments");
			System.exit(0);
		}
		
		
		String inputFile=args[0] ;
		String outputFile=args[1];
		int NUM_OF_ITERATIONS=Integer.parseInt(args[2]);
		int debugval=Integer.parseInt(args[3]);
		
		double totaltime=0;
		
		MyLogger logger =new MyLogger(debugval);
		
		long startTime = System.currentTimeMillis();
		
		
		Singleton singleobj= Singleton.getInstance();

		try {

			  for(int i=0;i<=NUM_OF_ITERATIONS;i++) {
			
				  //all the initialization
				    singleobj.buildTree(inputFile);
				//all the module operations	
				    singleobj.doWordOperations();
					
			  }

			  singleobj.writeToStdout(outputFile);
			  singleobj.printOutputFile(outputFile);
			long finishTime = System.currentTimeMillis();
			
			
			
			totaltime=(double)(finishTime-startTime)/NUM_OF_ITERATIONS;
			
			
			
			
			singleobj.writeToStdout(totaltime);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		


		

		
		
		
		
				
		
		
		
		
	}
	
	
	//comand Line Validation
	
public static boolean checkArguments(String arg[]) {
	
	try {
		
		if(arg.length!=4) {
			return false;
			
		}
		
		int var=Integer.parseInt(arg[2]);
		int vard=Integer.parseInt(arg[3]);
		
		if(vard<0 || vard>4) {
			System.out.println("Value of debug should be more than zero and less than 4");
			return false;
		}
		
		if(var<0) {
			System.out.println("Value of N should be more than zero");
			return false;
		}
		
		if(!arg[1].equals("input.txt")) {
			System.out.println("Value of N should be more than zero");
			return false;
		}
		
		if(!arg[1].equals("output.txt")) {
			System.out.println("Value of N should be more than zero");
			return false;
		}
		
		
		
	} catch (NumberFormatException e) {
		// TODO: handle exception
		e.printStackTrace();
		System.exit(0);
	}
	 catch (IllegalArgumentException e) {
		 e.printStackTrace();
		 System.exit(0);
	 }
	
	
	   return true;
		
		
		
	}

	
	

	
}