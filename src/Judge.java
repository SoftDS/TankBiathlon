
public class Judge {
	private TableResult Result = new TableResult();
	
	public double MaxSpeedStage (int MaxSpeed, double Passability)
	{
		return MaxSpeed * Passability;
	}
    public boolean CountHit (double ChanceHit) //Учесть время наведения
    { 
    	if (Math.random()<=ChanceHit)
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
