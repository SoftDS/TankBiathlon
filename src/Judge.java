
public class Judge {
	private TableResult Result = new TableResult();
	
	public double MaxSpeedStage (int MaxSpeed, double Passability)
	{
		return MaxSpeed * Passability;
	}
    public boolean CountHit (double ChanceHit) //������ ����� ���������
    { 
    	if (Math.random()<=ChanceHit)
    		return true; 			
    	return false;	
    }
    
    public double TimeOnLap(double MaxSpeed, int LengthLap, int Acceleration)  //�������� ���������� �������
    {
    	return MaxSpeed * LengthLap * Acceleration;
    }
  //s=v0t+at^2/2    http://znanija.com/task/330035
  //�������� ������� �������
    //���������� � ������� �����������

}
