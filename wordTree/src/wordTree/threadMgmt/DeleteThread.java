package wordTree.threadMgmt;

import wordTree.util.FileProcessor;
import wordTree.util.TreeBuilder;
import wordTree.util.MyLogger;

public class DeleteThread implements Runnable{
    
	private String word = null;
    private TreeBuilder tb = null;
        
    /**
     * DeleteThread constructor
     * @param tbI - TreeBuilder instance
     * @param wordI - word to be deleted
     */
    public DeleteThread(TreeBuilder tbI, String wordI) {
    	MyLogger.writeMessage("DeleteThread constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
        tb = tbI;
        word = wordI;
    }

    public void run(){
    	MyLogger.writeMessage("DeleteThread's run() method called", MyLogger.DebugLevel.IN_RUN);
    	tb.delete(word);
	}
}