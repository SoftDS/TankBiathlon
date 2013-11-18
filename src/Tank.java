
public class Tank {
	private String name;                         //country of tank
	private int acceleration; 					//value of accelerate 		(m\s^2)
	private int speedMax;						//limit of speed 		(m\s)
	private int timeAim;						//time to aim on target 	(s)
	private double chanceHit;					//hit rate (0;1)
	
	public Tank(){
		this.name = "Russian_partizans";
		this.acceleration = -1;
		this.speedMax = -1;
		this.timeAim = -1;
		this.chanceHit = -1;
	}
	public Tank(String name, int acceleration, int speedMax, int timeAim, double chanceHit){
		this.name = name;
		this.acceleration = acceleration;
		this.speedMax = speedMax;
		this.timeAim = timeAim;
		this.chanceHit = chanceHit;	
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
