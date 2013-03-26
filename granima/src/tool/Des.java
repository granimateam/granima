package tool;

public class Des {
	public static int simpleRoll(){
		long de = Math.round(Math.random()*10000000);
		de =1+ de%99; 
		return (int)de;
	}

	public static int openRoll()
	{
		return openRoll(0, 90);
	}
	
	public static int openRoll(int score, int base)
	{
		
		int r = simpleRoll();
		int result = score + r;
		if(r<base)
			return result;
		else
		{
			System.out.println(r);
			return openRoll(result, base+1);
		}
			
	}
	
	public static int fullRoll()
	{
		int roll = simpleRoll();
		int result;
		if (roll <4)
		{
			result = roll-simpleRoll();
			if(roll==1)
				result -=15;
			if(roll==3)
				result +=15;
			return result;
		}
		if(roll>89)
			return openRoll(roll, 91);
		return roll;
		
	}
	
}
