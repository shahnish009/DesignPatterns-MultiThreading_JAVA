/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nishant_shah_sean_annunciation_assign_4.src.wordTree.driver.threadMgmt;

import nishant_shah_sean_annunciation_assign_4.src.wordTree.store.Results;
import nishant_shah_sean_annunciation_assign_4.src.wordTree.util.FileProcessor;

/**
 *
 * @author annse
 */
public class CreateWorkers {
    
    private String word;
    FileProcessor fpthread;
    Results rthread;
    int num_threads=0;

    
    
    public void CreateWorkers(FileProcessor filep,Results r,int numthreads ){
        
        fpthread=filep;
        rthread=r;
        num_threads=numthreads;
    }
    
   
	PopulateThread pt=new PopulateThread();
        DeleteThread dt=new DeleteThread();

	public void startPopulateThread(int numthreads){
		
		
                pt.run();
		
		
	}
	
	public void startdeleteThread(String delwords){
		
		
		
		dt.run();		
	}

    
}
