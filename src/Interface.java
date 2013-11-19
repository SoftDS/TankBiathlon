import java.io.File;
import java.util.*;

public class Interface{
	
	private String str[][];
	private View view = new View();
	Scanner scn;
	
	private int CountNumberLines() //out of service!!!!!!
	{
		int i = 0;
		for(i=0; scn.hasNextLine(); i++) 
			scn.next();	
		return i;
	}
	
	public void OpenFile(String filepath) //out of service!!!!!!
	{
		try{
			scn = new Scanner(new File(filepath));
		}
		catch(Exception e){		
			view.printError(-1);
			
		}
		
	}
	
	public void ReadFile()
	{
		System.out.println(CountNumberLines());
	}

}
