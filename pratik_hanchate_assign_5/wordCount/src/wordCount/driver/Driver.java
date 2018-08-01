package wordCount.driver;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputfile="input.txt";
		
		String outputfile="output.txt";
	
		
		
		if(!checkArguments(args)) {
			
			throw new RuntimeException("Invalid number of arguments");
		}
		
		MyLogger logger =new MyLogger(1);
		
		
		FileProcessor fileprocessor =new FileProcessor(inputfile);
		
		
		
		
		
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
