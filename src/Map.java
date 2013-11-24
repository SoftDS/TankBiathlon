
public class Map {
	
	private int amountStage;		//Numbers of stage
	private int amountFL;			//Numbers of Firing lines
	private int amountTanks;
	private Stage stage[];          //Massive of Stage
	private FiringLine FL[];        //Massive of Firing Line
	private Tank tanks[];
	Judge judge = new Judge();    
         
	
//	public Map(){
//		PenaltyLaps = 0;
//		amountStage = 3;
//		amountTanks = 5;
//		amountFL = amountStage;
//		stage = new Stage[amountStage];
//		FL = new FiringLine[amountFL];
//		tanks = new Tank[amountTanks];
//	}

	
	public Map(String str1[][], String str2[][]){
		this.amountStage = str2.length;
		this.amountFL = amountStage;
		this.amountTanks = str1.length;
		this.stage = new Stage[amountStage];
		this.FL = new FiringLine[amountFL];	
		this.tanks = new Tank[amountTanks];
	}
	
	public void BeginningThisHell(String str1[][], String str2[][]){  
		
		double MaxSpeed;
		int[] TimeMassive =new int [amountStage + 1];
		
		InitializationTank(str1);
		for (int itanks = 0; itanks < amountTanks; itanks++)
		{
			InitializationStage(str2);			//Для каждого танка этап заново готовится для езды
			InitializationFL(str2);				//Также
			//System.out.println("itanks: "+itanks);			
			for(int i = 0; i < amountStage; i++)
			  {
				MaxSpeed = judge.MaxSpeedStage(tanks[itanks].GetSpeedMax(), stage[i].getPassability());
/*Здесь нужно соханить время как 1ый танк на 1м этапе*/		TimeMassive[i]=judge.TimeOnLap(MaxSpeed, LengthLap, Acceleration);
				FL[i].Hit(judge.CountHit(tanks[itanks].GetChanceHit()));                            
				    if (FL[i].getTarget()>0)
					{
/*Здесь нужно добавить, если есть, штрафное время, к прошлому*/	TimeMassive[i] += judge.TimeOnLap(MaxSpeed, stage[i].PenaltyLaps(FL[i].getTarget()), tanks[itanks].GetAcceleration());				
					}
/*Сохранить время*/judge.SaveResult(tanks[itanks].getName(),TimeMassive[i]);
			  }
		}
	}

	public void InitializationTank(String str[][]){
		//this.amountTanks = str.length;
		for (int itanks = 0; itanks < amountTanks; itanks++){           //Initialization of Stage objects massive
			tanks[itanks] = new Tank(itanks, str);
		}
	}
	public void InitializationStage(String str[][]){
		//this.amountStage = str.length;
		 for(int i = 0; i < amountStage; i++){
			stage[i] = new Stage(i, str);
		 }	
	}
	public void InitializationFL(String str[][]){
		//this.amountFL = str.length;
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
	 		System.out.println(FL[ix].getTarget());
	 		
	 	}
	}
//========================================================================	
}
