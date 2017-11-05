package wordTree.driver;

import java.lang.NumberFormatException;
import java.lang.RuntimeException;
import wordTree.store.Results;
import wordTree.util.MyLogger;
import java.util.InputMismatchException;

public class Driver {
	
	public static void main(String[] args) {

		String ipFile = null;
		String opFile = null;
		String[] dlWords = null;
		
		int debugValueSetter = -1;
		
//		FileProcessor fileP = null;
		
		try {
			if(5 == args.length) {
       	        ipFile = args[0];
	            opFile = args[1];
	            
	            final int NUM_THREADS = Integer.parseInt(args[2]);
	            if(!(NUM_THREADS >= 1 && NUM_THREADS <= 3)) {
	            	throw new RuntimeException("Number of threads must be integers between 1 and 3 inclusive");
	            }
	            
	            dlWords = args[3].split("\\s+");
	            if(!(NUM_THREADS == dlWords.length)) {
	            	throw new RuntimeException("Delete words should be same as number of threads");
	            }
	            
	            debugValueSetter = Integer.parseInt(args[4]);
	            if(!(debugValueSetter >= 0 && debugValueSetter <= 4)) {
	            	throw new RuntimeException("Debug value must be integers between 0 and 4 inclusive");
	            }
	            MyLogger.setDebugValue(debugValueSetter);
			}
			else {
				throw new RuntimeException("Invalid number of arguments. Please enter 5 arguments");
			}
		}
		catch (Exception e) {
			System.err.println("exception occurred while parsing arguments");
			e.printStackTrace();
			System.exit(1);
		}

/*		try {
			fileP = new FileProcessor(ipFile);
		}
		catch(FileNotFoundException e) {
			System.err.println(" input file not found.");
			e.printStackTrace();
			System.exit(1);
		}
*/	
		//SecurityFactors secFac = new SecurityFactors(0,0);
		//Results r = new Results(opFile);
		//Driver d = new Driver();
/*
		while((ipWord = fileP.readLine()) != null) {

			try {
								
				r.storeNewResult(d.opRes(secFac));
				
				MyLogger.writeMessage(d.opRes(secFac) + " added to Results", MyLogger.DebugLevel.IN_RESULTS);
			}
			catch(Exception e) {
				System.err.println("Input file nor formatted properly");
				e.printStackTrace();
				System.exit(1);
			}
		}
		*/
/*		try {
			r.writeToFile();
		}
		catch(FileNotFoundException e) {
			System.err.println("Output file cannot be generated");
			e.printStackTrace();
			System.exit(1);
		}*/
	}
}
