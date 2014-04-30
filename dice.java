package mainPackage;
import java.util.Random;
public class dice {

	int value,newValue,total;

	Random random = new Random();

	public int Throw(int Bounces)
	{	
		total=Bounces;		
		do
		{
			newValue = random.nextInt(6)+1;
			value=value+newValue;
			Bounces--;		
		}while(Bounces>0);	

		newValue = value/total;		
		return newValue;
	}
	public int Throw()
	{
		newValue = random.nextInt(6)+1;
		return newValue;
	}
	public int Value()
	{
		value = newValue;
		return value;
	}
}
