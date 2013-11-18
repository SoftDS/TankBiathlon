
public class Stage {
	private int LenghtStage;					//Length				(m)
	private double PassabilitySoil;				//Passability		(0;1)
	
	public Stage(){
		this.LenghtStage = 0;
		this.PassabilitySoil = 0.0;
	}
	
	public Stage(int LenghtStage, double PassabilitySoil){
		this.LenghtStage = LenghtStage;
		this.PassabilitySoil = PassabilitySoil;
	}
	public int getLenghtStage(){
		return LenghtStage;
	}
	
	public double getPassabilitySoil(){
		return PassabilitySoil;
	}

}
