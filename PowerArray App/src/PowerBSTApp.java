import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Source of Binary Search Tree Code
//https://www.moreofless.co.uk/binary-search-tree-bst-java/
//Author- Steve Claridge 

public class PowerBSTApp{
	
	public static void main(String[] args){

	if (args.length!=0){
	if(args[0].equals("GetOpCountsFiles")){GetOpCountsFiles(args[1]);}}

        if(args.length!=0){
		if((args[0].equals("GetOpCountsFiles")!=true)){
			printDateTime (args[0]);}

}
else{ printAllDateTimes();}

}

	public static void printDateTime(String dateTime){
		BST muti = new BST();
		String line = null;
	try{
	
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		muti.put(lineinfo[0], lineinfo[1], lineinfo[3]);
	}
}
        catch (Exception e){ e.printStackTrace();}



	if (muti.get(dateTime)!=null){
	System.out.println(muti.get(dateTime));
	System.out.println(muti.root.getCount()+muti.getCount_two());
	}
	else{System.out.println("date and time not found");
	System.out.println(muti.root.getCount()+muti.getCount_two());}



}

public static void printAllDateTimes(){

		BST muti = new BST();
		String line = null;
	try{

            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int x = 0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		muti.put(lineinfo[0], lineinfo[1], lineinfo[3]);
		System.out.println(muti.get(lineinfo[0]));

	}
		//System.out.println(muti.root.getCount()+muti.getCount_two());
}
        catch (Exception e){ e.printStackTrace();}


}


public static void GetOpCountsFiles(String dateTime){

		BST muti = new BST();
		String line = null;
	try{
	
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		muti.put(lineinfo[0], lineinfo[1], lineinfo[3]);
	}
}
        catch (Exception e){ e.printStackTrace();}



	if (muti.get(dateTime)!=null){
	//System.out.println(muti.get(dateTime));
	System.out.println(muti.root.getCount()+muti.getCount_two());
	}
	else{System.out.println("date and time not found");
	System.out.println(muti.root.getCount()+muti.getCount_two());}


}



}
