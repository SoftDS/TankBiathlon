
public class FiringLine{
	private int Target;                     //number of targets
	private int Ammo;
	private int Misses; 			//number of misses
	
	public FiringLine(){
		Misses = 0;
		Target = 0;
		Ammo = Target + 1;
	}
	
	public FiringLine(int Misses, int Target){
		this.Misses = Misses;
		this.Target = Target;
	    Ammo = this.Target + 1;
	}
	public int GetTargets(){
	return Target;
	}
	
	public int GetMisses(){
		return Misses;
	}
}

