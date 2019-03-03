import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class DateExtract{


public static void main (String [] args){
	String line = null;
	String link = args[0];
        try{
            BufferedReader filereader = new BufferedReader(new FileReader("Datasets/"+args[0]+'"'));
            int x = 0;
		PrintWriter writer = new PrintWriter(args[1], "UTF-8");
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");

		writer.println(lineinfo[0]);

	    }
		writer.close();
	}
        catch (Exception e){e.printStackTrace();}

}

}


