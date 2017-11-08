package wordTree.threadMgmt;

import wordTree.util.FileProcessor;
import wordTree.util.TreeBuilder;
import wordTree.util.MyLogger;

public class PopulateThread implements Runnable{
    
    private String word = null;
    private FileProcessor filepr = null;
    private TreeBuilder tb = null;;
    
    /**
     * PopulateThread constructor
     * @param filep - FileProcessor instance
     * @param tbI - TreeBuilder instance
     */
    public PopulateThread(FileProcessor filep, TreeBuilder tbI) {
    	MyLogger.writeMessage("PopulateThread constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
        filepr=filep;
        tb = tbI;
    }

    public  void run(){
    	MyLogger.writeMessage("PopulateThread's run() method called", MyLogger.DebugLevel.IN_RUN);
        
    	while((word = filepr.readLine()) != null) {
    		
    		try {
                tb.insert(word);
                MyLogger.writeMessage("Word: " + word + " inserted into tree", MyLogger.DebugLevel.IN_RESULTS);
    		}
			
			catch(Exception e) {
				System.err.println("Something went wrong within run method");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}