import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Interface{
	
	String dataFromTheFile[][];
	private View view = new View();
	Scanner scn;
	
	private int CountNumberLines() 
	{
		int i;
		for(i = 0; scn.hasNextLine(); i++){
			scn.nextLine();
		}
		return i;
	}
	
	public void OpenFile(String filepath) 
	{
		try{
			scn = new Scanner(new File(filepath));
		}
		catch(Exception e){		
			view.printError(-1);
		}
		
	}
	
	public void ReadFile(int numberFields) 
	{
		dataFromTheFile = new String[CountNumberLines()][numberFields];
		for(int row = 0; row < CountNumberLines(); row++){
			for(int col = 0; col < numberFields; col++)
				dataFromTheFile[row][col] = scn.next();
		}
	}

}
