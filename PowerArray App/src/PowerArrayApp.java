import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Takudzwa Shumbamhini
//5 March 2019
//PowerArrayApp
//PowerArrayApp to implement traditional arraySearch
public class PowerArrayApp {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length!=0){
		if((args[0].equals("GetOpCountsFiles")!=true)){
			printDateTime (args[0]);}
}
	if (args.length!=0){


if (args[0].equals("GetOpCountsFiles")){GetOpCountsFiles(args[1]);}}
        


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
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int Compcount_2=0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
                for (int i=0; i<lineinfo.length;i++){
                    MasterArray[y]=lineinfo[i];
                    y++;
                }               
            }
        
            for (int q =0;q<500;q++){
                int mult = 8*q;
                FinalArray[q+n]=MasterArray[8+mult];
                FinalArray[q+n+1]=MasterArray[9+mult];
                FinalArray[q+n+2]=MasterArray[11+mult];
                n=n+2;
            }

            for(int r=0;r<FinalArray.length;r++){
		Compcount_2++;
                if (dateTime.equals(FinalArray[r])) {
                    System.out.println(FinalArray[r]+" "+FinalArray[r+1]+" "+FinalArray[r+2]);
                    break;
                }
                
                else{
                    if(r==(FinalArray.length-1)){
			Compcount_2++;
                    System.out.println("date and time not found");
                    }
                }
            }
            System.out.println(Compcount_2);
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
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int Compcount_2=0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
                for (int i=0; i<lineinfo.length;i++){
                    MasterArray[y]=lineinfo[i];
                    y++;
                }               
            }
        
            for (int q =0;q<500;q++){
                int mult = 8*q;
                FinalArray[q+n]=MasterArray[8+mult];
                FinalArray[q+n+1]=MasterArray[9+mult];
                FinalArray[q+n+2]=MasterArray[11+mult];
                n=n+2;
            }

            for(int r=0;r<FinalArray.length;r++){
                if (r*3==1500){break;}else{
                    System.out.println(FinalArray[3*r]+" "+FinalArray[(r*3)+1]+" "+FinalArray[(r*3)+2]);}
                    
            }
        }
        catch (Exception e){e.printStackTrace(); }
 
  }  


public static void GetOpCountsFiles(String dateTime){

        String MasterArray[] = new String[4008];
        String FinalArray[] = new String[1500];

        String line = null;
        int y=0;
        int n=0;

        try{
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int Compcount_2=0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
                for (int i=0; i<lineinfo.length;i++){
                    MasterArray[y]=lineinfo[i];
                    y++;
                }               
            }
        
            for (int q =0;q<500;q++){
                int mult = 8*q;
                FinalArray[q+n]=MasterArray[8+mult];
                FinalArray[q+n+1]=MasterArray[9+mult];
                FinalArray[q+n+2]=MasterArray[11+mult];
                n=n+2;
            }

            for(int r=0;r<FinalArray.length;r++){
		Compcount_2++;
                if (dateTime.equals(FinalArray[r])) {
                    break;
                }
                
                else{
                    if(r==(FinalArray.length-1)){
			Compcount_2++;
                    System.out.println("date and time not found, okay");
                    }
                }
            }
            System.out.println(Compcount_2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    
    }

}








