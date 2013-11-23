
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
	
	public void BeginningThisHell(){
           
		                                              
		Judge judge = new Judge();                                 
		for (int itanks = 0; itanks < amountTanks; itanks++)
		{
			 for(int i = 0; i < amountStage; i++)
			  {
				judge.MaxSpeedStage(tanks[itanks].GetSpeedMax(),
									stage[i].getPassability());
			  }
			 for(int i = 0; i < amountFL; i++)
			  {       
				 int Ammo=FL[i].getAmmo();
//				 int Misses=FL[i].getMisses();
				 int Target=FL[i].getTarget();  
				 for(int j=Ammo; j>0; j--)
				   {                         
				   if (judge.Hit(tanks[itanks].GetChanceHit()))
				        {
					    Target--;
				        }
//					   else
//					   {
//						Misses++;   
//					   }
			   
				   }  
				PenaltyLaps=Target;                        //- Снаряды, + промахи если не попал, - Мишени если попал, 
			  } 
		}
	}
	public void InitializationTank(String str[][]){
		for (int itanks = 0; itanks < amountTanks; itanks++){           //Initialization of Stage objects massive
			tanks[itanks] = new Tank(itanks, str);
		}
	}
	public void InitializationStage(String str[][]){
		 for(int i = 0; i < amountStage; i++){
			stage[i] = new Stage(i, str);
		 }	
	}
	public void InitializationFL(String str[][]){
		 for(int i = 0; i < amountFL; i++){                                                          
			FL[i] = new FiringLine(i, str);
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
//	 		System.out.println(FL[ix].GetMisses());
	 		
	 	}
	}
//========================================================================	
}
