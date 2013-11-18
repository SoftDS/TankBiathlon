
public class Distance {
	private int amountStage;					//Количество этапов
	private int amountFL = amountStage;         //Количество рубежей
	private Stage stage[];
	private FiringLine FL[];
	
	public Distance(){
		
	}
	public Distance(int amountStage){
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];
	}
	
	public void createStage(){
		
	}
	
}
