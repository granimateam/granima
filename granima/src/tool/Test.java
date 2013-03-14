package tool;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = Des.fullRoll();
		int c = 0;
		while(i<600)
		{
			i = Des.fullRoll();
			c++;
		}
		System.out.println(i);
		System.out.println("--" +c);
	}

}
