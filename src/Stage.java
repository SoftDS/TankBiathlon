
public class Stage {
	private int lenghtStage;					//Length				(m)
	private int PenaltyLaps;				    //Numbers of penalty laps		(m)
	private double passabilitySoil;				//Passability		(0;1)
	
	public Stage(){
		this.lenghtStage = -1;
		this.passabilitySoil = -1;
	}
	public Stage(int lenghtStage, int PenaltyLaps, double passabilitySoil){
		this.lenghtStage = lenghtStage;
		this.PenaltyLaps = PenaltyLaps;
		this.passabilitySoil = passabilitySoil;
	}
	public int getLenghtStage(){
		return lenghtStage;
	}
	public int getLenghtPenaltyLoop(){
		return PenaltyLaps;
	}
	public double getPassabilitySoil(){
		return passabilitySoil;
	}

}
