
public class Judge {
	
	public double MaxSpeedStage (int MaxSpeed, double Passability)
	{
		return MaxSpeed * Passability;
	}
    public boolean Hit (double ChanceHit){
    boolean HitTable[];
    HitTable = new boolean[10];
    ChanceHit= ChanceHit*10;
    	for (int i=0; i<ChanceHit; i++){
    		HitTable[i]= true;
    	}
    	int i = (int)(Math.random()*10); // вещественное число из [0;5) 
    	if (HitTable[i]==true)
    		return true; 			
    	return false;	
    }
    
}
