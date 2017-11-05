/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nishant_shah_sean_annunciation_assign_4.src.wordTree.threadMgmt;

/**
 *
 * @author annse
 */
public class DeleteThread implements Runnable {
    
    
     private final Object threadobject;
        
        public DeleteThread(Object throbj){
            
            threadobject=throbj;
        }
    
     public  void run(){
         try{
            //decrement the count after deleting
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
		
		
		
	}
    
}
