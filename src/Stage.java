
public class Stage {
	private int NStage;						//#Stage
	private int LenghtStage;				//Length				(m)
	private double Passability;				//Passability		(0;1)
	private int LengthPenaltyLap;			//Penalty
	private int Target;						//number of targets
	private int Ammo;						//number of ammo
	
	
	public Stage(){
		this.LenghtStage = 0;
		this.Passability = 0.0;
	}
	
	public Stage(int LenghtStage, double Passability){ 
		this.LenghtStage = LenghtStage;
		this.Passability = Passability;
}
	public Stage(int i, String str[][]){			//��������� exception ��� ����� �������. ������
		this.NStage = Integer.parseInt(str[i][0]);
		this.LenghtStage = Integer.parseInt(str[i][1]);
		this.Passability = Double.parseDouble(str[i][2]);
		this.LengthPenaltyLap = Integer.parseInt(str[i][3]);
		this.Target = Integer.parseInt(str[i][4]);
		setAmmo(this.Target + 1);
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
	public int PenaltyLaps(int Penalty){	
		return LengthPenaltyLap*Penalty;	
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
	
	public boolean Hit(boolean b) 		//1. �������� ����� ��������
	{ 
		for(int j=Ammo; j>0; j--)
		{           
		  if(b) //���� �����, �� �������� �� ���� ������ ������
		  {
			  Target--;
			   if(Target == 0)//���� ��� ���� �����
				   return true;			   
		  }	   
		}  
		return false; //���� �� ��� ���� �����
	}
}
