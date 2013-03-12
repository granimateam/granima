package tool;

public class Des {
	public static int simpleRoll(){
		long de = Math.round(Math.random()*10000000);
		de =1+ de%99; 
		return (int)de;
	}

	public static int openRoll()
	{
		int roll,result;
		result =0;
		int base = 88;
		
		do
		{
			roll=simpleRoll();
			base++;
			result+=roll;
		}
		while( roll>base);
		return result;
	}
	
	public static fullRoll()
	{
		int roll = 1;
		return roll;
	}
	
}
