
public class TankBiathlon {
	
	public static void main(String[] args){

	//=======================//
		//����� ������ ���������� ������ ��� ������ � String[][] str;
		//������ ���!!!!!!! str.length;
		TableResult table = new TableResult();
		Interface interf = new Interface();
		//table.printData(interf.Run(1));
		//table.printData(interf.Run(2));
		
		Map map = new Map(interf.Run(1), interf.Run(2));
		//map.InitializationTank(interf.Run(1));
		//map.InitializationStage(interf.Run(2));
		//map.InitializationFL(interf.Run(2));
		map.BeginningThisHell(interf.Run(1), interf.Run(2));
		//map.Print_map();

		
	
	}

}
