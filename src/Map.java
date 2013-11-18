
public class Map {
	
	private int amountStage;		//Numbers of stage
	private int amountFL;			//Numbers of Firing lines
	private Stage stage[];
	private FiringLine FL[];
	
	public Map(){
		
	}
	public Map(int amountStage){
		this.amountStage = amountStage;
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];
		
	}
	
	public void createStage(){
		
	}
	
}
