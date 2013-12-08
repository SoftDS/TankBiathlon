//интерфейс для вывода на экран
public class InterfacePrint {
	
	public void printDataFromFile(String[][] AllDataFromFile){
		for(String []row: AllDataFromFile)
		{
			for(String column: row)
				System.out.print(column + " ");
				System.out.println();
		}
	}
}
