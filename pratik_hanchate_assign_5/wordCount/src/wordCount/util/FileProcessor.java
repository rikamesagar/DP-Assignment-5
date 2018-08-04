package wordCount.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import wordCount.util.MyLogger.DebugLevel;

public class FileProcessor {

	BufferedReader br;
	FileReader filereader;
	StringTokenizer tokenizer;
	String token;
	String delimiter = " .";
	String line = "";

	/**
	 * Constructor
	 * 
	 * @param input_filename
	 */
	public FileProcessor(String input_filename) {

		MyLogger.writeMessage("Constructor of FileProcessor", DebugLevel.CONSTRUCTOR);
		
		try {
			filereader = new FileReader(input_filename);
			br = new BufferedReader(filereader);
		//	line=br.readLine();
			tokenizer = new StringTokenizer(line, delimiter);

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

		MyLogger.writeMessage("Read From File", DebugLevel.READ);
		try {

			

			String wordx = readWord(line);

			if(wordx==null) {
				line = br.readLine();
				
				if(line!=null) {
				tokenizer = new StringTokenizer(line, delimiter);
				wordx=readWord(line);
				}
			}
			
			
			return wordx;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in reading File");
			e.printStackTrace();
			return null;
		}

	}

	public String readWord(String line) {
		
		if(line==null)
			return null;
		
		try {

			token = tokenizer.nextToken();
		    return token;

		} catch (Exception e) {
			// TODO: handle exception
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
