package Aggregation;

public class AddDiv {
	public static void main(String args[])
	{
		Addition ob = new Addition();
		int d = ob.add(5, 5);
		if (d%10 == 0)
		{
			System.out.println("The result is divisible by 10");
		}
		else
		{
			System.out.println("The number is not divisible by 10");
			
		}
	}

}
