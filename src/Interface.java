import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Interface{                   //class change to interface and read about it on 
	//http://kostin.ws/java/java-abstract-and-interfaces.html
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	Scanner scn;   //!!!!!!!!!!!!!!!!!!!!!!!
	String dataFromTheFile[][];  //!!!!!!!!!!!!!!!!!!!!!!!
	//private TableResult view = new TableResult();
	//private Map map = new Map(); 
	
	public static final String FILE_PATH1 = "res/DataAboutTanks.txt";
	public static final String FILE_PATH2 = "res/DataAboutStages.txt";
	
	public String[][] Run(int a)
	{
		if(a==1)			////Номер 1 это первый ФАЙЛ!!
			return ReadFile(FILE_PATH1, 6, 5); 					///////////////Подсчет строк!!!!!!!!!!!!!!!!!!!!!!!!!!!
		else
			return ReadFile(FILE_PATH2, 3, 5);					//В конструктор для ввода руками		
	}
	
	public String[][] ReadFile(String filepath, int numberLines, int numberFields) 
	{
		try {
			scn = new Scanner(new File(filepath));
			dataFromTheFile = new String[numberLines][numberFields];
			for(int row = 0; row < numberLines; row++){
				for(int col = 0; col < numberFields; col++){
					dataFromTheFile[row][col] = scn.next();
				}
			}
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return dataFromTheFile;
	}
}

