package wordCount.driver;

import wordCount.util.MyLogger;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputfile=args[0];
		int kmax=Integer.parseInt(args[1]);
	
		int argc=Integer.parseInt(args[2]);
		
		if(!checkArguments(args)) {
			
			throw new RuntimeException("Invalid number of arguments");
		}
		
		MyLogger logger =new MyLogger(argc);
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
