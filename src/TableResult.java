
public class TableResult{  //вообще не знаю зачем этот класс ??! =)
	
	//print table of results
	public void printTableResult()
	{
		System.out.println();
	}
	
//	public void CreateTable(String[][] str){
//		String CreateTable[][];
//		CreateTable = new String[amountTanks][amountStage+1];
//	}
	
	//public void AddTanksResult()
	
	public void printData(String[][] str){
		for(String []a: str)
		{
			for(String b: a)
				System.out.print(b + " ");
				System.out.println();
		}
	}
	
//	public void printError(int err)
//	{
//		if(err==-1)	System.out.println("File not found");
//	}
}
