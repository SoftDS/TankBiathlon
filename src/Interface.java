import java.io.File;
import java.util.*;

public class Interface{
	
	private String str[][];
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
	
	public void ReadFile() //out of service !!
	{
		//CountNumberFields();
		//System.out.println(CountNumberFields());
		/*str[CountNumberLines()][10] = new String();
		for(int row = 0; row < CountNumberLines(); row++){
			for(int col = 0; col < 10; col++)
				str[row][col] = scn.next();
		}*/
	}

}
