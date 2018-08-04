package wordCount.driver;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.Singleton.Singleton;
import wordCount.module1.Words;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.util.Results;

public class Driver {

	public static void main(String[] args) {
		
		String inputFile="input.txt" ;
		String outputFile="output.txt";
		int NUM_OF_ITERATIONS=400;
		//int debugval=Integer.parseInt(args[3]);
		
		long totaltime=0;
		
		MyLogger logger =new MyLogger(1);
		
		long startTime = System.currentTimeMillis();
		System.out.println("Start time:"+startTime);
		
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
			
			System.out.println("Start Time :"+startTime);
			System.out.println("Finish Time :"+finishTime);
			
			totaltime=(finishTime-startTime)/NUM_OF_ITERATIONS;
			
			
			
			singleobj.writeToStdout(totaltime);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		


		

		
		
		
		
				
		
		
		
		
	}
	
	
	
	
public boolean checkArguments(String arg[]) {
	
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