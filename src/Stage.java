
public class Stage {
	private int NStage;                         //#Stage
	private int LenghtStage;					//Length				(m)
	private double Passability;				//Passability		(0;1)
	private int LengthPenaltyLap;
	
	
	public Stage(){
		this.LenghtStage = 0;
		this.Passability = 0.0;
	}
	
	public Stage(int LenghtStage, double Passability){ 
		this.LenghtStage = LenghtStage;
		this.Passability = Passability;
}
	public Stage(int i, String str[][]){			//Прописать exception для ввода несоотв. данных
		this.NStage = Integer.parseInt(str[i][0]);
		this.LenghtStage = Integer.parseInt(str[i][1]);
		this.Passability = Double.parseDouble(str[i][2]);
		this.LengthPenaltyLap = Integer.parseInt(str[i][3]);
	}
	public int getLenghtStage(){
		return LenghtStage;
	}
	
	public double getPassability(){
		return Passability;
	}
	
	public int getNStage(){
		return NStage;
	}
	
}
