
public class FiringLine{
	private int Target;                     //number of targets
	private int Ammo;
	private int Misses; 			//number of misses
	
	public FiringLine(){
		Misses = 5;
		Target = 0;
		Ammo = Target;
	}
	
	public FiringLine(int Misses, int Target){
		this.Misses = Misses;
		this.Target = Target;
	    Misses = Target;
	}
	public int GetTargets(){
	return Target;
	}
	
	public int GetMisses(){
		return Misses;
	}
}

