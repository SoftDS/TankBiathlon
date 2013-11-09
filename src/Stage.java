
public class Stage {
	private int lenghtStage;					//Длина этапа				(м)
	private int lengthPenaltyLoop;				//Длина штрафного круга		(м)
	private double passabilitySoil;				//Проходимость грунта		(0;1)
	private FiringLine FL;						//Огневой рубеж
	
	public Stage(){
		this.lenghtStage = -1;
		this.passabilitySoil = -1;
	}
	public Stage(int lenghtStage, int lengthPenaltyLoop, double passabilitySoil){
		this.lenghtStage = lenghtStage;
		this.lengthPenaltyLoop = lengthPenaltyLoop;
		this.passabilitySoil = passabilitySoil;
	}
	public int getLenghtStage(){
		return lenghtStage;
	}
	public int getLenghtPenaltyLoop(){
		return lengthPenaltyLoop;
	}
	public double getPassabilitySoil(){
		return passabilitySoil;
	}

}
