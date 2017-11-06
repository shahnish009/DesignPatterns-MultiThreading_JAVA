/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nishant_shah_sean_annunciation_assign_4.src.wordTree.threadMgmt;

import nishant_shah_sean_annunciation_assign_4.src.wordTree.util.FileProcessor;
import nishant_shah_sean_annunciation_assign_4.src.wordTree.util.Node;
import nishant_shah_sean_annunciation_assign_4.src.wordTree.util.TreeBuilder;

/**
 *
 * @author annse
 */
public class PopulateThread implements Runnable{
    
    
        //private final Object threadobject;
        FileProcessor filepr;
        TreeBuilder tb=new TreeBuilder();
        
        
        public PopulateThread(FileProcessor filep){
            
            filepr=filep;
            
           
        }

    public  void run(){
        
        
        try{
            while(true)
            {
            //System.out.println(Thread.currentThread().getName());
            String word=filepr.readLine();
            System.out.println(Thread.currentThread().getName()+"###"+word);
            tb.insert(word);
            
            //split the input
            //insert into the tree
            }
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
		
        
		
		
	}
	
    
}
