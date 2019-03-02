import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class PowerArrayApp {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length!=0){
            printDateTime (args[0]);}
        else{
            printAllDateTimes();}
    }
    
    public static void printDateTime (String dateTime){
    
        String MasterArray[] = new String[4008];
        String FinalArray[] = new String[1500];

        String line = null;
        int y=0;
        int n=0;
        try{
            BufferedReader filereader = new BufferedReader(new FileReader("/home/s/shmtak004/Downloads/cleaned_data.csv"));
            int x = 0;
            int CompCount=0;

            while ((line = filereader.readLine())!=null){
		CompCount=CompCount+2;
                String [] lineinfo = line.split(",");
                for (int i=0; i<lineinfo.length;i++){
		CompCount++;
                    MasterArray[y]=lineinfo[i];
                    y++;
                }               
            }
        
            for (int q =0;q<500;q++){
		CompCount++;
                int mult = 8*q;
               
                
                FinalArray[q+n]=MasterArray[8+mult];

                FinalArray[q+n+1]=MasterArray[9+mult];

                FinalArray[q+n+2]=MasterArray[11+mult];

                n=n+2;

            }

            for(int r=0;r<FinalArray.length;r++){
                CompCount++;
                if (dateTime.equals(FinalArray[r])) {
                    System.out.println(FinalArray[r]+" "+FinalArray[r+1]+" "+FinalArray[r+2]);
                    break;
                }
                
                else{
                    if(r==(FinalArray.length-1)){
                        CompCount++;
                    System.out.println("date and time not found");
                    }
                }
            }
            System.out.println(CompCount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    
    }
    
  public static void printAllDateTimes(){
  
        String MasterArray[] = new String[4008];
        String FinalArray[] = new String[1500];

        String line = null;
        int y=0;
        int n=0;
        try{
            BufferedReader filereader = new BufferedReader(new FileReader("/home/s/shmtak004/Downloads/cleaned_data.csv"));
            int x = 0;
	    int CompCount=0;
            while ((line = filereader.readLine())!=null){
                CompCount=CompCount+2;
                String [] lineinfo = line.split(",");
                for (int i=0; i<lineinfo.length;i++){
                    CompCount++;
                    MasterArray[y]=lineinfo[i];
                    y++;
                }      
            }

            for (int q =0;q<500;q++){
                CompCount++;
                int mult = 8*q;
               
                
                FinalArray[q+n]=MasterArray[8+mult];

                FinalArray[q+n+1]=MasterArray[9+mult];

                FinalArray[q+n+2]=MasterArray[11+mult];
                n=n+2;

            }

            for(int r=0;r<FinalArray.length;r++){
                CompCount++;
                if (r*3==1500){break;}else{
                    System.out.println(FinalArray[3*r]+" "+FinalArray[(r*3)+1]+" "+FinalArray[(r*3)+2]);}
                    
            }
            System.out.println(CompCount);
        
        }
        catch (Exception e){
            e.printStackTrace();
        }
 
  }  
}
