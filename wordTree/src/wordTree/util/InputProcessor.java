package wordTree.util;

public class InputProcessor {
	
	
	public void split(String line) {
		   
        String temp[]=line.split(";");
        String dayno=temp[0];
        String itemval=temp[3];
        String dayvalues[]=dayno.split(":");
        String itemvalues[]=itemval.split(":");
        int dayno1=Integer.parseInt(dayvalues[1]);
        
        String itemno = itemvalues[1];
        
        
         tcount++;
         if(dayno1>dcount)
             {
                 dcount++; 
             }
          
          
          

   
    }


}
            
       
   
    
