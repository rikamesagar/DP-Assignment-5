package wordCount.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import wordCount.util.MyLogger.DebugLevel;




public class Results implements StdoutDisplayInterface,FileDisplayInterface{


	FileWriter filewriter;
	BufferedWriter bw;
	//private String TAG="Results";
	public String outputresult;
	private static final int TAG=2;
	
	MyLogger logger =new MyLogger(TAG);

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
	
	
	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub
		
		System.out.println(s);
		
	}


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
