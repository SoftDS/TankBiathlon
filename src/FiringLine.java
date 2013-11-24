
public class FiringLine{
	private int Target;                     //number of targets
	private int Ammo;
	private int Misses; 			//number of misses
	
	public FiringLine(){
		setMisses(0);
		Target = 0;
		setAmmo(Target + 1);
	}
	
	public FiringLine(int Target){
		this.Target = Target;
		this.setMisses(0);
	    setAmmo(this.Target + 1);
	}
//	public FiringLine(int Misses, int Target){
//		this.Misses = Misses;
//		this.Target = Target;
//	    Ammo = this.Target + 1;
//	}
	public FiringLine(int i, String str[][]){
		//this.setMisses(0);
		this.Target = Integer.parseInt(str[i][4]);
		setAmmo(this.Target + 1);
	}

	public int getMisses() {
		return Misses;
	}

	public void setMisses(int misses) {
		Misses = misses;
	}

	public int getAmmo() {
		return Ammo;
	}

	public void setAmmo(int ammo) {
		Ammo = ammo;
	}
	public int getTarget() {
		return Target;
	}

	public void setTarget(int target) {
		Target = target;
	}
	
	public boolean Hit(boolean b) 		//1. штрафные круги дописать
	{ 
		for(int j=Ammo; j>0; j--)
		{           
		  if(b) //Если попал, то осталось на одну мишень меньше
		  {
			  Target--;
			   if(Target == 0)//если все цели сбиты
				   return true;			   
		  }	   
		}  
		return false; //если НЕ все цели сбиты
	}
}

