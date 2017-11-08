package wordTree.threadMgmt;

import wordTree.store.Results;
import wordTree.util.FileProcessor;
import wordTree.util.TreeBuilder;
import wordTree.util.MyLogger;

public class CreateWorkers {
    
    private String word = null;
    private FileProcessor fpthread = null;
    private TreeBuilder tb = null;
    private Results rthread = null;
    
    /**
     * constructor of CreateWorkers
     * @param filep - FileProcessor instance
     * @param r - Results instance
     * @param tbI - TreeBuilder instance
     */
    public CreateWorkers(FileProcessor filep, Results r, TreeBuilder tbI ) {
    	MyLogger.writeMessage("CreateWorkers constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
        fpthread = filep;
        tb = tbI;
        rthread = r;
    }
    
    /**
     * method to start populating workers
     * @param numthreads - number of threads
     */  
	public void startPopulateWorkers(int numthreads) {
		
		    Thread t[] = new Thread[numthreads];
            for(int i = 0; i < numthreads; i++) {
                t[i] = new Thread(new PopulateThread(fpthread, tb));
                t[i].start();
            }
            
            try{
            	for(int i = 0;i < numthreads; i++) {
                t[i].join();
            	}
            }
            catch(InterruptedException e) {
            	System.err.println("thread is interrupted");
    			e.printStackTrace();
    			System.exit(1);
            }
	}
	
	/**
	 * method to start delete workers
	 * @param numthreads - number of threads
	 * @param delwords - array of words to be deleted
	 */
	public void startDeleteWorkers(int numthreads, String[] delwords) {
		            
            Thread t[] = new Thread[numthreads];
            for(int i = 0; i < numthreads; i++) {
                t[i] = new Thread(new DeleteThread(tb, delwords[i]));
                t[i].start();          
            }
            
            try {
            	for(int i = 0; i < numthreads; i++) {
            		t[i].join();
            	}
            }
            catch(InterruptedException e) {
            	System.err.println("thread is interrupted");
    			e.printStackTrace();
    			System.exit(1);
            }
	}
}