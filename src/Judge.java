
public class Judge {
	private TableResult Result = new TableResult();
	
	public double MaxSpeedStage (int MaxSpeed, double Passability)
	{
		return MaxSpeed * Passability;
	}
    public boolean CountHit (double ChanceHit) //////Учесть время наведения
    {
	    boolean HitTable[];
	    HitTable = new boolean[10];
	    ChanceHit= ChanceHit*10;
	    	for (int i=0; i<ChanceHit; i++){
	    		HitTable[i]= true;
	    	}
	    	int i = (int)(Math.random()*10); // вещественное число из [0;5) 
	    	if (HitTable[i]==true)
	    		return true; 			
	    return false;	
    }
    
    public double TimeOnLap(double MaxSpeed, int LengthLap, int Acceleration)  //Дописать нормальную формулу
    {
    	return MaxSpeed * LengthLap * Acceleration;
    }
  //s=v0t+at^2/2    http://znanija.com/task/330035
  //Итоговый подсчет времени
    //Сохранение в таблице результатов

}
