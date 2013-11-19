
public class Map {
	
	private int amountStage;		//Numbers of stage
	private int amountFL;			//Numbers of Firing lines
	private int amountTanks;
	private Stage stage[];          //Massive of Stage
	private FiringLine FL[];        //Massive of Firing Line
	private int PenaltyLaps;	    //Numbers of penalty laps		(m)
	private Tank tanks[];
         
		
	public Map(){
		PenaltyLaps = 0;
		amountStage = 0;
		amountTanks = 0;
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];
		tanks = new Tank[amountTanks];
	}
	
	public Map(int amountStage){
		this.amountStage = amountStage;
		this.amountFL = amountStage;
		this.stage = new Stage[amountStage];
		this.FL = new FiringLine[amountFL];	
		this.tanks = new Tank[amountTanks];
	}
	
	public void BeginningThisHell(){                                       //Initialization of Stage objects massive
		Judge judge = new Judge();                                 
		for (int itanks = 0; itanks < amountTanks; itanks++)
		{
			tanks[itanks] = new Tank();
		 for(int i = 0; i < amountStage; i++)
		  {
			stage[i] = new Stage();
			judge.MaxSpeedStage(tanks[itanks].GetSpeedMax(),
								stage[i].getPassability());
		  }
		 for(int i = 0; i < amountFL; i++)
		  {                                                           //   -//- FL obj mass
			FL[i] = new FiringLine();
		  }
		}
	}
//========================================================================	temp procedure
	public void Print_map()
	{
	 	for(int it = 0; it < amountTanks; it++)
	 	{
		System.out.println(tanks[it].getName());
	 	}
	 	for(int ix = 0; ix < amountStage; ix++)
	 	{
	 		System.out.println(stage[ix].getLenghtStage());
	 		System.out.println(FL[ix].GetMisses());
	 		
	 	}
	}
//========================================================================	
}
