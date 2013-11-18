
public class Map {
	
	private int amountStage;		//Numbers of stage
	private int amountFL;			//Numbers of Firing lines
	private Stage stage[];          //Massive of Stage
	private FiringLine FL[];        //Massive of Firing Line
	private int PenaltyLaps;				    //Numbers of penalty laps		(m)
	
	public Map(){
		PenaltyLaps = 0;
		amountStage = 5;
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];		
	}
	
	public Map(int amountStage){
		this.amountStage = amountStage;
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];	
	}
	
	public void createStage(){                        //Initialization of Stage objects massive
		for(int i = 0; i < amountStage; i++)
		{
			stage[i] = new Stage();
		}
		for(int i = 0; i < amountFL; i++)
		{                                                           //   -//- FL obj mass
			FL[i] = new FiringLine();
		}
	}
//========================================================================	temp procedure
	public void Print_map()
	{
	 	for(int ix = 0; ix < amountStage; ix++)
	 		System.out.println(stage[ix]);
	}
//========================================================================	
}
