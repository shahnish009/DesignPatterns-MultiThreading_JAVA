package wordTree.driver;

public class Driver {

	public static void main(String args[]){
		
        String inputfile="D:\\Courses\\Design Patterns\\input.txt";
        //String inputfile=args[0];
        FileReader fr=new FileReader(filename1);
        String outputfile="D:\\Courses\\Design Patterns\\output.txt";
        //String outputfile=args[1];
        //int debugval=Integer.parseInt(args[2]);
        int arglength=args.length;
        //MyLogger.setDebugValue(3);
        
        
        
//      if (debugval>4||debugval<0)
//      {
//          System.out.println("The Debug Values should be in the range of 0-4");
//          
//      }
      
      FileProcessor fp1=new FileProcessor(inputfile);
      Results r=new Results(outputfile);
      InputProcessor ip=new InputProcessor(apstate);
      apstate.setResult(r);
      BufferedReader br =new BufferedReader(fr);
      
//      if (arglength!=3){
//          System.out.println("Please enter only 3 arguments");
//      }
//      else{
//          if (debugval>4||debugval<0)
//      {
//          System.out.println("The Debug Values should be in the range of 0-4");
//          
//      }
//          else{
//              MyLogger.setDebugValue(debugval);
//              
//          }
      
String inputLine = null;
while((inputLine=fp1.readLine())!=null)
{
   String temp=inputLine;
        hp.split(temp);
	}
}
