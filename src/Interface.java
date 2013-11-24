import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Interface{                   //class change to interface and read about it on http://kostin.ws/java/java-abstract-and-interfaces.html
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	Scanner scn;   //!!!!!!!!!!!!!!!!!!!!!!!
	String dataFromTheFile[][];  //!!!!!!!!!!!!!!!!!!!!!!!
	//private TableResult view = new TableResult();  //!!!!!!!!!!!!!!!!!!!!!1
	//private Map map = new Map();  А нахуя тут вообще карта? Почему Классы вызываются в интерфейсе, а не наоборот???!
                                    //сегодня разобрал этот класс подробно и понял что тут пиздец сколько переделывать) он же бесполезный)))	
	public static final String FILE_PATH1 = "res/DataAboutTanks.txt";
	public static final String FILE_PATH2 = "res/DataAboutStages.txt";
	
	public void Run()
	{
		OpenFile(FILE_PATH1, 6, 5); ///////////////Подсчет строк!!!!!!!!!!!!!!!!!!!!!!!!!!!
		OpenFile(FILE_PATH2, 3, 2);//В конструктор для ввода руками
									/*МИССИЯ НЕВЫПОЛНИМА*/
						
	}
	
	public void OpenFile(String filepath, int numberLines, int numberFields) 
	{
		try {
			scn = new Scanner(new File(filepath));
			ReadFile(numberLines, numberFields);
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}
	
	public void ReadFile(int numberLines, int numberFields) 
	{
		dataFromTheFile = new String[numberLines][numberFields];
		for(int row = 0; row < numberLines; row++){
			for(int col = 0; col < numberFields; col++){
				dataFromTheFile[row][col] = scn.next();
			}
		}
	}

}
