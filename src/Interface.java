import java.io.File;
import java.util.*;

public class Interface{
	
	private String str[][];
	private View view = new View();
	
	private int CountNumberLines(Scanner scn) //out of service!!!!!!
	{
		int i = 0;
		while(scn.hasNextLine())
		{
			i++;
		}
		
	return i;
	}
	
	public void OpenFile(String filepath) //out of service!!!!!!
	{
		try{
			Scanner scn = new Scanner(new File(filepath));
			int i = 0;
			/*while(scn.hasNextLine()){
				i++;
			}*/
			System.out.println(i);
		}
		catch(Exception e){		
			view.printError(-1);
			
		}
		
	}
	
	public void ReadFile()
	{
		//System.out.println(CountNumberLines());
	}

}
