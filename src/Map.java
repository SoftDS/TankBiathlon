//this is Map
public class Map {
	
	private int amountStage;		//Количество этапов
	private int amountFL;			//Количество рубежей
	private Stage stage[];
	private FiringLine FL[];
	
	public Map(){
		
	}
	public Map(int amountStage){
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];
		
	}
	
	public void createStage(){
		
	}
	
}
