/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nishant_shah_sean_annunciation_assign_4.src.wordTree.threadMgmt;

import nishant_shah_sean_annunciation_assign_4.src.wordTree.store.Results;
import nishant_shah_sean_annunciation_assign_4.src.wordTree.util.FileProcessor;

/**
 *
 * @author annse
 */
public class CreateWorkers {
    
    private String word=null;
    private FileProcessor fpthread=null;
    private Results rthread=null;
    int num_threads=0;

    
    public CreateWorkers(FileProcessor filep,Results r ){
        
        fpthread=filep;
        rthread=r;
        
       // num_threads=numthreads;
    }
           

	public void startPopulateWorkers(int numthreads){
		
           
            Thread t[]=new Thread[numthreads];
            for(int i=0;i<numthreads;i++)
            {
                t[i]=new Thread(new PopulateThread(fpthread));
                t[i].start();
               // System.out.println(t[i].currentThread().getName());
               
            }
            
            try{
            for(int i=0;i<numthreads;i++)
            {
                
                t[i].join();
                
            }
            }
            catch(Exception e)
            {e.printStackTrace();
            }
            
		
		
	}
	
	public void startdeleteWorkers(String delwords){
		
            
//            Thread t[]=new Thread[numthreads];
//            for(int i=0;i<numthreads;i++)
//            {
//                t[i]=new Thread(new DeleteThread());
//                t[i].start();
//                
//            }
//            try{
//            for(int i=0;i<numthreads;i++)
//            {
//                
//                t[i].join();
//                
//            }}
//            catch(Exception e)
//            {e.printStackTrace();
//            }
            	
	}

    
}
