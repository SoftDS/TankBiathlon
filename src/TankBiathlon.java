
public class TankBiathlon {
	
	public static final String FILE_PATH1 = "res/DataAboutTanks.txt";
	public static final String FILE_PATH2 = "res/DataAboutStages.txt";
	
	public static void main(String[] args){
		
		Map map = new Map();
		map.BeginningThisHell();
		map.Print_map();
	//=======================//
		Interface interf = new Interface();
		interf.OpenFile(FILE_PATH1);
		interf.ReadFile();
		interf.OpenFile(FILE_PATH2);
		interf.ReadFile();
	
	}

}
