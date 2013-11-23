import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Interface{
	
	Scanner scn;
	String dataFromTheFile[][];
	private View view = new View();
	
	public static final String FILE_PATH1 = "res/DataAboutTanks.txt";
	public static final String FILE_PATH2 = "res/DataAboutStages.txt";
	
	private int CountNumberLines() 
	{
		int i;
		for(i = 0; scn.hasNextLine(); i++){
			scn.nextLine();
		}
		return i;
	}
	public void Run()
	{
		OpenFile(FILE_PATH1, 5);
		OpenFile(FILE_PATH2, 2);
	}
	
	public void OpenFile(String filepath, int numberFields) 
	{
		try {
			scn = new Scanner(new File(filepath));
			//int numberLines = CountNumberLines();
			ReadFile(numberFields, CountNumberLines());
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		
	}
	
	public void ReadFile(int numberFields, int numberLines) 
	{
		dataFromTheFile = new String[numberLines][numberFields];
		System.out.println(numberFields + " " + numberLines);
		for(int row = 0; row < numberLines; row++){
			for(int col = 0; col < numberFields; col++){
				dataFromTheFile[row][col] = scn.next();
				System.out.println("Hello");
			}
		}
	}

}
