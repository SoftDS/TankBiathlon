
public class Stage {
	private int NStage;                         //#Stage
	private int LenghtStage;					//Length				(m)
	private double Passability;				//Passability		(0;1)
	
	
	public Stage(){
		this.LenghtStage = 0;
		this.Passability = 0.0;
	}
	
	public Stage(int LenghtStage, double Passability){
		this.LenghtStage = LenghtStage;
		this.Passability = Passability;
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
