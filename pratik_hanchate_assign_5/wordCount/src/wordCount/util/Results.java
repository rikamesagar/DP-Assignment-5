package wordCount.util;

/**
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import wordCount.util.MyLogger.DebugLevel;





/**
 * Results class to print out the results to file and Standard Output
 */
public class Results implements StdoutDisplayInterface,FileDisplayInterface{


	FileWriter filewriter;
	BufferedWriter bw;
	//private String TAG="Results";
	public String outputresult;
	private static final int TAG=2;
	
	MyLogger logger =new MyLogger(TAG);

	/**
	 * Constructor for the Results class
	 * @param outputfile parameter for the output file
	 * @param outputstring parameter for the string to be printed
	 */
	public Results(String outputfile, String outputstring) {
		try {
						 
			filewriter=new FileWriter(outputfile);
			bw= new BufferedWriter(filewriter);
			this.outputresult=outputstring;
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(TAG+"Exception in File writing");
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * Method to write the output to Standard Output
	 * @param s
	 */
	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub
		
		System.out.println(s);
		
	}

	/**
	 * Method to write the output to File
	 * @param s
	 */
	@Override
	public void writeToFile(String s) {
		// TODO Auto-generated method stub
	
		try {
			
			bw.write(s);
			MyLogger.writeMessage("Write to file",DebugLevel.READ);
						
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(TAG+"Exception in write to File");
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
