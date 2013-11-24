
public class TableResult{
	
	//print table of results
	public void printTableResult()
	{
		System.out.println();
	}
	
	public void CreateTable(int amountTanks,int amountStage){
		String CreateTable[][];
		CreateTable = new String[amountTanks][amountStage];
	}
	
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
