
public class Tank {
	private String name;                         //country of tank
	private int acceleration; 					//value of accelerate 		(m\s^2)
	private int speedMax;						//limit of speed 		(m\s)
	private int timeAim;						//time to aim on target 	(s)
	private double chanceHit;					//hit rate (0;1)
	
	public Tank(){
		this.name = "Russian_partizans";
		this.acceleration = 0;
		this.speedMax = 0;
		this.timeAim = 0;
		this.chanceHit = 0.0;
	}
//	public Tank(String name, int acceleration, int speedMax, int timeAim, double chanceHit){
//		this.name = name;
//		this.acceleration = acceleration;
//		this.speedMax = speedMax;
//		this.timeAim = timeAim;
//		this.chanceHit = chanceHit;	
//	}
	public Tank(int IndexOfTank, String DataAboutTanks[][]){
		
		this.name = DataAboutTanks[IndexOfTank][0];
		this.acceleration = Integer.parseInt(DataAboutTanks[IndexOfTank][1]);
		this.speedMax = Integer.parseInt(DataAboutTanks[IndexOfTank][2]);
		this.timeAim = Integer.parseInt(DataAboutTanks[IndexOfTank][3]);
		this.chanceHit = Double.parseDouble(DataAboutTanks[IndexOfTank][4]);
	}
	public int GetAcceleration(){
		return acceleration;
	}
	public int GetSpeedMax(){
		return speedMax;
	}
	public int GetTimeAim(){
		return timeAim;
	}
	public double GetChanceHit(){
		return chanceHit;
	}
	public String getName(){
		return name;
	}	
}
