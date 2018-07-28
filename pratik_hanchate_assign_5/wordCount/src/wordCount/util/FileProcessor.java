package wordCount.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {





	BufferedReader br;
	FileReader filereader;
	
	/**
	 * Constructor
	 * @param input_filename
	 */
	public FileProcessor(String input_filename) {
		
		try {
			filereader=new FileReader(input_filename);
			br=new BufferedReader(filereader);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in reading File");
			e.printStackTrace();
		}
		
		
	}
	
	
	
		
	/**
	 * @return String
	 */
	public String readLine() {
		
		try {
			
			String line= br.readLine();
			return line;
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception in reading File");
			e.printStackTrace();
			return null;
		}
		

		
		
	}
	
	
	public void close() {
		
		try {
			
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
