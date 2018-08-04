package wordCount.util;

public class MyLogger {

	private static DebugLevel debugLevel;
	
	public static Results results;
	String opstring="";

	public MyLogger(int level) {
		
		MyLogger.setDebugValue(level);
	
	}

	public static enum DebugLevel {
		NONE,CONSTRUCTOR, READ, RESULTS ,TREE
	};

	public static void setDebugValue(int levelIn) {

		switch (levelIn){
			case 0: debugLevel = DebugLevel.NONE; break;
			case 1: debugLevel = DebugLevel.CONSTRUCTOR; break;
			case 2: debugLevel = DebugLevel.READ; break;
			case 3: debugLevel = DebugLevel.RESULTS; break;
			case 4:	debugLevel = DebugLevel.TREE; break;

		
		}
	}
	
	 public static void setDebugValue (DebugLevel levelIn) {
			debugLevel = levelIn;
		    }

	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel) {
			System.out.println(message);

		}

	}
	
	public  static String getfinaloutputstring() {
		return "";
	}	
		

	public String toString() {
		return "The debug level has been set to : " + debugLevel;
	}



}
